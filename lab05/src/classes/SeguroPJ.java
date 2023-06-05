package classes;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeguroPJ extends Seguro{
	private Frota frota;
	private ClientePJ clientePJ;
	
	//metodo construtor
	public SeguroPJ(Date dataInicio, Date dataFim, Seguradora seguradora, Frota frota, ClientePJ clientePJ) {
		super(dataInicio, dataFim, seguradora);
		this.frota = frota;
		this.clientePJ = clientePJ;
	}

	public Frota getFrota() {
		return frota;
	}

	public void setFrota(Frota frota) {
		this.frota = frota;
	}

	public Cliente getClientePJ() {
		return clientePJ;
	}

	public void setClientePJ(ClientePJ clientePJ) {
		this.clientePJ = clientePJ;
	}
	
	
	//adiciona condutor
	public boolean autorizarCondutor(Condutor condutor){
		for (Condutor condutor1 : this.getListaCondutor()) {
			if (condutor1.getCpf().equals(condutor.getCpf())) {
				return false;
			}
		}
		this.getListaCondutor().add(condutor);
		return true;
	}
	
	//remove condutor
	public boolean desautorizarCondutor(Condutor condutor){
		if(!(this.getListaCondutor()).contains(condutor)) {
			return false;
		}
		else {
			this.getListaCondutor().remove(condutor);
			return true;
		}
	}
	
	//gera o sinistro
	public void gerarSinistro(Date data, String endereco){
		Sinistro sinistro1 = new Sinistro(data, endereco, null, this);
		this.getListaSinistros().add(sinistro1);
		//condutor.getListaSinistros().add(sinistro1);
	}
	
	//retorna lista de sinistro por cliente (sinistros do objeto seguro)
	public List<Sinistro> getListaSinistroPorCliente(){
		return this.getListaSinistros();
	}
	
	//retorna lista de sinistro por condutor
	public List<Sinistro> getListaSinistroPorCondutor(){
		List <Sinistro> sinistroPorCondutor = new ArrayList<>();
		for (Condutor condutor1 : this.getListaCondutor()) {
			for(Sinistro sinistro1 : condutor1.getListaSinistros()) 
			sinistroPorCondutor.add(sinistro1);
		}
		return sinistroPorCondutor;
	}
	
	//calcula o valor mensal do sinistro
	public void calcularValor(){
		Date currDate = Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant());
		long idade = (TimeUnit.DAYS.convert(Math.abs(currDate.getTime() - this.clientePJ.getDataFundacao().getTime()), TimeUnit.MILLISECONDS))/365;
		int qtdeVeiculos = 0;
		for (int i = 0; i < this.clientePJ.getListaFrota().size(); i++) {
			qtdeVeiculos = qtdeVeiculos +  this.clientePJ.getListaFrota().get(i).getListaVeiculos().size();;
		}
		
		Double valor = CalcSeguro.VALOR_BASE.getValor()
				*(10+this.clientePJ.getQtdeFuncionario()*0.1)
				*(1+1/(qtdeVeiculos+2))
				*(1+1/(idade+2))
				*(2+this.getListaSinistroPorCliente().size()*0.1)
				*(5+this.getListaSinistroPorCondutor().size()*0.1);
		this.setValorMensal(valor);
	}

	@Override
	public String toString() {
		return "SeguroPJ [frota=" + frota + ", clientePJ=" + clientePJ + ", toString()=" + super.toString() + "]";
	}
		
	
	
	
	
}

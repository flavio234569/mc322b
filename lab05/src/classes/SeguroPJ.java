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

	public SeguroPJ(Date dataInicio, Date dataFim, Seguradora seguradora, Frota frota, ClientePJ clientePJ) {
	//public SeguroPJ(String dataInicio, String dataFim, Seguradora seguradora, Double valorMensal, Frota frota, ClientePJ clientePJ) {

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
	
	

	public boolean autorizarCondutor(Condutor condutor){
		
		for (Condutor condutor1 : this.getListaCondutor()) {
			if (condutor1.getCpf().equals(condutor.getCpf())) {
				return false;
			}
		}
		
		this.getListaCondutor().add(condutor);
		return true;
	}
	
	public boolean desautorizarCondutor(Condutor condutor){
		if(!(this.getListaCondutor()).contains(condutor)) {
			return false;
		}
		else {
			this.getListaCondutor().remove(condutor);
			return true;
		}
	}
	
	public void gerarSinistro(Date data, String endereco, Condutor condutor){
		Sinistro sinistro1 = new Sinistro(data, endereco, condutor, this);
		this.getListaSinistros().add(sinistro1);
		condutor.getListaSinistros().add(sinistro1);
	}
	

	
	public void calcularValor(){
		Date currDate = Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant());
		long idade = (TimeUnit.DAYS.convert(Math.abs(currDate.getTime() - this.clientePJ.getDataFundacao().getTime()), TimeUnit.MILLISECONDS))/365;
		
		Double valor = CalcSeguro.VALOR_BASE.getValor()
				*(10+this.clientePJ.getQtdeFuncionario()*0.1)
				*(1+1/(this.clientePJ.getListaFrota().size()+2))
				*(1+1/(idade+2))
				*(2+this.getListaSinistros().size()*0.1)
				*(5+this.getListaSinistros().size()*0.1);
		this.setValorMensal(valor);
	}

	@Override
	public String toString() {
		return "SeguroPJ [frota=" + frota + ", clientePJ=" + clientePJ + ", toString()=" + super.toString() + "]";
	}
		
	
	
	
	
}

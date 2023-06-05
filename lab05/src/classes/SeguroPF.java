package classes;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeguroPF extends Seguro{

	private Veiculo veiculo;
	private ClientePF clientePF;

	public SeguroPF(Date dataInicio, Date dataFim, Seguradora seguradora, Veiculo veiculo,
			ClientePF clientePF) {
//	public SeguroPF(String dataInicio, String dataFim, Seguradora seguradora, Double valorMensal, Veiculo veiculo,
//				ClientePF clientePF) {
		super(dataInicio, dataFim, seguradora);
		this.veiculo = veiculo;
		this.clientePF = clientePF;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Cliente getClientePF() {
		return clientePF;
	}

	public void setClientePF(ClientePF clientePF) {
		this.clientePF = clientePF;
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
	
	public void gerarSinistro(Date data, String endereco){
		Sinistro sinistro1 = new Sinistro(data, endereco, null, this);
		this.getListaSinistros().add(sinistro1);
		//condutor.adicionarSinistro(sinistro1);
	}
	
	public List<Sinistro> getListaSinistroPorCliente(){

		return this.getListaSinistros();
		
//		List <Sinistro> sinistroPorCliente = new ArrayList<>() ;
//		
//		
//		for (Sinistro sinistro1 : this.getListaSinistros()) {
//			if (this.clientePF.getCpf().equals(sinistro1.getCondutor().getCpf())) {
//				sinistroPorCliente.add(sinistro1);
//			}
//		}
//		return sinistroPorCliente;
	}
	
	public List<Sinistro> getListaSinistroPorCondutor(){
		List <Sinistro> sinistroPorCondutor = new ArrayList<>();
		for (Condutor condutor1 : this.getListaCondutor()) {
			for(Sinistro sinistro1 : condutor1.getListaSinistros()) 
			sinistroPorCondutor.add(sinistro1);
		}
		return sinistroPorCondutor;
	}
	
	
	public void calcularValor(){
		Date currDate = Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant());
		long idade = (TimeUnit.DAYS.convert(Math.abs(currDate.getTime() - this.clientePF.getDataNascimento().getTime()), TimeUnit.MILLISECONDS))/365;

		if (idade < 30) {
			Double valor = CalcSeguro.VALOR_BASE.getValor()*CalcSeguro.FATOR_18_30.getValor()*(2 + this.getListaSinistroPorCliente().size()*0.1)*(5 + this.getListaSinistroPorCondutor().size()); 
			this.setValorMensal(valor);
		}
		
		if ((idade >= 30) && (idade <= 60)) {
			Double valor = CalcSeguro.VALOR_BASE.getValor()*CalcSeguro.FATOR_30_60.getValor()*(2 + this.getListaSinistroPorCliente().size()*0.1)*(5 + this.getListaSinistroPorCondutor().size()); 
			this.setValorMensal(valor);
		}
		
		if (idade > 60) {
			Double valor = CalcSeguro.VALOR_BASE.getValor()*CalcSeguro.FATOR_60_90.getValor()*(2 + this.getListaSinistroPorCliente().size()*0.1)*(5 + this.getListaSinistroPorCondutor().size()); 
			this.setValorMensal(valor);
		}
		
	}

	@Override
	public String toString() {
		return "SeguroPF [veiculo=" + veiculo.getPlaca() + ", clientePF=" + clientePF + ", getId()=" + getId()
				+ ", getSeguradora()=" + getSeguradora() 
				+ ", getListaSinistros()=" + getListaSinistros()
				+ ", getListaCondutor()=" + getListaCondutor() + ", getValorMensal()=" + getValorMensal() + "]"
				
				;
	}
	
//	( VALOR_BASE * FATOR_IDADE * (1 + 1/( quantidadeVeiculos +2) ) *
//			2 (2 + quantidadeSinistrosCliente /10) *
//			3 (5 + quantidadeSinistrosCondutor /10) )

//	@Override
//	public String toString() {
//		return "SeguroPF [veiculo=" + veiculo + ", clientePF=" + clientePF; //+ ", toString()=" + super.toString() + "]";
//	}
	
	
	
	
	
	
	
	
	
}

package classes;

import java.util.Date;

public class SeguroPF extends Seguro{

	private Veiculo veiculo;
	private Cliente clientePF;

	public SeguroPF(int id, Date dataInicio, Date dataFim, Seguradora seguradora, int valorMensal, Veiculo veiculo,
			Cliente clientePF) {
		super(id, dataInicio, dataFim, seguradora, valorMensal);
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

	public void setClientePF(Cliente clientePF) {
		this.clientePF = clientePF;
	}
	
	public boolean autorizarCondutor(){
		return false;
	}
	
	public boolean desautorizarCondutor(){
		return false;
	}
	
	public void gerarSinistro(){
	}
	
	public void calcularValor(){
	}

	@Override
	public String toString() {
		return "SeguroPF [veiculo=" + veiculo + ", clientePF=" + clientePF + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
	
	
	
}

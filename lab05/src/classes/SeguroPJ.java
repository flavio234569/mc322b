package classes;

import java.util.Date;

public class SeguroPJ extends Seguro{
	private Frota frota;
	private Cliente clientePJ;

	public SeguroPJ(int id, Date dataInicio, Date dataFim, Seguradora seguradora, int valorMensal, Frota frota,
			Cliente clientePJ) {
		super(id, dataInicio, dataFim, seguradora, valorMensal);
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

	public void setClientePJ(Cliente clientePJ) {
		this.clientePJ = clientePJ;
	}
	
	

	public boolean autorizarCondutor(Condutor condutor){
		
		this.getListaCondutor().add(condutor);
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
		return "SeguroPJ [frota=" + frota + ", clientePJ=" + clientePJ + ", toString()=" + super.toString() + "]";
	}
		
	
	
	
	
}

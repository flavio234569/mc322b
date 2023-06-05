package classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Seguro {

	private static int contador = 300;
	private final int id;
	private Date dataInicio;
	private Date dataFim;
	
	private Seguradora seguradora;
	private List<Sinistro> listaSinistros;
	private List<Condutor> listaCondutor;
	private Double valorMensal;
	
	//metodo construtor
	public Seguro(Date dataInicio, Date dataFim, Seguradora seguradora) {
		contador++;
		this.id = contador;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.seguradora = seguradora;
		this.listaSinistros = new ArrayList<Sinistro>();
		this.listaCondutor = new ArrayList<Condutor>();
	}

	//metodos getters e setters
	public static int getContador() {
		return contador;
	}


	public static void setContador(int contador) {
		Seguro.contador = contador;
	}


	public int getId() {
		return id;
	}

	public Seguradora getSeguradora() {
		return this.seguradora;
	}

	public void setSeguradora(Seguradora seguradora) {
		this.seguradora = seguradora;
	}

	public List<Sinistro> getListaSinistros() {
		return listaSinistros;
	}

	public List<Condutor> getListaCondutor() {
		return listaCondutor;
	}

	public Double getValorMensal() {
		return valorMensal;
	}

	public void setValorMensal(Double valorMensal) {
		this.valorMensal = valorMensal;
	}
	
	public boolean autorizarCondutor() {
		return false;
		
	}
	
	public boolean desautorizarCondutor() {
		return false;
		
	}
	
	public void calcularValor() {
		
	}
	
	public void gerarSinistro() {
		
	}

	@Override
	public String toString() {
		return "Seguro [id=" + id + ", dataInicio=" + dataInicio + ", dataFim=" + dataFim //+ ", seguradora=" + seguradora
				+ ", listaSinistros=" + listaSinistros + ", listaCondutor=" + listaCondutor + ", valorMensal="
				+ valorMensal + "]";
	}	
}

package classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Seguro {

	private static int contador = 300;
	private final int id;
	private Date dataInicio;
	private Date dataFim;
	
//	private String dataInicio = null;
//	private String dataFim = null;
	private Seguradora seguradora;
	private List<Sinistro> listaSinistros;
	private List<Condutor> listaCondutor;
	private Double valorMensal;
	
	
	public Seguro(Date dataInicio, Date dataFim, Seguradora seguradora) {
	//public Seguro(String dataInicio, String dataFim, Seguradora seguradora, Double valorMensal) {
		
		contador++;
		this.id = contador;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.seguradora = seguradora;
		this.listaSinistros = new ArrayList<Sinistro>();
		this.listaCondutor = new ArrayList<Condutor>();
		//this.valorMensal = valorMensal;
	}


	public static int getContador() {
		return contador;
	}


	public static void setContador(int contador) {
		Seguro.contador = contador;
	}


	public int getId() {
		return id;
	}


//	public void setId(int id) {
//		this.id = id;
//	}


//	public Date getDataInicio() {
//		return dataInicio;
//	}


//	public void setDataInicio(Date dataInicio) {
//		this.dataInicio = dataInicio;
//	}


//	public Date getDataFim() {
//		return dataFim;
//	}


//	public void setDataFim(Date dataFim) {
//		this.dataFim = dataFim;
//	}


	public Seguradora getSeguradora() {
		return this.seguradora;
	}


	public void setSeguradora(Seguradora seguradora) {
		this.seguradora = seguradora;
	}


	public List<Sinistro> getListaSinistros() {
		return listaSinistros;
	}


//	public void setListaSinistros(List<Sinistro> listaSinistros) {
//		this.listaSinistros = listaSinistros;
//	}


	public List<Condutor> getListaCondutor() {
		return listaCondutor;
	}


//	public void setListaCondutor(List<Condutor> listaCondutor) {
//		this.listaCondutor = listaCondutor;
//	}


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




	
	
	

//	@Override
//	public String toString() {
//		return "Seguro [id=" + id + ", dataInicio=" + dataInicio + ", dataFim=" + dataFim + ", seguradora=" + seguradora
//				+ ", listaSinistros=" + listaSinistros + ", listaCondutor=" + listaCondutor + ", valorMensal="
//				+ valorMensal + "]";
//	}
	
	
	
	
	
}
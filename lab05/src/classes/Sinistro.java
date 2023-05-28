package classes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Sinistro {
	private static SimpleDateFormat formatadata = new SimpleDateFormat("dd/MM/yyyy");
	private static int contador = 200;
	private int id = 0;
	private Date data;
	private String endereco;
	private Condutor condutor;
	private Seguro seguro;
	
	
//	private Seguradora seguradora;
//	private Veiculo veiculo;
//	private Cliente cliente;
	

	
	//metodo construtor
//	public Sinistro( Date data, String endereco, Seguradora seguradora, Veiculo veiculo, Cliente cliente) {
//		contador++;
//		this.id = contador;
//		this.data = data;
//		this.endereco = endereco;
//		this.seguradora = seguradora;
//		this.veiculo = veiculo;
//		this.cliente = cliente;
//		
//	}
	
	public Sinistro(Date data, String endereco, Condutor condutor, Seguro seguro) {
	
	contador++;
	this.id = contador;
	this.data = data;
	this.endereco = endereco;
	this.condutor = condutor;
	this.seguro = seguro;
	}

	//metodos getters e setters
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public Condutor getCondutor() {
		return condutor;
	}


	public void setCondutor(Condutor condutor) {
		this.condutor = condutor;
	}


	public Seguro getSeguro() {
		return seguro;
	}


	public void setSeguro(Seguro seguro) {
		this.seguro = seguro;
	}

	@Override
	public String toString() {
		return "Sinistro [id=" + id + ", data=" + data + ", endereco=" + endereco + ", condutor=" + condutor
				+ ", seguro=" + seguro + "]";
	}
	

}

package classes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Sinistro {
	private static SimpleDateFormat formatadata = new SimpleDateFormat("dd/MM/yyyy");
	private static int contador = 200;
	private int id = 0;
	private Date data;
	private String endereco;
	
	private Seguradora seguradora;
	private Veiculo veiculo;
	private Cliente cliente;
	

	
	//metodo construtor
	public Sinistro( Date data, String endereco, Seguradora seguradora, Veiculo veiculo, Cliente cliente) {
		contador++;
		this.id = contador;
		this.data = data;
		this.endereco = endereco;
		this.seguradora = seguradora;
		this.veiculo = veiculo;
		this.cliente = cliente;
		
	}

	//metodos getters e setters
	public int getId() {
		return id;
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

	public Seguradora getSeguradora() {
		return seguradora;
	}

	public void setSeguradora(Seguradora seguradora) {
		this.seguradora = seguradora;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
	
	//metodo tostring (traz todos os dados para uma string legivel)	
	public String toString() {
		String tostr = 
					  "\nSinistro id: " + this.getId() + "\n"
					+ "Data: " + formatadata.format(this.getData()) + "\n"
					+ "Local: " + this.getEndereco() + "\n"
					+ "Seguradora: " + this.getSeguradora().getNome() + "\n"
					+ "Placa do veiculo: " + this.getVeiculo().getPlaca() + "\n"
					+ "Cliente: " + this.getCliente().getNome() + "\n";
		return tostr;
				
	}
}

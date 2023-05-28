package classes;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;



public abstract class Cliente {
	//protected static SimpleDateFormat formatadata = new SimpleDateFormat("dd/MM/yyyy");
	private String nome;
	private String telefone;
	private String endereco;
	private String email;
	
//	private ArrayList<Veiculo> listaVeiculos;
//	private double valorSeguro;
	
	//metodo construtor
	public Cliente(String nome, String telefone,String endereco, String email) { //, double valorSeguro){  // , List<Veiculo> listaVeiculos) { //String cpf, String dataNascimento, int idade, 
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.email = email;
		
	}
	
	//metodos getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



//	public List<Veiculo> getListaVeiculos() {
//		return listaVeiculos;
//	}
//	
//	public void adicionaVeiculo(Veiculo veiculo) {
//		this.listaVeiculos.add(veiculo); // = listaVeiculos;
//	}
//	
//	public double getValorSeguro() {
//		return valorSeguro;
//	}
//
//	public void setValorSeguro(double valorSeguro) {
//		this.valorSeguro = valorSeguro;
//	}

//
//	
//	public double calculaScore() {
//		return 0;
//		
//	}
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", telefone=" + telefone + ", endereco=" + endereco + ", email=" + email + "]";
	}
	
	


	//metodo tostring (traz todos os dados para uma string legivel)
//	public String toString() {
//		String tostr = "\nDados do cliente \n"  
//					+  "Nome cliente: " + this.getNome() + "\n"
//					+ "Endereco cliente: " + this.getEndereco() + "\n"
//					//+ "Data licenca: " + formatadata.format( this.getDataLicenca()) + "\n"
//					//+ "Escolaridade: " + this.getEducacao() + "\n"
//					//+ "Genero: " + this.getGenero() + "\n"
//					//+ "Classe economica: " + this.getClasseEconomica() + "\n"
//					+ "Seguro: " + this.getValorSeguro() + "\n"
//					+ "Lista Veiculo placas: " + this.getListaVeiculos().stream().map(Veiculo::getPlaca).collect(Collectors.toList());
//
//		return tostr;
//		
//	}
	
	

}

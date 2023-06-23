package classes;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;



public abstract class Cliente {
	private String nome;
	private String telefone;
	private String endereco;
	private String email;
	
	
	//metodo construtor, classe abstrata
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


	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", telefone=" + telefone + ", endereco=" + endereco + ", email=" + email + "]";
	}
	

	

}

package classes;

import java.util.ArrayList;
import java.util.List;

public class Seguradora {
	private String nome;
	private String telefone;
	private String email;
	private String endereco;
	
	private List<Sinistro> listaSinistros;
	private List<Cliente> listaClientes;
	
	//metodo construtor
	public Seguradora (String nome, String telefone, String email, String endereco) {
			//List<Sinistro> listaSinistros, List<Cliente> listaClientes) {
		this.nome =nome;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
		this.listaSinistros = new ArrayList<Sinistro>();
		this.listaClientes = new ArrayList<Cliente>(); 
	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public List<Sinistro> getListaSinistros() {
		return listaSinistros;
	}


	public void setListaSinistros(List<Sinistro> listaSinistros) {
		this.listaSinistros = listaSinistros;
	}


	public List<Cliente> getListaClientes() {
		return listaClientes;
	}


	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public boolean cadastrarCliente(Cliente cliente) {
		
		
		
		return true;
		
	}
	
	
	
	
	
	
	
	//metodo tostring (traz todos os dados para uma string legivel)
	public String toString() {
		String tostr = "Dados da seguradora \n"  
					+  "O nome da seguradora e: " + this.getNome() + "\n"
					+ "O telefone da seguradora e: " + this.getTelefone() + "\n"
					+ "O e-mail da seguradora e: " + this.getEmail() + "\n"
					+ "O endereco da seguradora e: " + this.getEndereco() + "\n"
					+ "A lista de sinistros e: " + this.getListaSinistros() + "\n"
					+ "A lista de clientes e: " + this.getListaClientes();
		
		return tostr;
				
	}
}

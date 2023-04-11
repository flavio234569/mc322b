package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

	
	public boolean gerarSinistro(String data, String endereco, Seguradora seguradora, Veiculo veiculo, Cliente cliente, Sinistro sinistro) {
		
		sinistro = new Sinistro(data, endereco, seguradora, veiculo, cliente);
		
		this.listaSinistros.add(sinistro);
		//this.listaClientes.add(cliente);
		return true;
	}


	public List<Cliente> getListaClientes() {
		return listaClientes;
	}


//	public void setListaClientes(List<Cliente> listaClientes) {
//		this.listaClientes = listaClientes;
//	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public boolean cadastrarCliente(Cliente cliente) {
		if (this.listaClientes.contains(cliente)) {
			return false;
		}
		else {
			this.listaClientes.add(cliente);
			return true;
		}
		
	}
	
	public boolean removerCliente(Cliente cliente) {
		if (this.listaClientes.contains(cliente)) {	
			this.listaClientes.remove(cliente);
		return true;
		}
		else {
			return false;
		}
	}
	
	public void visualizarSinistro(String nomeCliente) {
		for (Sinistro sinistro : this.getListaSinistros()) {
			if (sinistro.getCliente().getNome().contains(nomeCliente)){
				System.out.print(sinistro.toString());
			}
		}
		//return ;
	}
	
	
	
	
	
	
	//metodo tostring (traz todos os dados para uma string legivel)
	public String toString() {
		String tostr = "\nDados da seguradora \n"  
					+  "Nome da seguradora: " + this.getNome() + "\n"
					+ "Telefone da seguradora: " + this.getTelefone() + "\n"
					+ "E-mail da seguradora: " + this.getEmail() + "\n"
					+ "Endereco da seguradora: " + this.getEndereco() + "\n"
					+ "Lista de sinistros por id: " + this.getListaSinistros().stream().map(Sinistro::getId).collect(Collectors.toList()) + "\n"
					+ "A lista de clientes: " + this.getListaClientes().stream().map(Cliente::getNome).collect(Collectors.toList()) + "\n";
		
		return tostr;
				
	}
}

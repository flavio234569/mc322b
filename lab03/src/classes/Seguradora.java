package classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
	
	public List<Cliente> getListaClientes() {
		return listaClientes;
	}
	
	public boolean gerarSinistro(Date data, String endereco, Veiculo veiculo, Cliente cliente) {
		
		Sinistro sinistro = new Sinistro(data, endereco, this, veiculo, cliente);
		
		for (Sinistro elemento_lista_sinistro : this.getListaSinistros()) {
			if (elemento_lista_sinistro.getData().equals(sinistro.getData())
			&& (elemento_lista_sinistro.getEndereco().equals(sinistro.getEndereco())
			&& (elemento_lista_sinistro.getVeiculo().equals(sinistro.getVeiculo())
			&& (elemento_lista_sinistro.getCliente().equals(sinistro.getCliente())		)))) {
				return false;
			}
		}
		this.listaSinistros.add(sinistro);
		return true;
		
	
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
	
	
	
	public boolean removerCliente(String cpfcnpj) {
		for (Cliente cliente : this.getListaClientes()) {
			if (cliente instanceof ClientePF) {
				if(((ClientePF) cliente).getCpf().replaceAll("\\.", "").replaceAll("-", "").equals(cpfcnpj.replaceAll("\\.", "").replaceAll("-", ""))) {
					this.listaClientes.remove(cliente);
					return true;
				}			
			}
			else if (cliente instanceof ClientePJ) {
				if(((ClientePJ) cliente).getCnpj().replaceAll("\\.", "").replaceAll("-", "").replaceAll("/", "").equals(cpfcnpj.replaceAll("\\.", "").replaceAll("-", "").replaceAll("/", ""))) {
					this.listaClientes.remove(cliente);
					return true;
				}	
			}
			else {
				return false;
			}
		}
	return false;
	}
	
	public List<String> listarSinistros() {
		
		return this.getListaSinistros().stream().map(Sinistro::getCliente).collect(Collectors.toList()).stream().map(Cliente::getNome).collect(Collectors.toList());
		
		}
	
	public void visualizarSinistro(String nomeCliente) {
		for (Sinistro sinistro : this.getListaSinistros()) {
			if (sinistro.getCliente().getNome().equals(nomeCliente)){
				System.out.print(sinistro.toString());
			}
		}
	}
	
	
	public List<String> listarClientes(String tipoCliente) {
		List<Cliente> listaCliente = new ArrayList<Cliente>();
		for (Cliente cliente : this.getListaClientes()) {
			if (tipoCliente == "PJ") {
				if (cliente instanceof ClientePJ) {
					//System.out.println(cliente.getNome());
					listaCliente.add(cliente);
				}
			}

			else if(tipoCliente == "PF"){
				if (cliente instanceof ClientePF) {
					//System.out.println(cliente.getNome());
					listaCliente.add(cliente);
				}
			}

		}
		return listaCliente.stream().map(Cliente::getNome).collect(Collectors.toList());
	}
	
	
	//metodo tostring (traz todos os dados para uma string legivel)
	public String toString() {
		String tostr = "\nDados da seguradora \n"  
					+  "Nome da seguradora: " + this.getNome() + "\n"
					+ "Telefone da seguradora: " + this.getTelefone() + "\n"
					+ "E-mail da seguradora: " + this.getEmail() + "\n"
					+ "Endereco da seguradora: " + this.getEndereco() + "\n"
					+ "Lista de sinistros por id: " + this.getListaSinistros().stream().map(Sinistro::getId).collect(Collectors.toList()) + "\n"
					+ "Lista de sinistros por cliente: " + this.getListaSinistros().stream().map(Sinistro::getCliente).collect(Collectors.toList()).stream().map(Cliente::getNome).collect(Collectors.toList()) + "\n"
					+ "Lista de clientes: " + this.getListaClientes().stream().map(Cliente::getNome).collect(Collectors.toList()) + "\n"
					+ "Lista de clientes PJ" + this.listarClientes("PJ").stream() + "\n"
					+ "Lista de clientes PF" + this.listarClientes("PF").stream();
		
		return tostr;
				
	}
}

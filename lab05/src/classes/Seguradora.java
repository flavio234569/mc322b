package classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Seguradora {
	private final String cnpj;
	private String nome;
	private String telefone;
	private String endereco;
	private String email;

	//private List<Sinistro> listaSinistros;
	private List<Cliente> listaClientes;
	private List<Seguro> listaSeguros;
	
	//metodo construtor
	public Seguradora (String cnpj, String nome, String telefone, String email, String endereco) {
			//List<Sinistro> listaSinistros, List<Cliente> listaClientes) {
		this.cnpj = cnpj;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
		//this.listaSinistros = new ArrayList<Sinistro>();
		this.listaClientes = new ArrayList<Cliente>(); 
		this.listaSeguros = new ArrayList<Seguro>();
	
	}
	
	
	//metodos getters e setters
	
	public String getCnpj() {
		return cnpj;
	}	
	
	
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



//	public List<Sinistro> getListaSinistros() {
//		return listaSinistros;
//	}
	
	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	
	public List<Seguro> getListaSeguro() {
		return listaSeguros;
	}

	
	//metodo gerar sinistro, retorna falso se ja existir um sinistro com os mesmos dados e nao cria o sinistro
//	public boolean gerarSinistro(Date data, String endereco, Veiculo veiculo, Cliente cliente) {
//		
//		Sinistro sinistro = new Sinistro(data, endereco, this, veiculo, cliente);
//		
//		for (Sinistro elemento_lista_sinistro : this.getListaSinistros()) {
//			if (elemento_lista_sinistro.getData().equals(sinistro.getData())
//			&& (elemento_lista_sinistro.getEndereco().equals(sinistro.getEndereco())
//			&& (elemento_lista_sinistro.getVeiculo().equals(sinistro.getVeiculo())
//			&& (elemento_lista_sinistro.getCliente().equals(sinistro.getCliente())		)))) {
//				return false;
//			}
//		}
//		this.listaSinistros.add(sinistro);
//			calcularPrecoSeguroCliente(cliente);
//		return true;
//	}
	
	//lista clientes por PJ ou PF como parametro na forma de string
	//public List<String> listarClientes(String tipoCliente) {
	public List<Cliente> listarClientes(String tipoCliente) {	
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
		//return listaCliente.stream().map(Cliente::getNome).collect(Collectors.toList());
		return listaCliente;
	}
	
	public boolean gerarSeguro(){
		return false;
		
	}
	
	public boolean cancelarSeguro() {
		return false;
		
	}
	

	//metodo para cadastrar cliente, caso ja exista o objeto, retorna falso
	public boolean cadastrarCliente(Cliente cliente) {
		if (this.listaClientes.contains(cliente)) {
			return false;
		}
		else {
			this.listaClientes.add(cliente);
			//calcularPrecoSeguroCliente(cliente);
			
			return true;
		}
		
	}
	
	//remove cliente pela String CPF, caso nao exista o cpf retorna falso
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
	
	//lista os sinistros por nome dos clientes
//	public List<Integer> listarSinistros() {
//		return this.getListaSinistros().stream().map(Sinistro::getId).collect(Collectors.toList());
//		}
	
	//visualiza o sinistro tendo id como parametro
//	public boolean visualizarSinistro(int idsinistro) {
//		for (Sinistro sinistro : this.getListaSinistros()) {
//			if (sinistro.getId() == idsinistro){
//				System.out.print(sinistro.toString());
//				return true;
//			}
//		}
//		return false;
//	}
	

	
	
	
//	public Double calcularPrecoSeguroCliente(Cliente cliente) {
//		int contadorsinistros = 0;
//		for (int i = 0; i < this.getListaSinistros().size(); i++) {
//			if (this.getListaSinistros().get(i).getCliente().equals(cliente)) {
//				contadorsinistros++;
//			}
//		}
//		Double precoseguro = cliente.calculaScore() * (1 + contadorsinistros);
//		cliente.setValorSeguro(precoseguro);
//		
//		return precoseguro;
//	}
	
	
	public List<Seguro> getSeguroPorCliente(){
		return listaSeguros;
		
	}
	
	public List<Sinistro> getSinistrosPorCliente(){
		return null;
		
	}
	
	
	//modificar
	public double calcularReceita(){
		double receitatotal = 0;
		
//		for (int i = 0; i < this.getListaClientes().size(); i++) {
//			receitatotal += this.getListaClientes().get(i).getValorSeguro();
//		}
		
		return receitatotal;
	}
	
	
	//metodo tostring (traz todos os dados para uma string legivel)
	public String toString() {
		String tostr = "\nDados da seguradora \n"  
					+  "Nome da seguradora: " + this.getNome() + "\n"
					+ "Telefone da seguradora: " + this.getTelefone() + "\n"
					+ "E-mail da seguradora: " + this.getEmail() + "\n"
					+ "Endereco da seguradora: " + this.getEndereco() + "\n"
//					+ "Lista de sinistros por id: " + this.getListaSinistros().stream().map(Sinistro::getId).collect(Collectors.toList()) + "\n"
//					+ "Lista de sinistros por cliente: " + this.getListaSinistros().stream().map(Sinistro::getCliente).collect(Collectors.toList()).stream().map(Cliente::getNome).collect(Collectors.toList()) + "\n"
					+ "Lista de clientes: " + this.getListaClientes().stream().map(Cliente::getNome).collect(Collectors.toList()) + "\n"
					+ "Lista de clientes PJ" + this.listarClientes("PJ").stream().map(Cliente::getNome).collect(Collectors.toList()) + "\n"
					+ "Lista de clientes PF" + this.listarClientes("PF").stream().map(Cliente::getNome).collect(Collectors.toList());
		
		return tostr;
				
	}
}

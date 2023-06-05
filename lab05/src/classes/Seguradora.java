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
		return listaSeguros; //.stream().map(Seguro::getId).collect(Collectors.toList());
	}

	
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
	

	
	public boolean gerarSeguro(Date dataInicio, Date dataFim, Frota frota, ClientePJ clientePJ){

		SeguroPJ seguroPJ1 = new SeguroPJ(dataInicio, dataFim, this, frota, clientePJ);
		this.listaSeguros.add(seguroPJ1);

	return true;
	
}
	
	public boolean gerarSeguro(Date dataInicio, Date dataFim, Veiculo veiculo, ClientePF clientePF){
	//public boolean gerarSeguro(String dataInicio, String dataFim, Double valorMensal, Veiculo veiculo, ClientePF clientePF){

			SeguroPF seguroPF1 = new SeguroPF(dataInicio, dataFim, this, veiculo, clientePF);
			this.getListaSeguro().add(seguroPF1);

		return true;
		
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
	
	
	public List<Seguro> getSeguroPorCliente(ClientePJ clientePJ){
		List <Seguro> listaSeguroPorCliente = new ArrayList<Seguro>();
		for (int i = 0; i < this.listaSeguros.size(); i++) {
			if (this.listaSeguros.get(i) instanceof SeguroPJ) {
				if (((SeguroPJ)this.listaSeguros.get(i)).getClientePJ().equals(clientePJ)) {
					listaSeguroPorCliente.add(((SeguroPJ)this.listaSeguros.get(i)));
				}
			}

		}
		
		return listaSeguroPorCliente;
		
	}
	

	
	public List<Seguro> getSeguroPorCliente(ClientePF clientePF){
		List <Seguro> listaSeguroPorCliente = new ArrayList<Seguro>();
		for (int i = 0; i < this.listaSeguros.size(); i++) {
			if (this.listaSeguros.get(i) instanceof SeguroPF) {
				if (((SeguroPF)this.listaSeguros.get(i)).getClientePF().equals(clientePF)) {
					listaSeguroPorCliente.add(((SeguroPF)this.listaSeguros.get(i)));
				}
			}

		}
		
		return listaSeguroPorCliente;
		
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


	@Override
	public String toString() {
		return "Seguradora [cnpj=" + cnpj + ", nome=" + nome + ", telefone=" + telefone + ", endereco=" + endereco
				+ ", email=" + email + ", listaClientes=" + this.getListaClientes().stream().map(Cliente::getNome).collect(Collectors.toList())
				+ ", listaSeguros=" + this.getListaSeguro().stream().map(Seguro::getId).collect(Collectors.toList())  //+ this.getListaSeguro() + "]"
				;
	}



	
	
	//metodo tostring (traz todos os dados para uma string legivel)
//	public String toString() {
//		String tostr = "\nDados da seguradora \n"  
//					+  "Nome da seguradora: " + this.getNome() + "\n"
//					+ "Telefone da seguradora: " + this.getTelefone() + "\n"
//					+ "E-mail da seguradora: " + this.getEmail() + "\n"
//					+ "Endereco da seguradora: " + this.getEndereco() + "\n"
////					+ "Lista de sinistros por id: " + this.getListaSinistros().stream().map(Sinistro::getId).collect(Collectors.toList()) + "\n"
////					+ "Lista de sinistros por cliente: " + this.getListaSinistros().stream().map(Sinistro::getCliente).collect(Collectors.toList()).stream().map(Cliente::getNome).collect(Collectors.toList()) + "\n"
//					+ "Lista de clientes: " + this.getListaClientes().stream().map(Cliente::getNome).collect(Collectors.toList()) + "\n"
//					+ "Lista de clientes PJ" + this.listarClientes("PJ").stream().map(Cliente::getNome).collect(Collectors.toList()) + "\n"
//					+ "Lista de clientes PF" + this.listarClientes("PF").stream().map(Cliente::getNome).collect(Collectors.toList());
//		
//		return tostr;
//				
//	}
}

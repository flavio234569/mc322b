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
	
	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public List<Seguro> getListaSeguro() {
		return listaSeguros;
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
		return listaCliente;
	}
	

	//gerar seguro PJ
	public boolean gerarSeguro(Date dataInicio, Date dataFim, Frota frota, ClientePJ clientePJ){

		SeguroPJ seguroPJ1 = new SeguroPJ(dataInicio, dataFim, this, frota, clientePJ);
		this.listaSeguros.add(seguroPJ1);

	return true;
	
}
	
	//gerar seguro PF
	public boolean gerarSeguro(Date dataInicio, Date dataFim, Veiculo veiculo, ClientePF clientePF){
			SeguroPF seguroPF1 = new SeguroPF(dataInicio, dataFim, this, veiculo, clientePF);
			this.getListaSeguro().add(seguroPF1);
		return true;
	}
	
	//remove seguro
	public void cancelarSeguro(Seguro seguro) {
		this.getListaSeguro().remove(seguro);
	}

	//metodo para cadastrar cliente, caso ja exista o objeto, retorna falso
	public boolean cadastrarCliente(Cliente cliente) {
		if (this.listaClientes.contains(cliente)) {
			return false;
		}
		else {
			this.listaClientes.add(cliente);
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

	
	//lista eguro por cliente
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
	
	public List<Sinistro> getSinistroPorCliente(ClientePJ clientePJ){
		List<Sinistro> listaSinistro1 = new ArrayList<Sinistro>();
		for (int i = 0; i < this.getListaSeguro().size(); i++) {
			if ((this.getListaSeguro().get(i)) instanceof SeguroPJ) {
				
				if(((SeguroPJ)this.getListaSeguro().get(i)).getClientePJ().equals(clientePJ)) {
					listaSinistro1 = Stream.concat(listaSinistro1.stream(), this.getListaSeguro().get(i).getListaSinistros().stream()).toList();
				}	
			}
		}
		return listaSinistro1;
	}

	public List<Sinistro> getSinistroPorCliente(ClientePF clientePF){
		List<Sinistro> listaSinistro1 = new ArrayList<Sinistro>();
		for (int i = 0; i < this.getListaSeguro().size(); i++) {
			if ((this.getListaSeguro().get(i)) instanceof SeguroPF) {
				
				if(((SeguroPF)this.getListaSeguro().get(i)).getClientePF().equals(clientePF)) {
					listaSinistro1 = Stream.concat(listaSinistro1.stream(), this.getListaSeguro().get(i).getListaSinistros().stream()).toList();
				}
			}
		}
		return listaSinistro1;
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
	
	//atualiza valores do seguro e calcula receita total
	public double calcularReceita(){
		double receitaTotal = 0;
		
		for (int j = 0; j < this.getListaSeguro().size(); j++) {
			this.getListaSeguro().get(j).calcularValor();
		}
		for (int j = 0; j < this.getListaSeguro().size(); j++) {
			receitaTotal = receitaTotal + this.getListaSeguro().get(j).getValorMensal();
		}
		return receitaTotal;
	}


	@Override
	public String toString() {
		return "Seguradora [cnpj=" + cnpj + ", nome=" + nome + ", telefone=" + telefone + ", endereco=" + endereco
				+ ", email=" + email + ", listaClientes=" + this.getListaClientes().stream().map(Cliente::getNome).collect(Collectors.toList())
				+ ", listaSeguros=" + this.getListaSeguro().stream().map(Seguro::getId).collect(Collectors.toList())  //+ this.getListaSeguro() + "]"
				;
	}

}

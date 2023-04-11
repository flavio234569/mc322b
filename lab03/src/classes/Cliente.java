package classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente {
	private String nome;
	//private String cpf;
	//private String dataNascimento;
	//private int idade;
	private String endereco;
	private Date dataLicenca;
	private String educacao;
	private String genero;
	private String classeEconomica;
	private List<Veiculo> listaVeiculos;
	
	//metodo construtor
	public Cliente(String nome, String endereco, Date dataLicenca, String educacao,
			String genero, String classeEconomica){  // , List<Veiculo> listaVeiculos) { //String cpf, String dataNascimento, int idade, 
		this.nome = nome;
		//this.cpf = cpf;
		//this.dataNascimento = dataNascimento;
		//this.idade = idade;
		this.endereco = endereco;
		this.dataLicenca = dataLicenca;
		this.educacao = educacao;
		this.genero = genero;
		this.classeEconomica = classeEconomica;
		this.listaVeiculos = new ArrayList<Veiculo>(); // listaVeiculos;
		
		
	}
	
	//metodos getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

//	public String getCpf() {
//		return cpf;
//	}
//
//	public void setCpf(String cpf) {
//		this.cpf = cpf;
//	}
//
//	public String getDataNascimento() {
//		return dataNascimento;
//	}
//
//	public void setDataNascimento(String dataNascimento) {
//		this.dataNascimento = dataNascimento;
//	}
//
//	public int getIdade() {
//		return idade;
//	}
//
//	public void setIdade(int idade) {
//		this.idade = idade;
//	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	

	public Date getDataLicenca() {
		return dataLicenca;
	}

	public void setDataLicenca(Date dataLicenca) {
		this.dataLicenca = dataLicenca;
	}

	public String getEducacao() {
		return educacao;
	}

	public void setEducacao(String educacao) {
		this.educacao = educacao;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getClasseEconomica() {
		return classeEconomica;
	}

	public void setClasseEconomica(String classeEconomica) {
		this.classeEconomica = classeEconomica;
	}

	public List<Veiculo> getListaVeiculos() {
		return listaVeiculos;
	}

	public void adicionaVeiculo(Veiculo veiculo) {
		this.listaVeiculos.add(veiculo); // = listaVeiculos;
	}
	

	
	
	//metodo tostring (traz todos os dados para uma string legivel)
	public String toString() {
		String tostr = "\nDados do cliente \n"  
					+  "O nome do cliente e: " + this.getNome() + "\n"
//					+ "O cpf do cliente e: " + this.getCpf() + "\n"
//					+ "O cpf informado e: " + String.valueOf(this.validarCPF()) + " \n"
//					+ "O cliente nasceu em: " + this.getDataNascimento() + "\n"
//					+ "O cliente tem " + Integer.toString(this.getIdade()) + " anos\n"
					+ "O endereco do cliente e: " + this.getEndereco() + "\n"
					+ "A data de licenca do cliente e: " + this.getDataLicenca() + "\n"
					+ "O nivel de escolaridade do cliente e: " + this.getEducacao() + "\n"
					+ "O genero do cliente e: " + this.getGenero() + "\n"
					+ "A classe economica do cliente e: " + this.getClasseEconomica() + "\n"
					+ "A lista de veiculos e: " + this.getListaVeiculos();

		return tostr;
		
	}

}

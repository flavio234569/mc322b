package classes;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;



public class Cliente {
	protected static SimpleDateFormat formatadata = new SimpleDateFormat("dd/MM/yyyy");
	private String nome;
	private String endereco;
	private Date dataLicenca;
	private String educacao;
	private String genero;
	private String classeEconomica;
	private ArrayList<Veiculo> listaVeiculos;
	
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
					+  "Nome cliente: " + this.getNome() + "\n"
					+ "Endereco cliente: " + this.getEndereco() + "\n"
					+ "Data licenca: " + formatadata.format( this.getDataLicenca()) + "\n"
					+ "Escolaridade: " + this.getEducacao() + "\n"
					+ "Genero: " + this.getGenero() + "\n"
					+ "Classe economica: " + this.getClasseEconomica() + "\n"
					+ "Lista Veiculo placas: " + this.getListaVeiculos().stream().map(Veiculo::getPlaca).collect(Collectors.toList());

		return tostr;
		
	}

}

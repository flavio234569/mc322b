package classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class ClientePF extends Cliente{
	SimpleDateFormat formatadata = new SimpleDateFormat("dd/MM/yyyy");
	
	private final String cpf;
	private String genero;
	private String educacao;
	private Date dataNascimento;
	private List<Veiculo> listaVeiculos;
	
	//metodo construtor
	public ClientePF(String nome, String telefone, String endereco, String email,
			String cpf, String genero, String educacao, Date dataNascimento) {
		
		super(nome, telefone, endereco, email); 
		this.cpf = cpf;
		this.genero = genero;
		this.educacao = educacao;
		this.dataNascimento = dataNascimento;
		this.listaVeiculos = new ArrayList<Veiculo>(); 
	}

	//metodos getters e setters
	public String getCpf() {
		return cpf;
	}
	
	public String getGenero() {
		return genero;
	}

	
	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEducacao() {
		return educacao;
	}


	public void setEducacao(String educacao) {
		this.educacao = educacao;
	}


	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public List<Veiculo> getListaVeiculos() {
		return listaVeiculos;
	}

	public void cadastrarVeiculo(Veiculo veiculo) {
		this.listaVeiculos.add(veiculo);
	}
	
	public void removerVeiculo(Veiculo veiculo) {
		this.listaVeiculos.remove(veiculo);
	}


	@Override
	public String toString() {
		return "ClientePF [cpf=" + cpf + ", genero=" + genero + ", educacao=" + educacao + ", dataNascimento="
				+ dataNascimento + ", listaVeiculos=" + listaVeiculos + ", getNome()=" + getNome() + ", getTelefone()="
				+ getTelefone() + ", getEndereco()=" + getEndereco() + ", getEmail()=" + getEmail() + "]";
	}
	
}

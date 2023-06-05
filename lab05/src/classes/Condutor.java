package classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Condutor {
	private String cpf;
	private String nome;
	private String telefone;
	private String endereco;
	private String email;
	private Date dataNascimento;
	private List<Sinistro> listaSinistros;
	
	
	public Condutor(String cpf, String nome, String telefone, String endereco, String email, Date dataNascimento
			) {
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.listaSinistros = new ArrayList<Sinistro>();
	}
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
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
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public List<Sinistro> getListaSinistros() {
		return listaSinistros;
	}
//	public void setListaSinistros(List<Sinistro> listaSinistros) {
//		this.listaSinistros = listaSinistros;
//	}
	
	
	public void adicionarSinistro(Date data, String endereco) {
		Sinistro sinistro1 = new Sinistro(data, endereco, this, null);
		this.listaSinistros.add(sinistro1);
	}


	@Override
	public String toString() {
		return "Condutor [cpf=" + cpf + ", nome=" + nome + ", telefone=" + telefone + ", endereco=" + endereco
				+ ", email=" + email + ", dataNascimento=" + dataNascimento + ", listaSinistros=" + listaSinistros
				+ "]";
	}
	
	
	
	
	
	
}

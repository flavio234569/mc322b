package classes;

public class Seguradora {
	private String nome;
	private String telefone;
	private String email;
	private String endereco;
	
	//metodo construtor
	public Seguradora (String nome, String telefone, String email, String endereco) {
		this.nome =nome;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
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

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	//metodo tostring (traz todos os dados para uma string legivel)
	public String toString() {
		String tostr = "Dados da seguradora \n"  
					+  "O nome da seguradora e: " + this.getNome() + "\n"
					+ "O telefone da seguradora e: " + this.getTelefone() + "\n"
					+ "O e-mail da seguradora e: " + this.getEmail() + "\n"
					+ "O endereco da seguradora e: " + this.getEndereco() + "\n";
		
		return tostr;
				
	}
}

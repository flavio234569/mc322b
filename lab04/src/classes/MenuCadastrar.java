package classes;

public enum MenuCadastrar {

	CADASTRARCLIENTE("Cadastrar cliente"),
	CADASTRARVEICULO("Cadastrar veiculo"),
	CADASTRARSEGURADORA("Cadastrar seguradora"),
	VOLTAR("Voltar");

	String stringmenucadastrar;
	
	MenuCadastrar(String stringmenucadastrar) {
		// TODO Auto-generated constructor stub
		this.stringmenucadastrar = stringmenucadastrar;
	}

	public String getStringmenucadastrar() {
		return stringmenucadastrar;
	}

	public void setStringmenucadastrar(String stringmenucadastrar) {
		this.stringmenucadastrar = stringmenucadastrar;
	}
	
}

package classes;

public enum MenuCadastrar {

	CADASTRARCLIENTE("Cadastrar cliente"),
	CADASTRARVEICULO("Cadastrar veiculo"),
	CADASTRARFROTA("Cadastrar frota"),
	CADASTRARSEGURADORA("Cadastrar seguradora"),
	CADASTRARCONDUTOR("Cadastrar condutor"),
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

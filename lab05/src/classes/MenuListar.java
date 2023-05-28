package classes;

public enum MenuListar {

	LISTARCLIENTEPSEGURADORA("Listar clientes por seguradora"),
	LISTARSINISTROPSEGURADORA("Listar sinistros por seguradora"),
	LISTARSINISTROPCLIENTE("Listar sinistros por cliente"),
	LISTARVEICULOPCLIENTE("Listar veiculos por cliente"),
	LISTARVEICULOPSEGURADORA("Listar veiculos por seguradora"),
	VOLTAR("Voltar");

	String stringmenucadastrar;
	
	MenuListar(String stringmenucadastrar) {
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

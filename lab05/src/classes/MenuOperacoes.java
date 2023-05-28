package classes;

public enum MenuOperacoes {

	CADASTROS("Cadastros"),
	LISTAR("Listas"),
	EXCLUIR("Excluir"),
	GERAR_SINISTRO("Gerar sinistro"),
	TRANSFERIR_SEGURO("Transferir seguro"),
	CALCULAR_RECEITA_SEGURADORA("Calcular receita seguradora"),
	SAIR("Sair");

	String stringmenu;
	
	MenuOperacoes( String stringmenu) {
		// TODO Auto-generated constructor stub
		
		this.stringmenu = stringmenu;
	}

	public String getStringmenu() {
		return stringmenu;
	}

	public void setStringmenu(String stringmenu) {
		this.stringmenu = stringmenu;
	}


	
}

package classes;

public enum MenuExcluir {

	EXCLUIRCLIENTE("Excluir cliente, atenção: remove também os seguros vinculados"),
	EXCLUIRVEICULO("Exluir veiculo"),
	EXCLUIRSINISTRO("Excluir sinistro"),
	EXCLUIRSEGURO("Excluir seguro"),
	EXCLUIRCONDUTOR("Excluir condutor"),
	VOLTAR("Voltar");

	String stringmenuexcluir;
	
	MenuExcluir(String stringmenuexcluir) {
		// TODO Auto-generated constructor stub
		this.stringmenuexcluir = stringmenuexcluir;
	}

	public String getStringmenuexcluir() {
		return stringmenuexcluir;
	}

	public void setStringmenuexcluir(String stringmenuexcluir) {
		this.stringmenuexcluir = stringmenuexcluir;
	}
	
	
	
	
	
	
	
	
	
	
}

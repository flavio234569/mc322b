package classes;

public class Sinistro {
	private static int contador = 0;
	private int id = 0;
	private String data;
	private String endereco;

	
	//metodo construtor
	public Sinistro( String data, String endereco) {
		Sinistro.contador++;
		this.id = contador;
		this.data = data;
		this.endereco = endereco;
		
	}

	//metodos getters e setters
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	//metodo tostring (traz todos os dados para uma string legivel)	
	public String toString() {
		String tostr = "Dados do sinistro \n"  
					+  "O id do sinistro e: " + this.getId() + "\n"
					+ "A data do sinistro e: " + this.getData() + "\n"
					+ "O endereco do sinistro e: " + this.getEndereco() + "\n";
		return tostr;
				
	}
}

package classes;

public class Veiculo {
	private String placa;
	private String marca;
	private String modelo;
	private int anoFabricacao;
	
	//metodo construtor
	public Veiculo(String placa, String marca, String modelo, int anoFabricacao) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
	}
	
	//metodos getters e setters
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	//metodo tostring (traz todos os dados para uma string legivel)
	public String toString() {
		String tostr = "\nDados do veiculo \n"  
					+  "A placa do veiculo e: " + this.getPlaca() + "\n"
					+ "A marca do veiculo e: " + this.getMarca() + "\n"
					+ "O modelo do veiculo e: " + this.getModelo() + "\n"
					+ "O ano de fabricacao do veiculo e: " + this.getAnoFabricacao();
		return tostr;
				
	}
		
}

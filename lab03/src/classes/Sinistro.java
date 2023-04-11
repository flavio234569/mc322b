package classes;

public class Sinistro {
	private static int contador = 0;
	private int id = 0;
	private String data;
	private String endereco;
	
	private Seguradora seguradora;
	private Veiculo veiculo;
	private Cliente cliente;
	

	
	//metodo construtor
	public Sinistro( String data, String endereco, Seguradora seguradora, Veiculo veiculo, Cliente cliente) {
		Sinistro.contador++;
		this.id = contador;
		this.data = data;
		this.endereco = endereco;
		this.seguradora = seguradora;
		this.veiculo = veiculo;
		this.cliente = cliente;
		
	}

	//metodos getters e setters
	public int getId() {
		return id;
	}


//	public void setId(int id) {
//		this.id = id;
//	}


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

	public Seguradora getSeguradora() {
		return seguradora;
	}

	public void setSeguradora(Seguradora seguradora) {
		this.seguradora = seguradora;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
	
	//metodo tostring (traz todos os dados para uma string legivel)	
	public String toString() {
		String tostr = 
					  "\nSinistro id: " + this.getId() + "\n"
					+ "Data: " + this.getData() + "\n"
					+ "Local: " + this.getEndereco() + "\n"
					+ "Seguradora: " + this.getSeguradora().getNome() + "\n"
					+ "Placa do veiculo: " + this.getVeiculo().getPlaca() + "\n"
					+ "Cliente: " + this.getCliente().getNome() + "\n";
		return tostr;
				
	}
}

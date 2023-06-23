package classes;

import java.util.ArrayList;
import java.util.List;

public class Frota {

	private String code;
	private List<Veiculo> listaVeiculos;
	
	//metodo construtor
	public Frota(String code) {
		super();
		this.code = code;
		this.listaVeiculos = new ArrayList<Veiculo>(); 
	}

	//metodos getters e setters
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<Veiculo> getListaVeiculos() {
		return this.listaVeiculos;
	}
	
	public void addVeiculo(Veiculo veiculo) {
		this.listaVeiculos.add(veiculo);
	}
	
	public void removeVeiculo(Veiculo veiculo) {
		this.listaVeiculos.remove(veiculo);
	}

	@Override
	public String toString() {
		return "Frota [code=" + code + ", listaVeiculos=" + listaVeiculos + "]";
	}
	
}

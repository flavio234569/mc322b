

package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class ClientePJ extends Cliente{
	private final String cnpj;
	private Date dataFundacao;
	private int qtdeFuncionario;
	private List<Frota> listaFrota;
	//private Frota frota;
	
	public ClientePJ(String nome, String telefone,String endereco, String email,
			String cnpj, Date dataFundacao, int qtdeFuncionario) {
		
		super(nome, telefone, endereco, email); //, listaVeiculos);
		this.cnpj = cnpj;
		this.dataFundacao = dataFundacao;
		this.qtdeFuncionario = qtdeFuncionario;
		this.listaFrota = new ArrayList<Frota>(); 
		//this.frota = frota;
	}
	
	
	public String getCnpj() {
		return cnpj;
	}

	public Date getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}

	public int getQtdeFuncionario() {
		return qtdeFuncionario;
	}


	public void setQtdeFuncionario(int qtdeFuncionario) {
		this.qtdeFuncionario = qtdeFuncionario;
	}


	public List<Frota> getListaFrota(){
		return listaFrota;
	}
	
	

//	public Frota getFrota() {
//		return frota;
//	}
//
//
//	public void setFrota(Frota frota) {
//		this.frota = frota;
//	}


	public boolean cadastrarFrota(Frota frota){
		
		for (Frota frota1 : this.listaFrota) {
			if (frota1.getCode().equals(frota.getCode())) {
				return false;
			}
		}
		
		if (this.listaFrota.contains(frota)) {
			return false;
		}
		this.listaFrota.add(frota);
		return true;
	}
	
	public boolean atualizarFrota(Frota frota, Veiculo veiculo){
		
		if (!(this.getListaFrota().contains(frota))) {
			return false;
		}
		
		for (Veiculo veiculo1 : frota.getListaVeiculos()) {
			if (veiculo1.getPlaca().equals(veiculo.getPlaca())) {
				return false;
			}
		}
		
		frota.addVeiculo(veiculo);
		return true;
	}
	
	public boolean atualizarFrota(Frota frota){
		return false;
		
	}
	
	
	public List<Veiculo> getVeiculoPorFrota(Frota frota){
		
		return frota.getListaVeiculos();
		
	}
	
	

	@Override
	public String toString() {
		return "ClientePJ [cnpj=" + cnpj + ", dataFundacao=" + dataFundacao
				+ ", getNome()=" + getNome() + ", getTelefone()=" + getTelefone() + ", getEndereco()=" + getEndereco()
				+ ", getEmail()=" + getEmail() + //"getfrota" + getFrota() +
				"]";
	}

	
	
//	public void setListaFrota(List<Frota> listaFrota) {
//		this.listaFrota = listaFrota;
//	}




	

	
//	@Override
//	public double calculaScore() {
//		Double Score = null;
//		Score = (CalcSeguro.VALOR_BASE.getValor())*(1 + this.getQtdeFuncionario()/100)*(super.getListaVeiculos().size());
//		return Score;
//	}
//
//	@Override
//	public String toString() {
//		String tostr = 
//					super.toString() + "\n"
//					+ "CNPJ: " + this.getCnpj() + "\n"
//					//+ "Validade CNPJ: " + String.valueOf(this.validarCNPJ()) + " \n"
//					+ "Data Nascimento clientePJ: " + formatadata.format(this.getDataNascimento()) + "\n";
//		
//
//		return tostr;
//		
//	}
	



	
}

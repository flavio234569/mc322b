

package classes;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class ClientePJ extends Cliente{
	private final String cnpj;
	private Date dataFundacao;
	private int qtdeFuncionario;
	
	public ClientePJ(String nome, String endereco,
			String cnpj, Date dataFundacao, int qtdeFuncionario) {
		
		super(nome, endereco); //, listaVeiculos);
		this.cnpj = cnpj;
		this.dataFundacao = dataFundacao;
		this.qtdeFuncionario =  qtdeFuncionario;
	}

	public String getCnpj() {
		return cnpj;
	}

	public Date getDataNascimento() {
		return dataFundacao;
	}

	public void setDataNascimento(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
	
	public int getQtdeFuncionario() {
		return qtdeFuncionario;
	}

	public void setQtdeFuncionario(int qtdeFuncionario) {
		this.qtdeFuncionario = qtdeFuncionario;
	}
	
	@Override
	public double calculaScore() {
		Double Score = null;
		Score = (CalcSeguro.VALOR_BASE.getValor())*(1 + this.getQtdeFuncionario()/100)*(super.getListaVeiculos().size());
		return Score;
	}

	@Override
	public String toString() {
		String tostr = 
					super.toString() + "\n"
					+ "CNPJ: " + this.getCnpj() + "\n"
					//+ "Validade CNPJ: " + String.valueOf(this.validarCNPJ()) + " \n"
					+ "Data Nascimento clientePJ: " + formatadata.format(this.getDataNascimento()) + "\n";
		

		return tostr;
		
	}
	



	
}

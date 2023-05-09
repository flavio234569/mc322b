package classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class ClientePF extends Cliente{
	SimpleDateFormat formatadata = new SimpleDateFormat("dd/MM/yyyy");
	
	private final String cpf;
	private String genero;
	private Date dataLicenca;
	private String educacao;
	private Date dataNascimento;
	private String classeEconomica;
	
	public ClientePF(String nome, String endereco, String cpf,
			String genero, Date dataLicenca, String educacao, Date dataNascimento, 
			String classeEconomica) {
		
		super(nome, endereco); //, listaVeiculos);
		this.cpf = cpf;
		this.genero = genero;
		this.dataLicenca = dataLicenca;
		this.educacao = educacao;
		this.dataNascimento = dataNascimento;
		this.classeEconomica = classeEconomica;
	}

	public String getCpf() {
		return cpf;
	}


	
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Date getDataLicenca() {
		return dataLicenca;
	}

	public void setDataLicenca(Date dataLicenca) {
		this.dataLicenca = dataLicenca;
	}

	public String getEducacao() {
		return educacao;
	}

	public void setEducacao(String educacao) {
		this.educacao = educacao;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getClasseEconomica() {
		return classeEconomica;
	}

	public void setClasseEconomica(String classeEconomica) {
		this.classeEconomica = classeEconomica;
	}

	@Override
	public double calculaScore() {
		Double Score = null;
		Date currDate = Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant());
		long idade = (TimeUnit.DAYS.convert(Math.abs(currDate.getTime() - this.dataNascimento.getTime()), TimeUnit.MILLISECONDS))/365;
		//int qtdveiculo = super.getListaVeiculos().size();
		if (idade < 30) {
			Score = CalcSeguro.VALOR_BASE.getValor()*CalcSeguro.FATOR_18_30.getValor()*(super.getListaVeiculos().size());
			
		}
		else if (idade >= 30 && idade < 60) {
			Score = CalcSeguro.VALOR_BASE.getValor()*CalcSeguro.FATOR_30_60.getValor()*(super.getListaVeiculos().size());

		}
		else if (idade >= 60) {
			Score = CalcSeguro.VALOR_BASE.getValor()*CalcSeguro.FATOR_60_90.getValor()*(super.getListaVeiculos().size());

		}

		return Score;
	}
	
	@Override
	public String toString() {
		String tostr = 
					 super.toString() + "\n"

					+ "CPF: " + this.getCpf() + "\n"
					//+ "Validade CPF: " + String.valueOf(this.validarCPF()) + " \n"
					+ "Data de nascimento clientePF: " + formatadata.format(this.getDataNascimento()) +"\n";
		

		return tostr;
		
	}
	



	
}

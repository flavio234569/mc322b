package classes;

import java.util.Date;
import java.util.List;

public class ClientePF extends Cliente{
	private String cpf;
	private Date dataNascimento;
	
	public ClientePF(String nome, String endereco, Date dataLicenca, String educacao,
			String genero, String classeEconomica, String cpf, Date dataNascimento) {
		
		super(nome, endereco, dataLicenca, educacao, genero, classeEconomica); //, listaVeiculos);
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	@Override
	public String toString() {
		String tostr = "Dados do cliente \n"  
					+  "O nome do cliente e: " + this.getNome() + "\n"
//					+ "O cpf do cliente e: " + this.getCpf() + "\n"
//					+ "O cpf informado e: " + String.valueOf(this.validarCPF()) + " \n"
//					+ "O cliente nasceu em: " + this.getDataNascimento() + "\n"
//					+ "O cliente tem " + Integer.toString(this.getIdade()) + " anos\n"
					+ "O endereco do cliente e: " + this.getEndereco() + "\n"
					+ "A data de licenca do cliente e: " + this.getDataLicenca() + "\n"
					+ "O nivel de escolaridade do cliente e: " + this.getEducacao() + "\n"
					+ "O genero do cliente e: " + this.getGenero() + "\n"
					+ "A classe economica do cliente e: " + this.getClasseEconomica() + "\n"
					+ "A lista de veiculos e: " + this.getListaVeiculos() + "\n"
					+ "O CPF do cliente e: " + this.getCpf() + "\n"
					+ "O CPF informado e: " + String.valueOf(this.validarCPF()) + " \n"
					+ "A data de nascimento e: " + this.getDataNascimento();
		

		return tostr;
		
	}
	

	//metodo para retornar o resto de:
	//(10*1o digito + ... + 2*9o digito)*10/11 (para mult = 10)
	//(11*1o digito + ... + 3*9o digito + retorno(mult = 10)*2)*10/11 (para mult = 11)
	// de acordo com https://dicasdeprogramacao.com.br/algoritmo-para-validar-cpf/
	private int somaDigitoFatores(String cpfmod, int mult, int digitodez) {
		int numerocaracter = cpfmod.length();
		int soma = 0;
		for (int indice = 0; indice < numerocaracter-2; indice++) {		
			soma = soma + Character.getNumericValue(cpfmod.charAt(indice))*(mult-indice);
		}
		//System.out.println(cpfmod.charAt(mult-1));

		soma = soma + digitodez*2;
		
		int restodig = (soma*10)%11;
		if (restodig == 10){
			restodig = 0;
		}
		return restodig;
	}
	
	public boolean validarCPF() {
		

		//substituindo "." e "-" por "" (duas operacoes consecutivas)
		String cpfmod = this.cpf.replaceAll("\\.", "").replaceAll("-", "");
		
		//comprimento da string cpf com apenas numeros (cpfmod)
		int numerocaracter = cpfmod.length();
		
		//conferindo se tem 11 caracteres
		if (numerocaracter != 11) {
			return false;
		}
		
		//contador para caracteres iguais
		int contacaracterigual = 0;
		
		//contar caracteres iguais
		for (int indice = 0; indice < numerocaracter; indice++) {
			if (cpfmod.charAt(indice) == cpfmod.charAt(0)){
				contacaracterigual++;
			}
		}
		
		//caso os caracteres iguais forem igual a onze, todos os caracteres sao iguais
		if (contacaracterigual == 11) {
			return false;
		}
		
		//retorno do metodo somaDigitoFatores mult = 10
		int restodigdez = somaDigitoFatores(cpfmod, 10, 0);
		//caso o retorno for diferente do digito 10 do cpf, retorna flaso
		if (restodigdez != Character.getNumericValue(cpfmod.charAt(9))) {
			return false;
		}
		//retorno do metodo somaDigitoFatores mult = 11
		int restodigonze = somaDigitoFatores(cpfmod, 11, restodigdez);
		//caso o retorno for diferente do digito 11 do cpf, retorna falso
		if (restodigonze != Character.getNumericValue(cpfmod.charAt(10))) {
			return false;
		}
		
		//caso todos os testes forem atendidos, retorna verdadeiro
		return true;
		
	}

	
}

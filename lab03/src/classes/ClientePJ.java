

package classes;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class ClientePJ extends Cliente{
	private final String cnpj;
	private Date dataFundacao;
	
	public ClientePJ(String nome, String endereco, Date dataLicenca, String educacao,
			String genero, String classeEconomica, String cnpj, Date dataFundacao) {
		
		super(nome, endereco, dataLicenca, educacao, genero, classeEconomica); //, listaVeiculos);
		this.cnpj = cnpj;
		this.dataFundacao = dataFundacao;
	}

	public String getCnpj() {
		return cnpj;
	}

//	public void setCnpj(String cnpj) {
//		this.cnpj = cnpj;
//	}

	public Date getDataNascimento() {
		return dataFundacao;
	}

	public void setDataNascimento(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
	

	
	@Override
	public String toString() {
		String tostr = "\nDados do clientePJ \n"  
					+ "Nome clientePJ: " + this.getNome() + "\n"
					+ "Endereco clientePJ: " + this.getEndereco() + "\n"
					+ "Data licenca clientePJ: " + this.getDataLicenca() + "\n"
					+ "Escolaridade clientePJ: " + this.getEducacao() + "\n"
					+ "Genero clientePJ: " + this.getGenero() + "\n"
					+ "Classe economica clientePJ: " + this.getClasseEconomica() + "\n"
					+ "Veiculos clientePJ: " + this.getListaVeiculos().stream().map(Veiculo::getPlaca).collect(Collectors.toList()) + "\n"
					+ "CNPJ: " + this.getCnpj() + "\n"
					+ "Validade CNPJ: " + String.valueOf(this.validarCNPJ()) + " \n"
					+ "Data Nascimento clientePJ: " + this.getDataNascimento();
		

		return tostr;
		
	}
	

	//metodo para retornar o calculo do digito:
	//(5*1o digito +...+ 2*5o digito + 9*6o digito + ... + 2*12o digito)/11 se < 2 digito = 0 (para digitoverificador = 1)
	//(6*1o digito +...+ 2*5o digito + 9*6o digito + ... + 3*12o digito + 2*1o digito verificador)/11 se < 2 digito = 0 (para digito verificador = 2)
	// de acordo com https://www.geradorcnpj.com/algoritmo_do_cnpj.htm
	// e https://blog.dbins.com.br/como-funciona-a-logica-da-validacao-do-cnpj
	private int somaDigitoFatores(String cnpjmod, int digitoverificador, int valordigitoverificador) {
		//lista dos fatores de multiplicacao para cada digito do cnpj
		List<Integer> listadefatoresmult=Arrays.asList(6,5,4,3,2,9,8,7,6,5,4,3,2);
		int numerocaracter = cnpjmod.length();
		int soma = 0;
		//iterando os digitos e multiplicando por cada item da listadefatoresmult de acordo com o digitoverificador a ser conferido
		for (int indice = 0; indice < numerocaracter-2; indice++) {		
			soma = soma + Character.getNumericValue(cnpjmod.charAt(indice))*(listadefatoresmult.get(indice+(2-digitoverificador)));
		}
		//soma dos fatores para o primeiro digito o valordigitoverificador sera utilizado 0
		soma = soma + valordigitoverificador*2;

		//verificando se o resto da divisao por 11 é menor que 2
		int restodig = (soma)%11;
		if (restodig < 2){
			restodig = 0;
		}
		//senao digito = resto/11
		else {
			restodig = 11 - restodig;
		}
		System.out.println("restodig:" + restodig);
		return restodig;
	}
	
	public boolean validarCNPJ() {
		
		//substituindo ".", "-" e "/" por "" (tres operacoes consecutivas)
		String cnpjmod = this.cnpj.replaceAll("\\.", "").replaceAll("-", "").replaceAll("/","");
		
		System.out.println(cnpjmod);
		
		//comprimento da string cnpj com apenas numeros (cpfmod)
		int numerocaracter = cnpjmod.length();
		
		//conferindo se tem 14 caracteres
		if (numerocaracter != 14) {
			return false;
		}
		
		//contador para caracteres iguais
		int contacaracterigual = 0;
		
		//contar caracteres iguais
		for (int indice = 0; indice < numerocaracter; indice++) {
			if (cnpjmod.charAt(indice) == cnpjmod.charAt(0)){
				contacaracterigual++;
			}
		}
		
		//caso os caracteres iguais forem igual a quatorze, todos os caracteres sao iguais
		if (contacaracterigual == 14) {
			return false;
		}
		
		//retorno do metodo somaDigitoFatores mult = 10
		int restodigtreze = somaDigitoFatores(cnpjmod, 1, 0);
		//caso o retorno for diferente do digito 10 do cpf, retorna falso
		if (restodigtreze != Character.getNumericValue(cnpjmod.charAt(12))) {
			return false;
		}
		//retorno do metodo somaDigitoFatores mult = 11
		int restodigquatorze = somaDigitoFatores(cnpjmod, 2, restodigtreze);
		//caso o retorno for diferente do digito 11 do cpf, retorna falso
		if (restodigquatorze != Character.getNumericValue(cnpjmod.charAt(13))) {
			return false;
		}
		
		//caso todos os testes forem atendidos, retorna verdadeiro
		return true;
		
	}

	
}

package classes;

import java.util.Arrays;
import java.util.List;

public class Validacao {
	
	//metodo para retornar o resto de:
	//(10*1o digito + ... + 2*9o digito)*10/11 (para mult = 10)
	//(11*1o digito + ... + 3*9o digito + retorno(mult = 10)*2)*10/11 (para mult = 11)
	// de acordo com https://dicasdeprogramacao.com.br/algoritmo-para-validar-cpf/
	static private int somaDigitoFatores(String cpfmod, int mult, int digitodez) {
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
	
	static public boolean validarCPF(String stringcpf) {
		//substituindo "." e "-" por "" (duas operacoes consecutivas)
		String cpfmod = stringcpf.replaceAll("\\.", "").replaceAll("-", "");
		
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
	
	
	
	//metodo para retornar o calculo do digito:
	//(5*1o digito +...+ 2*5o digito + 9*6o digito + ... + 2*12o digito)/11 se < 2 digito = 0 (para digitoverificador = 1)
	//(6*1o digito +...+ 2*5o digito + 9*6o digito + ... + 3*12o digito + 2*1o digito verificador)/11 se < 2 digito = 0 (para digito verificador = 2)
	// de acordo com https://www.geradorcnpj.com/algoritmo_do_cnpj.htm
	// e https://blog.dbins.com.br/como-funciona-a-logica-da-validacao-do-cnpj
	static private int somaDigitoFatoresCnpj(String cnpjmod, int digitoverificador, int valordigitoverificador) {
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
		//System.out.println("restodig:" + restodig);
		return restodig;
	}
	
	static public boolean validarCNPJ(String stringcnpj) {
		
		//substituindo ".", "-" e "/" por "" (tres operacoes consecutivas)
		String cnpjmod = stringcnpj.replaceAll("\\.", "").replaceAll("-", "").replaceAll("/","");
		
		//System.out.println(cnpjmod);
		
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
		int restodigtreze = somaDigitoFatoresCnpj(cnpjmod, 1, 0);
		//caso o retorno for diferente do digito 10 do cpf, retorna falso
		if (restodigtreze != Character.getNumericValue(cnpjmod.charAt(12))) {
			return false;
		}
		//retorno do metodo somaDigitoFatores mult = 11
		int restodigquatorze = somaDigitoFatoresCnpj(cnpjmod, 2, restodigtreze);
		//caso o retorno for diferente do digito 11 do cpf, retorna falso
		if (restodigquatorze != Character.getNumericValue(cnpjmod.charAt(13))) {
			return false;
		}
		
		//caso todos os testes forem atendidos, retorna verdadeiro
		return true;
		
	}
	
	static public boolean validarNome(String nome) {
		String nomemod = nome.replaceAll(" ", "");
			if (nomemod.length()<3) {
				return false;
			}
			for (int i = 0; i < nomemod.length(); i++) { 
				if (!(Character.isAlphabetic(nomemod.charAt(i)))) {
					return false;
				}	
			}
		return true;
	}

}

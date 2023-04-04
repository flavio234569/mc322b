
package classesww;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;





public class main {

	
	
	private static int somaDigitoFatores(String cnpjmod, int digitoverificador, int valordigitoverificador) {
		List<Integer> listadefatoresmult=Arrays.asList(6,5,4,3,2,9,8,7,6,5,4,3,2);
		int numerocaracter = cnpjmod.length();
		int soma = 0;
		for (int indice = 0; indice < numerocaracter-2; indice++) {		
			soma = soma + Character.getNumericValue(cnpjmod.charAt(indice))*(listadefatoresmult.get(indice+(2-digitoverificador)));
		}
		

		soma = soma + valordigitoverificador*2;
		
		System.out.println(cnpjmod);
		System.out.println("soma:" + soma);
		
		int restodig = (soma)%11;
		if (restodig < 2){
			restodig = 0;
		}
		
		else {
			restodig = 11 - restodig;
		}
		System.out.println("restodig:" + restodig);
		return restodig;
	}
	
	public static boolean validarCNPJ(String cnpj) {
		
		

		//substituindo "." e "-" por "" (duas operacoes consecutivas)
		String cnpjmod = cnpj.replaceAll("\\.", "").replaceAll("-", "").replaceAll("/","");
		
		System.out.println(cnpjmod);
		
		//comprimento da string cpf com apenas numeros (cpfmod)
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
		
		//caso os caracteres iguais forem igual a onze, todos os caracteres sao iguais
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
	
	public static void main(String[] args) {//throws ParseException {
		// TODO Auto-generated method stub
	       //String date_string = "26-09-1989";
	       //Instantiating the SimpleDateFormat class
	       //SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");      
	       //Parsing the given String to Date object
	       
		Date date = new Date(2009, 9, 12);
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2009);
		cal.set(Calendar.MONTH, Calendar.JANUARY);
		cal.set(Calendar.DAY_OF_MONTH, 6);
		Date date2 = cal.getTime();
		
	    		   //formatter.parse(date_string);      
	    System.out.println("Date value: "+date2);
	       
	       
	    //System.out.println(validarCNPJ("99.576.269/0001-88"));
	    //System.out.println(validarCNPJ("69.221.205/0001-01"));
	    System.out.println(validarCNPJ("68.518.377/0001-70"));
	    
	
	       
	       
	}

}

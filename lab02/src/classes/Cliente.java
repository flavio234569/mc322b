package classes;

public class Cliente {
	private String nome;
	private String cpf;
	private String dataNascimento;
	private int idade;
	private String endereco;
	
	//metodo construtor
	public Cliente(String nome, String cpf, String dataNascimento, int idade, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.idade = idade;
		this.endereco = endereco;
	}
	
	//metodos getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
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
	
	
	//metodo tostring (traz todos os dados para uma string legivel)
	public String toString() {
		String tostr = "Dados do cliente \n"  
					+  "O nome do cliente e: " + this.getNome() + "\n"
					+ "O cpf do cliente e: " + this.getCpf() + "\n"
					+ "O cpf informado e: " + String.valueOf(this.validarCPF()) + " \n"
					+ "O cliente nasceu em: " + this.getDataNascimento() + "\n"
					+ "O cliente tem " + Integer.toString(this.getIdade()) + " anos\n"
					+ "O endereco do cliente e: " + this.getEndereco() + "\n";
		
		return tostr;
		
	}
}

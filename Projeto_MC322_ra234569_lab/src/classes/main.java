package classes;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instanciar seguradora
		Seguradora seguradora1 = new Seguradora("nomeseguradora1", "19555555555", "nomeseguradora1@email.com", "rua da seguradora1 num 111");
		System.out.println(seguradora1.toString());
		seguradora1.setNome("novonomeseguradora1");
		seguradora1.setTelefone("1944444444");
		seguradora1.setEmail("novoemailseguradora1@email.com");
		seguradora1.setEndereco("rua da nova seguradora1 num 111");
		//teste ver se os metodos set e get funcionam
		System.out.println("dados da seguradora1 depois do set dos atributos (print via get)");
		System.out.println(seguradora1.getNome() + "\n" + seguradora1.getTelefone() + "\n" + seguradora1.getEmail() + "\n" + seguradora1.getEndereco() + "\n");
		System.out.println("dados seguradora1 depois do set dos atributos print atraves de toString()");
		System.out.println(seguradora1.toString());
		
		//instanciar veiculo
		Veiculo veiculo1 = new Veiculo("QWE12A3", "marcaB", "modeloB");
		System.out.println(veiculo1.toString());
		veiculo1.setPlaca("ASD12F3");
		veiculo1.setMarca("novamarcaC");
		veiculo1.setModelo("novoModeloB");
		System.out.println("dados do veiculo1 depois do set dos atributos");
		System.out.println(veiculo1.toString());
		
		
		//instanciar sinistro
		Sinistro sinistro1 = new Sinistro("01/01/2023", "rua do sinistro1 numero 1");
		System.out.println(sinistro1.toString());
		sinistro1.setData("02/02/2023");
		sinistro1.setId(111);
		sinistro1.setEndereco("rua do novo sinistro1 numero 1");
		System.out.println("dados do sinistro1 depois do set dos atributos");
		System.out.println(sinistro1.toString());
		
		//testar se gerador de id esta criando novos ids
		System.out.println("dados sinistro2 para ver se ha o incremento do id");
		Sinistro sinistro2 = new Sinistro("02/02/2023", "rua do sinistro2 numero 2");
		System.out.println(sinistro2.toString());
		//testar se o contador não está duplicando o id nos objetos
		System.out.println("dados sinistro 1 para ver se o id permanece igual antes da criacao do sinistro1");
		System.out.println(sinistro1.toString());
		
		//cliente com cpf invalido numero tudo igual
		Cliente cliente1 = new Cliente("nomecliente1", "333.333.333-33", "11/11/1981", 11, "rua cliente1 numero 1");
		System.out.println(cliente1.toString());
		cliente1.setNome("novonomecliente");
		cliente1.setDataNascimento("22/12/1988");
		cliente1.setIdade(42);
		cliente1.setEndereco("rua do novo cliente1 numero 1");
		System.out.println("dados do cliente1 depois do set dos atributos");
		System.out.println(cliente1.toString());
		
		//cliente com cpf invalido (digitos invalidos)
		Cliente cliente2 = new Cliente("nomecliente2", "123.321.145-88", "12/12/1982", 22, "rua cliente2 numero 2");
		System.out.println("teste do cliente2 com cpf invalido (digitos invalidos)");
		System.out.println(cliente2.toString());
		
		//cliente com cpf valido
		Cliente cliente3 = new Cliente("nomecliente3", "378.882.372-07", "23/01/1983", 33, "rua cliente3 numero 3");
		System.out.println("dados cliente3 com cpf valido");
		System.out.println(cliente3.toString());
		//testar outros cpf
		System.out.println("teste de validacao de cpf");
		cliente1.setCpf("378.882.372-05");
		System.out.println("CPF " + cliente1.getCpf() + ": " + cliente1.validarCPF());
		cliente1.setCpf("527.890.545-09"); //CPF com resto divisao primeiro digito igual a 10
		System.out.println("CPF " + cliente1.getCpf() + ": " + cliente1.validarCPF());
		cliente1.setCpf("527.891.545-88");
		System.out.println("CPF " + cliente1.getCpf() + ": " + cliente1.validarCPF());
		cliente1.setCpf("554.885.830-09");
		System.out.println("CPF " + cliente1.getCpf() + ": " + cliente1.validarCPF());
		cliente1.setCpf("965.891.876-88");
		System.out.println("CPF " + cliente1.getCpf() + ": " + cliente1.validarCPF());
		cliente1.setCpf("372.665.347-39");
		System.out.println("CPF " + cliente1.getCpf() + ": " + cliente1.validarCPF());

		//System.out.println(cliente1.nome); (nao funciona, erro The field Cliente.nome is not visible)
		//pois o atributo cliente1.nome é privado
		
		
	}

}


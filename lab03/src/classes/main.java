package classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
//import java.util.List;
import java.util.stream.Collectors;

public class main {

	public static void main(String[] args) {
		
		//declarar as datas a serem utilizadas e formatar datas
		SimpleDateFormat formatadata = new SimpleDateFormat("dd/MM/yyyy");
		Date data1 = null, data2 = null, data3 = null, data4 = null, data5 = null, data6 = null, data7 = null, data8 = null; 
		try {
		data1 = formatadata.parse("01/01/2020");
		data2 = formatadata.parse("02/02/2020");
		data3 = formatadata.parse("03/03/2020");
		data4 = formatadata.parse("04/04/2020");
		data5 = formatadata.parse("05/05/2020");
		data6 = formatadata.parse("06/06/2020");
		data7 = formatadata.parse("07/07/2020");
		data8 = formatadata.parse("08/08/2020");
		
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//instanciando veiculos
		Veiculo veiculopj1n1 = new Veiculo("apj1111", "marcapj11", "modelopj11", 2021);
		Veiculo veiculopj1n2 = new Veiculo("apj1222", "marcapj12", "modelopj12", 2012);
		Veiculo veiculopj2n1 = new Veiculo("apj2111", "marcapj2", "modelopj2", 2022);
		Veiculo veiculopj3n1 = new Veiculo("apj3111", "marcapj3", "modelopj3", 2023);
		Veiculo veiculopf1n1 = new Veiculo("apf1111", "marcapf11", "modelopf11", 2001);
		Veiculo veiculopf1n2 = new Veiculo("apf1222", "marcapf12", "modelopf12", 2012);
		Veiculo veiculopf2n1 = new Veiculo("apf1111", "marcapf2", "modelopf2", 2022);
		Veiculo veiculopf3n1 = new Veiculo("apf1111", "marcapf3", "modelopf3", 2023);
		
		//instanciando clientes
		ClientePJ clientepj1 = new ClientePJ("nomeclientepj1", "enderecoclientepj1", data1, 
				"escolaridadeclientepj1", "generoclientepj1", "classeeconomicaclientepj1",
				 "68.518.377/0001-70", data2);
		ClientePJ clientepj2 = new ClientePJ("nomeclientepj2", "enderecoclientepj2", data2, 
				"escolaridadeclientepj2", "generoclientepj2", "classeeconomicaclientepj2",
				 "41.432.958/0001-19", data1);
		ClientePJ clientepj3 = new ClientePJ("nomeclientepj3", "enderecoclientepj3", data3, 
				"escolaridadeclientepj3", "generoclientepj3", "classeeconomicaclientepj3",
				 "28.378.541/0001-77", data4);
		ClientePF clientepf1 = new ClientePF("nomeclientepf1", "enderecoclientepf1", data4, 
				"escolaridadeclientepf1", "generoclientepf1", "classeeconomicaclientepf1",
				 "328.674.460-31", data3);
		ClientePF clientepf2 = new ClientePF("nomeclientepf2", "enderecoclientepf2", data5, 
				"escolaridadeclientepf2", "generoclientepf2", "classeeconomicaclientepf2",
				 "353.289.360-50", data6);
		ClientePF clientepf3 = new ClientePF("nomeclientepf3", "enderecoclientepf3", data6, 
				"escolaridadeclientepf3", "generoclientepf3", "classeeconomicaclientepf3",
				 "577.180.600-55", data5);
		
	
		//adicionando veiculos aos clientes, 2 veiculos ao clientepj1 e 2 ao clientepf1
		//os outros apenas 1 veiculo
		clientepj1.adicionaVeiculo(veiculopj1n1);
		clientepj1.adicionaVeiculo(veiculopj1n2);
		clientepj2.adicionaVeiculo(veiculopj2n1);
		clientepj3.adicionaVeiculo(veiculopj3n1);
		clientepf1.adicionaVeiculo(veiculopf1n1);
		clientepf1.adicionaVeiculo(veiculopf1n2);
		clientepf2.adicionaVeiculo(veiculopf2n1);
		clientepf2.adicionaVeiculo(veiculopf3n1);
		
		//testando validade de CPF e CNPJ
		System.out.print("validade do CNPJ do clientepj1: " + clientepj1.validarCNPJ() + "\n");
		System.out.print("validade do CNPJ do clientepj2: " + clientepj2.validarCNPJ() + "\n");
		System.out.print("validade do CPF do clientepf1: " + clientepf1.validarCPF() + "\n");
		System.out.print("validade do CPF do clientepf2: " + clientepf2.validarCPF() + "\n");
		
		//metodos toString() clientes e veiculo
		System.out.print("\nmétodo to string de Clientepj" + clientepj1.toString());
		System.out.print("\nmétodo to string de Clientepf" + clientepf1.toString());
		System.out.print("\nmétodo to string de Veiculo" + veiculopf1n1.toString());
		
		//instanciando seguradora
		Seguradora seguradora1 = new Seguradora("nomeseguradora1", "1912341234", "seguradora1@seg.com", "enderecoseguradora1");
		
		//cadastrando clientes
		System.out.println("\ncadastrando clientepj1: " + seguradora1.cadastrarCliente(clientepj1));
		System.out.println("cadastrando clientepj2: " + seguradora1.cadastrarCliente(clientepj2));
		System.out.println("cadastrando clientepj3: " + seguradora1.cadastrarCliente(clientepj3));
		System.out.println("cadastrando clientepj3 existente: " + seguradora1.cadastrarCliente(clientepj3));
		System.out.println("cadastrando clientepf1: " + seguradora1.cadastrarCliente(clientepf1));
		System.out.println("cadastrando clientepf2: " + seguradora1.cadastrarCliente(clientepf2));
		System.out.println("cadastrando clientepf3: " + seguradora1.cadastrarCliente(clientepf3));
		System.out.println("cadastrando clientepf3 existente: " + seguradora1.cadastrarCliente(clientepf3));
		
		
		//removendo cliente pj2 e pf2
		System.out.println("\nremovendo cliente pj2: " + seguradora1.removerCliente("41.432.958/0001-19"));
		System.out.println("removendo cliente pf2: " + seguradora1.removerCliente("353.289.360-50"));
		System.out.println("removendo cliente que nao existe: " + seguradora1.removerCliente("888.289.360-60"));
		
		//gerar 2 sinistros e repetindo o ultimo: teste insercao sinistro repetido
		System.out.println("\ninserindo sinistro: " + seguradora1.gerarSinistro(data7, "enderecodosinistro1", veiculopf1n2, clientepf1));
		System.out.println("inserindo sinistro: " + seguradora1.gerarSinistro(data8, "enderecodosinistro2", veiculopj1n2, clientepj1));
		System.out.println("inserindo sinistro repetido: " + seguradora1.gerarSinistro(data8, "enderecodosinistro2", veiculopj1n2, clientepj1));

		System.out.print("\nmétodo to string de Seguradora" + seguradora1.toString() + "\n");
		
		System.out.print("\nlistar sinistro" + seguradora1.listarSinistros());
		
		seguradora1.visualizarSinistro("nomeclientepf1");
		
		System.out.print("\nlista de todos clientes: " + seguradora1.getListaClientes().stream().map(Cliente::getNome).collect(Collectors.toList()) + "\n");
		
		System.out.println("\nlista de clientes PJ" );
		System.out.println(seguradora1.listarClientes("PJ")); //.stream().map(Cliente::getNome).collect(Collectors.toList()) + "\n");
		System.out.println("lista de clientes PF" );
		System.out.println(seguradora1.listarClientes("PF")); //.stream().map(Cliente::getNome).collect(Collectors.toList()) + "\n");
		
		boolean a = true;
        Scanner scan = new Scanner(System.in);
        while(a) {
	        System.out.println("\nentre com a opcao desejada: \n"
	        		         + "1 - listar clientes pessoa juridica da seguradora \n"
	        		         + "2 - listar clientes pessoa fisica da seguradora \n"
	        		         + "3 - listar sinistros da seguradora \n"
	        		         + "4 - sair");
	        String opcao = scan.next();
	        switch (opcao) {
	        case "1":
	        	System.out.println("\nlista de clientes PJ" );
	        	System.out.println(seguradora1.listarClientes("PJ") + "\n");
	        	System.out.println("\nentre com o nome do cliente para visualizar ou 0 para voltar" );
	        	String opcao2 = scan.next();
	        	if (opcao2 == "0") break;
	    		for (Cliente cliente : seguradora1.getListaClientes()) {
    				if(cliente.getNome().equals(opcao2)) {
    					System.out.println(cliente);
    				}						
	    		}
	        	
	        	break;
	        case "2":
	        	System.out.println("lista de clientes PF" );
	        	System.out.println(seguradora1.listarClientes("PF") + "\n");
	        	System.out.println("\nentre com o nome do cliente para visualizar ou 0 para voltar" );
	        	String opcao3 = scan.next();
	        	if (opcao3 == "0") break;
	    		for (Cliente cliente : seguradora1.getListaClientes()) {
    				if(cliente.getNome().equals(opcao3)) {
    					System.out.println(cliente);
    				}						
	    		}
	        	break;
	        case "3":
	        	System.out.println("lista de sinistros" );
	        	System.out.println(seguradora1.getListaSinistros().stream().map(Sinistro::getId).collect(Collectors.toList()) + "\n");
	        	System.out.println("\nentre com o id do sinistro para visualizar ou 0 para voltar" );
	        	String opcao4 = scan.next();
	        	if (opcao4 == "0") break;
	        	for(Sinistro sinistro : seguradora1.getListaSinistros()) {
	        		if(Integer.toString(sinistro.getId()).equals(opcao4)) {
	        			System.out.println(sinistro);
	        		}
	        	}
	        	break;
	        	
	        case "4":
	        	a = false;
	        	scan.close();
	        }
        }
        
        
		
	}

}


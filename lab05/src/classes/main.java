package classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
//import java.util.List;
import java.util.stream.Collectors;

public class main {
	public static void main(String[] args) {
		
		SimpleDateFormat formatadata = new SimpleDateFormat("dd/MM/yyyy");
		Date data1 = null, data2 = null, data3 = null, data4 = null, data5 = null, data6 = null, data7 = null, data8 = null; 
		try {
		data1 = formatadata.parse("01/01/2020");
		data2 = formatadata.parse("02/02/2000");
		data3 = formatadata.parse("03/03/2020");
		data4 = formatadata.parse("04/04/2000");
		data5 = formatadata.parse("05/05/1990");
		data6 = formatadata.parse("06/06/1950");
		data7 = formatadata.parse("07/07/1990");
		data8 = formatadata.parse("08/08/2000");
		
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	Frota frota1 = new Frota("codigofrota1");
	
	Frota frota2 = new Frota("codigofrota1");
	
	Veiculo veiculo1 = new Veiculo("placa1", "marca1", "modelo1", 1994);
	
	
	//System.out.println(veiculo1.toString());
	
	System.out.println(frota1.toString());
	
	frota1.addVeiculo(veiculo1);
	
	System.out.println(frota1.toString());
	
	frota1.addVeiculo(veiculo1);
	
	ClientePJ clientePJ1 = new ClientePJ("nome1", "telefone1", "endereco1", "email1", "cnpj1", data1);

	System.out.println(clientePJ1.toString());
	
	clientePJ1.cadastrarFrota(frota1);
	
	System.out.println(clientePJ1.cadastrarFrota(frota2));
	
	
	

//		
//		ArrayList<Seguradora> listaSeguradora = new ArrayList<Seguradora>();
//		
//		//declarar as datas a serem utilizadas e formatar datas
//		SimpleDateFormat formatadata = new SimpleDateFormat("dd/MM/yyyy");
//		Date data1 = null, data2 = null, data3 = null, data4 = null, data5 = null, data6 = null, data7 = null, data8 = null; 
//		try {
//		data1 = formatadata.parse("01/01/2020");
//		data2 = formatadata.parse("02/02/2000");
//		data3 = formatadata.parse("03/03/2020");
//		data4 = formatadata.parse("04/04/2000");
//		data5 = formatadata.parse("05/05/1990");
//		data6 = formatadata.parse("06/06/1950");
//		data7 = formatadata.parse("07/07/1990");
//		data8 = formatadata.parse("08/08/2000");
//		
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		//instanciando veiculos
//		Veiculo veiculopj1n1 = new Veiculo("apj1111", "marcapj11", "modelopj11", 2021);
//		Veiculo veiculopj1n2 = new Veiculo("apj1222", "marcapj12", "modelopj12", 2012);
//		Veiculo veiculopj2n1 = new Veiculo("apj2111", "marcapj2", "modelopj2", 2022);
//		Veiculo veiculopj3n1 = new Veiculo("apj3111", "marcapj3", "modelopj3", 2023);
//		Veiculo veiculopf1n1 = new Veiculo("apf1111", "marcapf11", "modelopf11", 2001);
//		Veiculo veiculopf1n2 = new Veiculo("apf1222", "marcapf12", "modelopf12", 2012);
//		Veiculo veiculopf2n1 = new Veiculo("apf1111", "marcapf2", "modelopf2", 2022);
//		Veiculo veiculopf3n1 = new Veiculo("apf1111", "marcapf3", "modelopf3", 2023);
//		
//
//		
//		//instanciando clientes
//		ClientePJ clientepj1 = new ClientePJ("nomeclientepj1", "enderecoclientepj1",
//				"68.518.377/0001-70", data1, 10);
//		ClientePJ clientepj2 = new ClientePJ("nomeclientepj2", "enderecoclientepj2",
//				"41.432.958/0001-19", data2, 20);
//		ClientePJ clientepj3 = new ClientePJ("nomeclientepj3", "enderecoclientepj3",
//				"28.378.541/0001-77", data3, 30);		
//		
//		ClientePF clientepf1 = new ClientePF("nomeclientepf1", "enderecoclientepf1",
//				"328.674.460-31", "generoclientepf1", data4, "escolaridadeclientepf1", data3,
//				 "classeeconomicaclientepf1");
//		ClientePF clientepf2 = new ClientePF("nomeclientepf2", "enderecoclientepf2",
//				"353.289.360-50", "generoclientepf2", data5, "escolaridadeclientepf2", data6,
//				"classeeconomicaclientepf2");
//		ClientePF clientepf3 = new ClientePF("nomeclientepf3", "enderecoclientepf3",
//				"577.180.600-55", "generoclientepf3", data6, "escolaridadeclientepf3", data5,
//				 "classeeconomicaclientepf3");
//		
//	
//		//adicionando veiculos aos clientes, 2 veiculos ao clientepj1 e 2 ao clientepf1
//		//os outros apenas 1 veiculo
//		clientepj1.adicionaVeiculo(veiculopj1n1);
//		clientepj1.adicionaVeiculo(veiculopj1n2);
//		clientepj2.adicionaVeiculo(veiculopj2n1);
//		clientepj3.adicionaVeiculo(veiculopj3n1);
//		clientepf1.adicionaVeiculo(veiculopf1n1);
//		clientepf1.adicionaVeiculo(veiculopf1n2);
//		clientepf2.adicionaVeiculo(veiculopf2n1);
//		clientepf3.adicionaVeiculo(veiculopf3n1);
//		
//		//instanciando seguradora
//		Seguradora seguradora1 = new Seguradora("nomeseguradora1", "1912341234", "seguradora1@seg.com", "enderecoseguradora1");
//		listaSeguradora.add(seguradora1);
//		
//		//cadastrando clientes
//		System.out.println("\ncadastrando clientepj1: " + seguradora1.cadastrarCliente(clientepj1));
//		System.out.println("cadastrando clientepj2: " + seguradora1.cadastrarCliente(clientepj2));
//		System.out.println("cadastrando clientepj3: " + seguradora1.cadastrarCliente(clientepj3));
//		System.out.println("cadastrando clientepj3 existente: " + seguradora1.cadastrarCliente(clientepj3));
//		System.out.println("cadastrando clientepf1: " + seguradora1.cadastrarCliente(clientepf1));
//		System.out.println("cadastrando clientepf2: " + seguradora1.cadastrarCliente(clientepf2));
//		System.out.println("cadastrando clientepf3: " + seguradora1.cadastrarCliente(clientepf3));
//		System.out.println("cadastrando clientepf3 existente: " + seguradora1.cadastrarCliente(clientepf3));
//				
//		//gerar 2 sinistros e repetindo o ultimo: teste insercao sinistro repetido
//		System.out.println("\ninserindo sinistro: " + seguradora1.gerarSinistro(data7, "enderecodosinistro1", veiculopf1n2, clientepf1));
//		System.out.println("inserindo sinistro: " + seguradora1.gerarSinistro(data8, "enderecodosinistro2", veiculopj1n2, clientepj1));
//		System.out.println("inserindo sinistro repetido: " + seguradora1.gerarSinistro(data8, "enderecodosinistro2", veiculopj1n2, clientepj1));
//		System.out.println("inserindo sinistro: " + seguradora1.gerarSinistro(data8, "enderecodosinistro21", veiculopj1n2, clientepj1));
//		System.out.println("inserindo sinistro: " + seguradora1.gerarSinistro(data8, "enderecodosinistro22", veiculopj1n2, clientepj2));
//		System.out.println("inserindo sinistro: " + seguradora1.gerarSinistro(data8, "enderecodosinistro23", veiculopj1n2, clientepj3));
//		System.out.println("inserindo sinistro: " + seguradora1.gerarSinistro(data8, "enderecodosinistro24", veiculopj1n2, clientepf1));
//		System.out.println("inserindo sinistro: " + seguradora1.gerarSinistro(data8, "enderecodosinistro25", veiculopj1n2, clientepf2));
//		System.out.println("inserindo sinistro: " + seguradora1.gerarSinistro(data8, "enderecodosinistro26", veiculopj1n2, clientepf3));
//		
//		//listando sinistros
//		System.out.println("\nlista de sinistros: \n" + seguradora1.listarSinistros());
//		
//		
//		//listando todos os clientes
//		System.out.print("\nlista de todos clientes: \n" + seguradora1.getListaClientes().stream().map(Cliente::getNome).collect(Collectors.toList()) + "\n");
//		
//		//listando clientes por CPF ou CNPJ
//		System.out.println("\nlista de clientes PJ" );
//		System.out.println(seguradora1.listarClientes("PJ").stream().map(Cliente::getNome).collect(Collectors.toList()) + "\n");
//		System.out.println("lista de clientes PF" );
//		System.out.println(seguradora1.listarClientes("PF").stream().map(Cliente::getNome).collect(Collectors.toList()) + "\n");
//		
//		//visualizar sinistro
//		System.out.println("sinistro 202: " );
//		seguradora1.visualizarSinistro(202);
//		
//		//listando sinistros
//		System.out.println("\nlista de sinistros: \n" + seguradora1.listarSinistros());
//
//		System.out.println("\nReceita R$: " + seguradora1.calcularReceita());
//		
//		for (int i = 0; i < seguradora1.getListaClientes().size(); i++) {
//			seguradora1.calcularPrecoSeguroCliente(seguradora1.getListaClientes().get(i));
//		}
//		
//		System.out.println("\nReceita R$: " + seguradora1.calcularReceita());
//		
//        
//        Scanner scan = new Scanner (System.in);
//        FuncoesMenu.menuPrincipal(scan, listaSeguradora);
//
//
	    }
		
	

		
}

	

	


	



	




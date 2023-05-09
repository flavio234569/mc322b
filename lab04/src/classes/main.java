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
		
		ArrayList<Seguradora> listaSeguradora = new ArrayList<Seguradora>();
		
		//declarar as datas a serem utilizadas e formatar datas
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
		ClientePJ clientepj1 = new ClientePJ("nomeclientepj1", "enderecoclientepj1",
				"68.518.377/0001-70", data1, 10);
		ClientePJ clientepj2 = new ClientePJ("nomeclientepj2", "enderecoclientepj2",
				"41.432.958/0001-19", data2, 20);
		ClientePJ clientepj3 = new ClientePJ("nomeclientepj3", "enderecoclientepj3",
				"28.378.541/0001-77", data3, 30);		
		
		ClientePF clientepf1 = new ClientePF("nomeclientepf1", "enderecoclientepf1",
				"328.674.460-31", "generoclientepf1", data4, "escolaridadeclientepf1", data3,
				 "classeeconomicaclientepf1");
		ClientePF clientepf2 = new ClientePF("nomeclientepf2", "enderecoclientepf2",
				"353.289.360-50", "generoclientepf2", data5, "escolaridadeclientepf2", data6,
				"classeeconomicaclientepf2");
		ClientePF clientepf3 = new ClientePF("nomeclientepf3", "enderecoclientepf3",
				"577.180.600-55", "generoclientepf3", data6, "escolaridadeclientepf3", data5,
				 "classeeconomicaclientepf3");
		
	
		//adicionando veiculos aos clientes, 2 veiculos ao clientepj1 e 2 ao clientepf1
		//os outros apenas 1 veiculo
		clientepj1.adicionaVeiculo(veiculopj1n1);
		clientepj1.adicionaVeiculo(veiculopj1n2);
		clientepj2.adicionaVeiculo(veiculopj2n1);
		clientepj3.adicionaVeiculo(veiculopj3n1);
		clientepf1.adicionaVeiculo(veiculopf1n1);
		clientepf1.adicionaVeiculo(veiculopf1n2);
		clientepf2.adicionaVeiculo(veiculopf2n1);
		clientepf3.adicionaVeiculo(veiculopf3n1);
		
		//metodos toString() clientes e veiculo
		System.out.print("\nmétodo to string de Clientepj" + clientepj1.toString());
		System.out.print("\nmétodo to string de Clientepf" + clientepf1.toString());
		System.out.print("\nmétodo to string de Veiculo" + veiculopf1n1.toString());
		
		//instanciando seguradora
		Seguradora seguradora1 = new Seguradora("nomeseguradora1", "1912341234", "seguradora1@seg.com", "enderecoseguradora1");
		listaSeguradora.add(seguradora1);
		
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
//		System.out.println("\nremovendo cliente pj2: " + seguradora1.removerCliente("41.432.958/0001-19"));
//		System.out.println("removendo cliente pf2: " + seguradora1.removerCliente("353.289.360-50"));
//		System.out.println("removendo cliente que nao existe: " + seguradora1.removerCliente("888.289.360-60"));
		
		//gerar 2 sinistros e repetindo o ultimo: teste insercao sinistro repetido
		System.out.println("\ninserindo sinistro: " + seguradora1.gerarSinistro(data7, "enderecodosinistro1", veiculopf1n2, clientepf1));
		System.out.println("inserindo sinistro: " + seguradora1.gerarSinistro(data8, "enderecodosinistro2", veiculopj1n2, clientepj1));
		System.out.println("inserindo sinistro repetido: " + seguradora1.gerarSinistro(data8, "enderecodosinistro2", veiculopj1n2, clientepj1));
		System.out.println("inserindo sinistro: " + seguradora1.gerarSinistro(data8, "enderecodosinistro21", veiculopj1n2, clientepj1));
		System.out.println("inserindo sinistro: " + seguradora1.gerarSinistro(data8, "enderecodosinistro22", veiculopj1n2, clientepj2));
		System.out.println("inserindo sinistro: " + seguradora1.gerarSinistro(data8, "enderecodosinistro23", veiculopj1n2, clientepj3));
		System.out.println("inserindo sinistro: " + seguradora1.gerarSinistro(data8, "enderecodosinistro24", veiculopj1n2, clientepf1));
		System.out.println("inserindo sinistro: " + seguradora1.gerarSinistro(data8, "enderecodosinistro25", veiculopj1n2, clientepf2));
		System.out.println("inserindo sinistro: " + seguradora1.gerarSinistro(data8, "enderecodosinistro26", veiculopj1n2, clientepf3));

		
		
		
		//metodo toString() de seguradora
		System.out.print("\nmétodo to string de Seguradora" + seguradora1.toString() + "\n");
		
		//listando sinistros
		System.out.println("\nlista de sinistros: \n" + seguradora1.listarSinistros());
		
		//visualizar sinistro de id == 1
		System.out.print("\nvisualizar sinistro de id == 1");
		seguradora1.visualizarSinistro(1);
		
		//listando todos os clientes
		System.out.print("\nlista de todos clientes: \n" + seguradora1.getListaClientes().stream().map(Cliente::getNome).collect(Collectors.toList()) + "\n");
		
		//listando clientes por CPF ou CNPJ
		System.out.println("\nlista de clientes PJ" );
		System.out.println(seguradora1.listarClientes("PJ")); //.stream().map(Cliente::getNome).collect(Collectors.toList()) + "\n");
		System.out.println("lista de clientes PF" );
		System.out.println(seguradora1.listarClientes("PF")); //.stream().map(Cliente::getNome).collect(Collectors.toList()) + "\n");
		
		
		
		
		Date abn = data1;
		
		boolean ab = Validacao.validarCPF("328.674.460-31");
		System.out.print(ab);
		
		boolean abc = Validacao.validarCNPJ("54.873.722/0001-80");
		System.out.print("\n" + abc);
		        
        boolean abcd = Validacao.validarNome("qwer tyui opasdfgh");
        System.out.print("\n" + abcd + "\n");
        
        
        System.out.print("score " + clientepf1.calculaScore() + "\n");
        System.out.print("score " + clientepf2.calculaScore() + "\n");
        System.out.print("score " + clientepf3.calculaScore() + "\n");
        
        System.out.print(seguradora1.toString());
        
        
        System.out.print("\n\n" + clientepf1.getValorSeguro());
        System.out.print("\n" + clientepf2.getValorSeguro());
        System.out.print("\n" + clientepf3.getValorSeguro());
        
        System.out.print("\n" + seguradora1.calcularReceita());
        
        
        MenuOperacoes menuOperacoes[] = MenuOperacoes.values();
        MenuCadastrar menuCadastrar[] = MenuCadastrar.values();
        MenuListar menuListar[] = MenuListar.values();
        MenuExcluir menuExcluir[] = MenuExcluir.values();
        
        
        
        int opUsuario;
        boolean a = true;
        Scanner scan = new Scanner (System.in);
		while (a) {
			System.out.println("\n");
	        for (MenuOperacoes mp: menuOperacoes) {
	        	System.out.println(mp.ordinal() + " - " + mp.getStringmenu());
	        	}
	        System.out.println("entre com uma opção:\n");
	        opUsuario = scan.nextInt();

			
			switch(opUsuario) {
				case 0:
					System.out.println("cadastros");
					menuCadastrar(scan, menuCadastrar, listaSeguradora);
				break;
				case 1:
					System.out.println("listas");
					menuListar(scan, menuListar, listaSeguradora);
				break;
				case 2:
					System.out.println("excluir");
					menuExcluir(scan, menuExcluir, listaSeguradora);
				break;
				case 3:
					System.out.println("gerar sinistro");
					
					
					
					
				break;
				case 4:
					System.out.println("transferir seguro");
				break;
				case 5:
					System.out.println("calcular receita seguradora");
				break;
				case 6:
					System.out.println("sair");
					a = false;
				break;
				default:
					a = false;
					System.out.println("sair");
				break;
				
			}

	    }
		
		

		
	}
	private static void menuCadastrar(Scanner scan, MenuCadastrar menuCadastrar[], ArrayList<Seguradora> listaSeguradora) {
        for (MenuCadastrar mc: menuCadastrar) {
        	System.out.println(mc.ordinal() + " - " + mc.getStringmenucadastrar());
        	}
        int opUsuario = scan.nextInt();
        
		switch(opUsuario) {
		case 0:
			
			System.out.println("digite 0 para PF e 1 para PJ");
			int pfoupj = scan.nextInt();
			System.out.println("selecione a seguradora\n");
			for (int i = 0; i < listaSeguradora.size(); i++) {
				
				System.out.println(i + " - " + listaSeguradora.get(i).getNome());
			}
			int indexSeguradora = scan.nextInt();
			
//			System.out.println("selecione a seguradora\n");
//			for (int i = 0; i < listaSeguradora.size(); i++) {
//				
//				System.out.println(i + " - " + listaSeguradora.get(i).getNome());
//			}
//			indexSeguradora = scan.nextInt();
//			System.out.println("selecione o cliente\n");
//			for (int i = 0; i < listaSeguradora.get(indexSeguradora).getListaClientes().size(); i++) {
//		
//				System.out.println(i + " - " + listaSeguradora.get(indexSeguradora).getListaClientes().get(i).getNome());
//			}
//			int indexCliente = scan.nextInt();

		

			
			if (pfoupj == 0) {
				
				scan.nextLine();
				System.out.println("entre o nome do cliente");
				String nome = scan.nextLine();
				System.out.println("entre o endereco do cliente");
				String endereco = scan.nextLine();
//				System.out.println("entre o valor do seguro do cliente");
//				Double valorSeguro = scan.nextDouble();
//				scan.nextLine();
				System.out.println("entre o CPF do cliente");
				String CPF = scan.nextLine();
				System.out.println("entre o genero do cliente");
				String genero = scan.nextLine();
				System.out.println("entre a data de licenca do cliente no formato dd/MM/yyyy");
				String stringDataLicenca = scan.nextLine();
				System.out.println("entre a escolaridade do cliente");
				String educacao = scan.nextLine();
				System.out.println("entre a data de nascimento do cliente no formato dd/MM/yyyy");
				String stringDataNascimento = scan.nextLine();
				System.out.println("entre a classe economica do cliente");
				String classeEconomica = scan.nextLine();

				SimpleDateFormat formatadata = new SimpleDateFormat("dd/MM/yyyy");
				Date dataLicenca = null;
				Date dataNascimento = null;
				try {
					dataLicenca = formatadata.parse(stringDataLicenca);
					dataNascimento = formatadata.parse(stringDataNascimento);
					
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				Cliente cliente = new ClientePF(nome, endereco, CPF, 
						genero, dataLicenca, educacao, dataNascimento, classeEconomica);
				listaSeguradora.get(indexSeguradora).cadastrarCliente(cliente);
				
			}
			if (pfoupj == 1) {

				scan.nextLine();
				System.out.println("entre o nome do cliente");
				String nome = scan.nextLine();
				System.out.println("entre o endereco do cliente");
				String endereco = scan.nextLine();
//				System.out.println("entre o valor do seguro do cliente");
//				Double valorSeguro = scan.nextDouble();
//				scan.nextLine();
				System.out.println("entre o cnpj do cliente");
				String CNPJ = scan.nextLine();
				System.out.println("entre a data de fundacao do cliente no formato dd/MM/yyyy");
				String stringDataFundacao = scan.nextLine();
				System.out.println("entre a escolaridade do cliente");
				int qtdeFuncionario = scan.nextInt();

				SimpleDateFormat formatadata = new SimpleDateFormat("dd/MM/yyyy");
				Date dataFundacao = null;
				try {
					dataFundacao = formatadata.parse(stringDataFundacao);
					
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				Cliente cliente = new ClientePJ(nome, endereco, CNPJ, 
						dataFundacao, qtdeFuncionario);
				listaSeguradora.get(indexSeguradora).cadastrarCliente(cliente);
			}
		break;
		case 1:
			System.out.println("selecione a seguradora\n");
			for (int i = 0; i < listaSeguradora.size(); i++) {
				
				System.out.println(i + " - " + listaSeguradora.get(i).getNome());
			}
			indexSeguradora = scan.nextInt();
			System.out.println("selecione o cliente\n");
			for (int i = 0; i < listaSeguradora.get(indexSeguradora).getListaClientes().size(); i++) {
		
				System.out.println(i + " - " + listaSeguradora.get(indexSeguradora).getListaClientes().get(i).getNome());
			}
			int indexCliente = scan.nextInt();
			scan.nextLine();
			System.out.println("entre a placa do veiculo");
			String placa = scan.nextLine();
			System.out.println("entre a marca do veiculo");
			String marca = scan.nextLine();
			System.out.println("entre o modelo do veiculo");
			String modelo = scan.nextLine();
			System.out.println("entre o ano do veiculo");
			int ano = scan.nextInt();
			
			Veiculo veiculo = new Veiculo(placa, marca, modelo, ano);
			listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente).adicionaVeiculo(veiculo);
			listaSeguradora.get(indexSeguradora).calcularPrecoSeguroCliente(listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente));
			
		break;
		case 2:
			scan.nextLine();
			System.out.println("entre o nome da seguradora");
			String nome = scan.nextLine();
			System.out.println("entre o telefone da seguradora");
			String telefone = scan.nextLine();
			System.out.println("entre o email da seguradora");
			String email = scan.nextLine();
			System.out.println("entre o endereco da seguradora");
			String endereco = scan.nextLine();
			Seguradora seguradora = new Seguradora(nome, telefone, email, endereco);
			listaSeguradora.add(seguradora);
			
		break;
		case 3:
			System.out.println("voltar");
		break;
        
		}
		
	}
	
	private static void menuListar(Scanner scan, MenuListar menuListar[], ArrayList<Seguradora> listaSeguradora) {
        for (MenuListar ml: menuListar) {
        	System.out.println(ml.ordinal() + " - " + ml.getStringmenucadastrar());
        	}
        int opUsuario = scan.nextInt();
        
		switch(opUsuario) {
		case 0:
			for (int i = 0; i < listaSeguradora.size(); i++) {
				System.out.println("Seguradora: " + listaSeguradora.get(i).getNome());
				System.out.println("Clientes: " + listaSeguradora.get(i).getListaClientes().stream().map(Cliente::getNome).collect(Collectors.toList()));
			}
		break;
		case 1:
			for (int i = 0; i < listaSeguradora.size(); i++) {
				System.out.println("Seguradora: " + listaSeguradora.get(i).getNome());
				System.out.println("Sinistros(ID): " + listaSeguradora.get(i).getListaSinistros().stream().map(Sinistro::getId).collect(Collectors.toList()));
				
			}
		break;
		case 2:
			System.out.println("selecione a seguradora\n");
			for (int i = 0; i < listaSeguradora.size(); i++) {
				
				System.out.println(i + " - " + listaSeguradora.get(i).getNome());
			}
			int indexSeguradora = scan.nextInt();
			System.out.println("selecione o cliente\n");
			for (int i = 0; i < listaSeguradora.get(indexSeguradora).getListaClientes().size(); i++) {
		
				System.out.println(i + " - " + listaSeguradora.get(indexSeguradora).getListaClientes().get(i).getNome());
			}
			int indexCliente = scan.nextInt();
			
			
			ArrayList<Sinistro> listasinistrosfiltrada = new ArrayList<Sinistro>();
			for (int i = 0; i < listaSeguradora.get(indexSeguradora).getListaSinistros().size(); i++) {
				if (listaSeguradora.get(indexSeguradora).getListaSinistros().get(i).getCliente().equals(listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente))) {
					
					listasinistrosfiltrada.add(listaSeguradora.get(indexSeguradora).getListaSinistros().get(i));
				}
			}
			System.out.println("Sinistros (ID): " + listasinistrosfiltrada.stream().map(Sinistro::getId).collect(Collectors.toList()));
			
			
			
			
			
		break;
		case 3:
			System.out.println("selecione a seguradora\n");
			for (int i = 0; i < listaSeguradora.size(); i++) {
				
				System.out.println(i + " - " + listaSeguradora.get(i).getNome());
			}
			indexSeguradora = scan.nextInt();
			System.out.println("selecione o cliente\n");
			for (int i = 0; i < listaSeguradora.get(indexSeguradora).getListaClientes().size(); i++) {
		
				System.out.println(i + " - " + listaSeguradora.get(indexSeguradora).getListaClientes().get(i).getNome());
			}
			indexCliente = scan.nextInt();
			System.out.println("Veiculos (placa): " + listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente).getListaVeiculos().stream().map(Veiculo::getPlaca).collect(Collectors.toList()));
			
		break;
		case 4:
			for (int i = 0; i < listaSeguradora.size(); i++) {
				System.out.println("Seguradora: " + listaSeguradora.get(i).getNome());
				for (int j = 0; j < listaSeguradora.get(i).getListaClientes().size(); j++) {
					System.out.println("Cliente: " + listaSeguradora.get(i).getListaClientes().get(j).getNome());
					System.out.println("Veiculos (placa): " + listaSeguradora.get(i).getListaClientes().get(j).getListaVeiculos().stream().map(Veiculo::getPlaca).collect(Collectors.toList()));
				}
				
			}		
			
			
			
			
		break;
		case 5:
			System.out.println("voltar");
		break;
        
		}
	}
	
	private static void menuExcluir(Scanner scan, MenuExcluir menuExcluir[], ArrayList<Seguradora> listaSeguradora) {
        for (MenuExcluir me: menuExcluir) {
        	System.out.println(me.ordinal() + " - " + me.getStringmenuexcluir());
        	}
        int opUsuario = scan.nextInt();
        
		switch(opUsuario) {
		case 0:
			System.out.println("selecione a seguradora\n");
			for (int i = 0; i < listaSeguradora.size(); i++) {
				
				System.out.println(i + " - " + listaSeguradora.get(i).getNome());
			}
			int indexSeguradora = scan.nextInt();
			System.out.println("selecione o cliente\n");
			
			for (int i = 0; i < listaSeguradora.get(indexSeguradora).getListaClientes().size(); i++) {
				System.out.println(i + " - " + listaSeguradora.get(indexSeguradora).getListaClientes().get(i).getNome());
			}
			int indexCliente = scan.nextInt();
			
			if (listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente) instanceof ClientePF) {
				ClientePF cliente2 = (ClientePF) listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente);
				System.out.print(cliente2.getCpf());
				listaSeguradora.get(indexSeguradora).removerCliente(cliente2.getCpf());
			}
			
			if (listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente) instanceof ClientePJ) {
				ClientePJ cliente2 = (ClientePJ) listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente);
				System.out.print(cliente2.getCnpj());
				listaSeguradora.get(indexSeguradora).removerCliente(cliente2.getCnpj());
			}


		break;
		case 1:
			System.out.println("selecione a seguradora\n");
			for (int i = 0; i < listaSeguradora.size(); i++) {
				
				System.out.println(i + " - " + listaSeguradora.get(i).getNome());
			}
			indexSeguradora = scan.nextInt();
			System.out.println("selecione o cliente\n");
			
			for (int i = 0; i < listaSeguradora.get(indexSeguradora).getListaClientes().size(); i++) {
				System.out.println(i + " - " + listaSeguradora.get(indexSeguradora).getListaClientes().get(i).getNome());
			}
			indexCliente = scan.nextInt();
			System.out.println("selecione o veiculo\n");
			for (int i = 0; i < listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente).getListaVeiculos().size(); i++) {
				System.out.println(i + " - " + listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente).getListaVeiculos().get(i).getPlaca());
			}
			int indexVeiculo = scan.nextInt();
			listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente).getListaVeiculos().remove(indexVeiculo);
			
			
			
			
		break;
		case 2:
			
			System.out.println("selecione a seguradora\n");
			for (int i = 0; i < listaSeguradora.size(); i++) {
				
				System.out.println(i + " - " + listaSeguradora.get(i).getNome());
			}
			indexSeguradora = scan.nextInt();
			System.out.println("selecione o sinistro\n");
			for (int i = 0; i < listaSeguradora.get(indexSeguradora).getListaSinistros().size(); i++) {
				System.out.println(i + " - " + listaSeguradora.get(indexSeguradora).getListaSinistros().get(i).getId());
			}
			int indexSinistro = scan.nextInt();
			
			listaSeguradora.get(indexSeguradora).getListaSinistros().remove(indexSinistro);
			
			
			
			
		break;

        
		}
	}

	



	

}


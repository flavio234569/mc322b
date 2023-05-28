package classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FuncoesMenu {
	 
     
	
//	static public void menuPrincipal(Scanner scan, ArrayList<Seguradora> listaSeguradora) {
//		
//        MenuOperacoes menuOperacoes[] = MenuOperacoes.values();
//        MenuCadastrar menuCadastrar[] = MenuCadastrar.values();
//        MenuListar menuListar[] = MenuListar.values();
//        MenuExcluir menuExcluir[] = MenuExcluir.values();
//        
//		 int opUsuario;
//	        boolean a = true;
//	        
//			while (a) {
//				System.out.println("\n");
//		        for (MenuOperacoes mp: menuOperacoes) {
//		        	System.out.println(mp.ordinal() + " - " + mp.getStringmenu());
//		        	}
//		        System.out.println("entre com uma opção:\n");
//		        opUsuario = scan.nextInt();
//
//				
//				switch(opUsuario) {
//					case 0:
//						System.out.println("cadastros");
//						subMenuCadastrar(scan, menuCadastrar, listaSeguradora);
//					break;
//					case 1:
//						System.out.println("listas");
//						subMenuListar(scan, menuListar, listaSeguradora);
//					break;
//					case 2:
//						System.out.println("excluir");
//						subMenuExcluir(scan, menuExcluir, listaSeguradora);
//					break;
//					case 3:
//						System.out.println("gerar sinistro");
//						gerarSinistro(scan, listaSeguradora);					
//					break;
//					case 4:
//						System.out.println("transferir seguro");
//						transferirSeguro(scan, listaSeguradora);					
//					break;
//					case 5:
//						System.out.println("calcular receita seguradora");
//						calcularReceitaSeguradora(scan, listaSeguradora);
//				        
//					break;
//					case 6:
//						System.out.println("sair");
//						a = false;
//					break;
//					default:
//						a = false;
//						System.out.println("sair");
//					break;
//					
//				}
//			}
//	}
//	
//	
//	
//	static public void subMenuExcluir(Scanner scan, MenuExcluir menuExcluir[], ArrayList<Seguradora> listaSeguradora) {
//        for (MenuExcluir me: menuExcluir) {
//        	System.out.println(me.ordinal() + " - " + me.getStringmenuexcluir());
//        	}
//        int opUsuario = scan.nextInt();
//        
//		switch(opUsuario) {
//		case 0:
//			System.out.println("excluir cliente\n");
//			excluirCliente(scan, listaSeguradora);
//		break;
//		case 1:
//			System.out.println("excluir veiculo\n");
//			excluirVeiculo(scan, listaSeguradora);	
//		break;
//		case 2:
//			System.out.println("excluir sinistro\n");
//			excluirSinistro(scan, listaSeguradora);
//		break;
//
//        
//		}
//	}
//	
//	
//	static public void subMenuListar(Scanner scan, MenuListar menuListar[], ArrayList<Seguradora> listaSeguradora) {
//        for (MenuListar ml: menuListar) {
//        	System.out.println(ml.ordinal() + " - " + ml.getStringmenucadastrar());
//        	}
//        int opUsuario = scan.nextInt();
//        
//		switch(opUsuario) {
//		case 0:
//			System.out.println("listar clientes por seguradora");
//			listarClientePorSeguradora(scan, listaSeguradora);
//		break;
//		case 1:
//			System.out.println("listar sinistros por seguradora");		
//			listarSinistroPorSeguradora(scan, listaSeguradora);
//		break;
//		case 2:
//			System.out.println("listar sinistros por cliente");
//			listarSinistroPorCliente(scan, listaSeguradora);
//		break;
//		case 3:
//			System.out.println("listar veiculos por cliente");
//			listarVeiculosPorCliente(scan, listaSeguradora);
//		break;
//		case 4:
//			System.out.println("listar veiculos por seguradora");
//			listarVeiculosPorSeguradora(scan, listaSeguradora);
//			
//		break;
//		case 5:
//			System.out.println("voltar");
//		break;
//        
//		}
//	}
//	
//	static public void subMenuCadastrar(Scanner scan, MenuCadastrar menuCadastrar[], ArrayList<Seguradora> listaSeguradora) {
//        for (MenuCadastrar mc: menuCadastrar) {
//        	System.out.println(mc.ordinal() + " - " + mc.getStringmenucadastrar());
//        	}
//        int opUsuario = scan.nextInt();
//        
//		switch(opUsuario) {
//		case 0:
//			System.out.println("cadastrar cliente");
//			cadastrarCliente(scan, listaSeguradora);
//		break;
//		case 1:
//			System.out.println("cadastrar veiculo");
//			cadastrarVeiculo(scan, listaSeguradora);
//		break;
//		case 2:
//			System.out.println("cadastrar Seguradora");
//			cadastrarSeguradora(scan, listaSeguradora);
//		break;
//		case 3:
//			System.out.println("voltar");
//		break;
//        
//		}
//		
//	}
//	
//	static public void excluirCliente(Scanner scan, ArrayList<Seguradora> listaSeguradora) {
//		System.out.println("selecione a seguradora\n");
//		for (int i = 0; i < listaSeguradora.size(); i++) {
//			
//			System.out.println(i + " - " + listaSeguradora.get(i).getNome());
//		}
//		int indexSeguradora = scan.nextInt();
//		System.out.println("selecione o cliente\n");
//		
//		for (int i = 0; i < listaSeguradora.get(indexSeguradora).getListaClientes().size(); i++) {
//			System.out.println(i + " - " + listaSeguradora.get(indexSeguradora).getListaClientes().get(i).getNome());
//		}
//		int indexCliente = scan.nextInt();
//		
//		if (listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente) instanceof ClientePF) {
//			ClientePF cliente2 = (ClientePF) listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente);
//			System.out.print(cliente2.getCpf());
//			listaSeguradora.get(indexSeguradora).removerCliente(cliente2.getCpf());
//		}
//		
//		if (listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente) instanceof ClientePJ) {
//			ClientePJ cliente2 = (ClientePJ) listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente);
//			System.out.print(cliente2.getCnpj());
//			listaSeguradora.get(indexSeguradora).removerCliente(cliente2.getCnpj());
//		}
//	}
//	
//	static public void excluirVeiculo(Scanner scan, ArrayList<Seguradora> listaSeguradora) {
//		System.out.println("selecione a seguradora\n");
//		for (int i = 0; i < listaSeguradora.size(); i++) {
//			
//			System.out.println(i + " - " + listaSeguradora.get(i).getNome());
//		}
//		int indexSeguradora = scan.nextInt();
//		System.out.println("selecione o cliente\n");
//		
//		for (int i = 0; i < listaSeguradora.get(indexSeguradora).getListaClientes().size(); i++) {
//			System.out.println(i + " - " + listaSeguradora.get(indexSeguradora).getListaClientes().get(i).getNome());
//		}
//		int indexCliente = scan.nextInt();
//		System.out.println("selecione o veiculo\n");
//		for (int i = 0; i < listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente).getListaVeiculos().size(); i++) {
//			System.out.println(i + " - " + listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente).getListaVeiculos().get(i).getPlaca());
//		}
//		int indexVeiculo = scan.nextInt();
//		listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente).getListaVeiculos().remove(indexVeiculo);
//
//	}
//	
//	static public void excluirSinistro(Scanner scan, ArrayList<Seguradora> listaSeguradora) {
//		System.out.println("selecione a seguradora\n");
//		for (int i = 0; i < listaSeguradora.size(); i++) {
//			
//			System.out.println(i + " - " + listaSeguradora.get(i).getNome());
//		}
//		int indexSeguradora = scan.nextInt();
//		System.out.println("selecione o sinistro\n");
//		for (int i = 0; i < listaSeguradora.get(indexSeguradora).getListaSinistros().size(); i++) {
//			System.out.println(i + " - " + listaSeguradora.get(indexSeguradora).getListaSinistros().get(i).getId());
//		}
//		int indexSinistro = scan.nextInt();
//		
//		listaSeguradora.get(indexSeguradora).getListaSinistros().remove(indexSinistro);
//		
//	}
//	
//	static public void listarClientePorSeguradora(Scanner scan, ArrayList<Seguradora> listaSeguradora){
//		for (int i = 0; i < listaSeguradora.size(); i++) {
//			System.out.println("Seguradora: " + listaSeguradora.get(i).getNome());
//			System.out.println("Clientes: " + listaSeguradora.get(i).getListaClientes().stream().map(Cliente::getNome).collect(Collectors.toList()));
//		}
//	}
//
//	static public void listarSinistroPorSeguradora(Scanner scan, ArrayList<Seguradora> listaSeguradora){
//		System.out.println("selecione a seguradora\n");
//		for (int i = 0; i < listaSeguradora.size(); i++) {
//			
//			System.out.println(i + " - " + listaSeguradora.get(i).getNome());
//		}
//		int indexSeguradora = scan.nextInt();
//		
//		System.out.println("Seguradora: " + listaSeguradora.get(indexSeguradora).getNome());
//		System.out.println("Sinistros(ID): " + listaSeguradora.get(indexSeguradora).listarSinistros());   //listaSeguradora.get(i).getListaSinistros().stream().map(Sinistro::getId).collect(Collectors.toList()));
//		
//		System.out.println("entre o id do sinistro para visualizar ou 0 para retornar: ");
//		int idSinistro = scan.nextInt();
//		if(idSinistro != 0) {
//		listaSeguradora.get(indexSeguradora).visualizarSinistro(idSinistro);
//		}
//	}
//	
//	static public void listarSinistroPorCliente(Scanner scan, ArrayList<Seguradora> listaSeguradora){
//		System.out.println("selecione a seguradora\n");
//		for (int i = 0; i < listaSeguradora.size(); i++) {
//			
//			System.out.println(i + " - " + listaSeguradora.get(i).getNome());
//		}
//		int indexSeguradora = scan.nextInt();
//		System.out.println("selecione o cliente\n");
//		for (int i = 0; i < listaSeguradora.get(indexSeguradora).getListaClientes().size(); i++) {
//	
//			System.out.println(i + " - " + listaSeguradora.get(indexSeguradora).getListaClientes().get(i).getNome());
//		}
//		int indexCliente = scan.nextInt();
//		
//		
//		ArrayList<Sinistro> listasinistrosfiltrada = new ArrayList<Sinistro>();
//		for (int j = 0; j < listaSeguradora.get(indexSeguradora).getListaSinistros().size(); j++) {
//			if (listaSeguradora.get(indexSeguradora).getListaSinistros().get(j).getCliente().equals(listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente))) {
//				
//				listasinistrosfiltrada.add(listaSeguradora.get(indexSeguradora).getListaSinistros().get(j));
//			}
//		}
//		System.out.println("Sinistros (ID): " + listasinistrosfiltrada.stream().map(Sinistro::getId).collect(Collectors.toList()));
//		
//		System.out.println("entre o id do sinistro para visualizar ou 0 para retornar: ");
//		int idSinistro = scan.nextInt();
//		if(idSinistro != 0) {
//		listaSeguradora.get(indexSeguradora).visualizarSinistro(idSinistro);
//		}
//		
//	}
//
//	static public void listarVeiculosPorCliente(Scanner scan, ArrayList<Seguradora> listaSeguradora) {
//		System.out.println("selecione a seguradora\n");
//		for (int i = 0; i < listaSeguradora.size(); i++) {
//			
//			System.out.println(i + " - " + listaSeguradora.get(i).getNome());
//		}
//		int indexSeguradora = scan.nextInt();
//		System.out.println("selecione o cliente\n");
//		for (int i = 0; i < listaSeguradora.get(indexSeguradora).getListaClientes().size(); i++) {
//	
//			System.out.println(i + " - " + listaSeguradora.get(indexSeguradora).getListaClientes().get(i).getNome());
//		}
//		int indexCliente = scan.nextInt();
//			System.out.println("Veiculos (placa): " + listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente).getListaVeiculos().stream().map(Veiculo::getPlaca).collect(Collectors.toList()));
//		
//	}
//	
//	static public void listarVeiculosPorSeguradora(Scanner scan, ArrayList<Seguradora> listaSeguradora) {
//		for (int i = 0; i < listaSeguradora.size(); i++) {
//			System.out.println("Seguradora: " + listaSeguradora.get(i).getNome());
//			for (int j = 0; j < listaSeguradora.get(i).getListaClientes().size(); j++) {
//				System.out.println("Cliente: " + listaSeguradora.get(i).getListaClientes().get(j).getNome());
//				System.out.println("Veiculos (placa): " + listaSeguradora.get(i).getListaClientes().get(j).getListaVeiculos().stream().map(Veiculo::getPlaca).collect(Collectors.toList()));
//			}
//			
//		}
//	}
//	
//	
//	
//	static public void gerarSinistro(Scanner scan, ArrayList<Seguradora> listaSeguradora){
//		
//		System.out.println("selecione a seguradora\n");
//		for (int i = 0; i < listaSeguradora.size(); i++) {
//			
//			System.out.println(i + " - " + listaSeguradora.get(i).getNome());
//		}
//		int indexSeguradora = scan.nextInt();
//		System.out.println("selecione o cliente\n");
//		for (int i = 0; i < listaSeguradora.get(indexSeguradora).getListaClientes().size(); i++) {
//	
//			System.out.println(i + " - " + listaSeguradora.get(indexSeguradora).getListaClientes().get(i).getNome());
//		}
//		int indexCliente = scan.nextInt();
//		System.out.println("selecione o veiculo\n");
//		for (int i = 0; i < listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente).getListaVeiculos().size(); i++) {
//	
//			System.out.println(i + " - " + listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente).getListaVeiculos().get(i).getPlaca());
//		}
//		int indexVeiculo = scan.nextInt();
//		scan.nextLine();
//		System.out.println("entre a data do sinistro no formato dd/MM/yyyy");
//		String stringDataSinistro = scan.nextLine();
//		System.out.println("entre o endereco do sinistro");
//		String enderecoSinistro = scan.nextLine();
//
//		SimpleDateFormat formatadata = new SimpleDateFormat("dd/MM/yyyy");
//		Date dataSinistro = null;
//		try {
//			dataSinistro = formatadata.parse(stringDataSinistro);
//			
//			} catch (ParseException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		
//		listaSeguradora.get(indexSeguradora).gerarSinistro(dataSinistro, enderecoSinistro, listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente).getListaVeiculos().get(indexVeiculo), listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente));
//
//	}
//	
//	
//	static public void transferirSeguro(Scanner scan, ArrayList<Seguradora> listaSeguradora){
//		System.out.println("selecione a seguradora\n");
//		for (int i = 0; i < listaSeguradora.size(); i++) {
//			
//			System.out.println(i + " - " + listaSeguradora.get(i).getNome());
//		}
//		int indexSeguradora = scan.nextInt();
//		System.out.println("selecione o cliente cedente\n");
//		
//		for (int i = 0; i < listaSeguradora.get(indexSeguradora).getListaClientes().size(); i++) {
//			System.out.println(i + " - " + listaSeguradora.get(indexSeguradora).getListaClientes().get(i).getNome());
//		}
//		int indexClienteCedente = scan.nextInt();
//		System.out.println("selecione o cliente cessionario\n");
//		int indexClienteCessionario = scan.nextInt();
//		
//		int tamanhoListaCarroCedente = listaSeguradora.get(indexSeguradora).getListaClientes().get(indexClienteCedente).getListaVeiculos().size();
//		
//		for (int i = 0; i < tamanhoListaCarroCedente; i++) {
//			
//			Veiculo veiculo = listaSeguradora.get(indexSeguradora).getListaClientes().get(indexClienteCedente).getListaVeiculos().get(0);
//			listaSeguradora.get(indexSeguradora).getListaClientes().get(indexClienteCessionario).adicionaVeiculo(veiculo);
//			listaSeguradora.get(indexSeguradora).calcularPrecoSeguroCliente(listaSeguradora.get(indexSeguradora).getListaClientes().get(indexClienteCessionario));
//			
//			listaSeguradora.get(indexSeguradora).getListaClientes().get(indexClienteCedente).getListaVeiculos().remove(veiculo);
//			listaSeguradora.get(indexSeguradora).calcularPrecoSeguroCliente(listaSeguradora.get(indexSeguradora).getListaClientes().get(indexClienteCedente));
//		}
//	
//	}
//	
//	static public void calcularReceitaSeguradora(Scanner scan, ArrayList<Seguradora> listaSeguradora){
//		System.out.println("selecione a seguradora\n");
//		for (int i = 0; i < listaSeguradora.size(); i++) {
//			
//			System.out.println(i + " - " + listaSeguradora.get(i).getNome());
//		}
//		int indexSeguradora = scan.nextInt();
//		for (int i = 0; i < listaSeguradora.get(indexSeguradora).getListaClientes().size(); i++) {
//			listaSeguradora.get(indexSeguradora).calcularPrecoSeguroCliente(listaSeguradora.get(indexSeguradora).getListaClientes().get(i));
//		}
//		System.out.println("\na receita total e: R$ " + listaSeguradora.get(indexSeguradora).calcularReceita());
//		
//	}
//	
//	static public void cadastrarCliente(Scanner scan, ArrayList<Seguradora> listaSeguradora){
//		System.out.println("digite 0 para PF e 1 para PJ");
//		int pfoupj = scan.nextInt();
//		System.out.println("selecione a seguradora\n");
//		for (int i = 0; i < listaSeguradora.size(); i++) {
//			
//			System.out.println(i + " - " + listaSeguradora.get(i).getNome());
//		}
//		int indexSeguradora = scan.nextInt();
//		
//		if (pfoupj == 0) {
//			
//			boolean a = true;
//			boolean b = true;
//			String nome = null;
//			String CPF = null;
//			scan.nextLine();
//			
//			while(a) {
//				System.out.println("entre o nome do cliente");
//				nome = scan.nextLine();
//				if(Validacao.validarNome(nome)) {
//					a = false;
//				}
//				else {
//					System.out.println("nome invalido");
//				}
//			}
//			System.out.println("entre o endereco do cliente");
//			String endereco = scan.nextLine();
//			while(b) {
//				System.out.println("entre o CPF do cliente");
//				CPF = scan.nextLine();
//				if(Validacao.validarCPF(CPF)) {
//					b = false;
//				}
//				else {
//					System.out.println("CPF invalido");
//				}
//			}
//			System.out.println("entre o genero do cliente");
//			String genero = scan.nextLine();
//			System.out.println("entre a data de licenca do cliente no formato dd/MM/yyyy");
//			String stringDataLicenca = scan.nextLine();
//			System.out.println("entre a escolaridade do cliente");
//			String educacao = scan.nextLine();
//			System.out.println("entre a data de nascimento do cliente no formato dd/MM/yyyy");
//			String stringDataNascimento = scan.nextLine();
//			System.out.println("entre a classe economica do cliente");
//			String classeEconomica = scan.nextLine();
//
//			SimpleDateFormat formatadata = new SimpleDateFormat("dd/MM/yyyy");
//			Date dataLicenca = null;
//			Date dataNascimento = null;
//			try {
//				dataLicenca = formatadata.parse(stringDataLicenca);
//				dataNascimento = formatadata.parse(stringDataNascimento);
//				
//				} catch (ParseException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			
//			Cliente cliente = new ClientePF(nome, endereco, CPF, 
//					genero, dataLicenca, educacao, dataNascimento, classeEconomica);
//			listaSeguradora.get(indexSeguradora).cadastrarCliente(cliente);
//			
//		}
//		if (pfoupj == 1) {
//
//			boolean a = true;
//			boolean b = true;
//			String nome = null;
//			String CNPJ = null;
//			scan.nextLine();
//			while(a) {
//				System.out.println("entre o nome do cliente");
//				nome = scan.nextLine();
//				if(Validacao.validarNome(nome)) {
//					a = false;
//				}
//				else {
//					System.out.println("nome invalido");
//				}
//			}
//			System.out.println("entre o endereco do cliente");
//			String endereco = scan.nextLine();
//			
//			while(b) {
//				System.out.println("entre o CNPJ do cliente");
//				CNPJ = scan.nextLine();
//				if(Validacao.validarCNPJ(CNPJ)) {
//					b = false;
//				}
//				else {
//					System.out.println("CNPJ invalido");
//				}
//			}
//			System.out.println("entre a data de fundacao do cliente no formato dd/MM/yyyy");
//			String stringDataFundacao = scan.nextLine();
//			System.out.println("entre a quantidade de funcionarios");
//			int qtdeFuncionario = scan.nextInt();
//
//			SimpleDateFormat formatadata = new SimpleDateFormat("dd/MM/yyyy");
//			Date dataFundacao = null;
//			try {
//				dataFundacao = formatadata.parse(stringDataFundacao);
//				
//				} catch (ParseException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			
//			Cliente cliente = new ClientePJ(nome, endereco, CNPJ, 
//					dataFundacao, qtdeFuncionario);
//			listaSeguradora.get(indexSeguradora).cadastrarCliente(cliente);
//		}
//		
//	}
//	static public void cadastrarVeiculo(Scanner scan, ArrayList<Seguradora> listaSeguradora) {
//		System.out.println("selecione a seguradora\n");
//		for (int i = 0; i < listaSeguradora.size(); i++) {
//			
//			System.out.println(i + " - " + listaSeguradora.get(i).getNome());
//		}
//		int indexSeguradora = scan.nextInt();
//		System.out.println("selecione o cliente\n");
//		for (int i = 0; i < listaSeguradora.get(indexSeguradora).getListaClientes().size(); i++) {
//	
//			System.out.println(i + " - " + listaSeguradora.get(indexSeguradora).getListaClientes().get(i).getNome());
//		}
//		int indexCliente = scan.nextInt();
//		scan.nextLine();
//		System.out.println("entre a placa do veiculo");
//		String placa = scan.nextLine();
//		System.out.println("entre a marca do veiculo");
//		String marca = scan.nextLine();
//		System.out.println("entre o modelo do veiculo");
//		String modelo = scan.nextLine();
//		System.out.println("entre o ano do veiculo");
//		int ano = scan.nextInt();
//		
//		Veiculo veiculo = new Veiculo(placa, marca, modelo, ano);
//		listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente).adicionaVeiculo(veiculo);
//		listaSeguradora.get(indexSeguradora).calcularPrecoSeguroCliente(listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente));
//
//	}
//	static public void cadastrarSeguradora(Scanner scan, ArrayList<Seguradora> listaSeguradora) {
//		scan.nextLine();
//		boolean a = true;
//		String nome = null;
//		while(a) {
//			System.out.println("entre o nome da seguradora");
//			nome = scan.nextLine();
//			if(Validacao.validarNome(nome)) {
//				a = false;
//			}
//			else {
//				System.out.println("nome invalido");
//			}
//		}
//		
//		System.out.println("entre o telefone da seguradora");
//		String telefone = scan.nextLine();
//		System.out.println("entre o email da seguradora");
//		String email = scan.nextLine();
//		System.out.println("entre o endereco da seguradora");
//		String endereco = scan.nextLine();
//		Seguradora seguradora = new Seguradora(nome, telefone, email, endereco);
//		listaSeguradora.add(seguradora);
//	}
	
	
}

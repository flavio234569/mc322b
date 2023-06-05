package classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FuncoesMenu {
	 
     
	
	static public void menuPrincipal(Scanner scan, ArrayList<Seguradora> listaSeguradora) {
		
        MenuOperacoes menuOperacoes[] = MenuOperacoes.values();
        MenuCadastrar menuCadastrar[] = MenuCadastrar.values();
        MenuListar menuListar[] = MenuListar.values();
        MenuExcluir menuExcluir[] = MenuExcluir.values();
        
        //o menu foi pensado de forma a minimizar a entrada manual de dados, listando os objetos
        //e selecionando, assim fica mais facil visualizar e evita erros de entrada
        
		 int opUsuario;
	        boolean a = true;
	        
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
						subMenuCadastrar(scan, menuCadastrar, listaSeguradora);
					break;
					case 1:
						System.out.println("listas");
						subMenuListar(scan, menuListar, listaSeguradora);
					break;
					case 2:
						System.out.println("excluir");
						subMenuExcluir(scan, menuExcluir, listaSeguradora);
					break;
					case 3:
						System.out.println("gerar sinistro");
						gerarSinistro(scan, listaSeguradora);					
					break;
					case 4:
						System.out.println("calcular receita seguradora");
						calcularReceitaSeguradora(scan, listaSeguradora);
				        
					break;
					case 5:
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
	
	
	//submenu
	static public void subMenuExcluir(Scanner scan, MenuExcluir menuExcluir[], ArrayList<Seguradora> listaSeguradora) {
        for (MenuExcluir me: menuExcluir) {
        	System.out.println(me.ordinal() + " - " + me.getStringmenuexcluir());
        	}
        int opUsuario = scan.nextInt();
        
		switch(opUsuario) {
		case 0:
			System.out.println("excluir cliente\n");
			excluirCliente(scan, listaSeguradora);
		break;
		case 1:
			System.out.println("excluir veiculo\n");
			excluirVeiculo(scan, listaSeguradora);	
		break;
		case 2:
			System.out.println("excluir sinistro\n");
			excluirSinistro(scan, listaSeguradora);
		break;
		case 3:
			System.out.println("excluir seguro\n");
			excluirSeguro(scan, listaSeguradora);
		break;
		case 4:
			System.out.println("excluir condutor\n");
			excluirCondutor(scan, listaSeguradora);
		break;
		case 5:
			System.out.println("excluir frota\n");
			excluirFrota(scan, listaSeguradora);
		break;
		case 6:
		break;

        
		}
	}
	
	//submenu
	static public void subMenuListar(Scanner scan, MenuListar menuListar[], ArrayList<Seguradora> listaSeguradora) {
        for (MenuListar ml: menuListar) {
        	System.out.println(ml.ordinal() + " - " + ml.getStringmenucadastrar());
        	}
        int opUsuario = scan.nextInt();
        
		switch(opUsuario) {
		case 0:
			System.out.println("listar clientes por seguradora");
			listarClientePorSeguradora(scan, listaSeguradora);
		break;
		case 1:
			System.out.println("listar sinistros por seguradora");		
			listarSinistroPorSeguradora(scan, listaSeguradora);
		break;
		case 2:
			System.out.println("listar sinistros por cliente");
			listarSinistroPorCliente(scan, listaSeguradora);
		break;
		case 3:
			System.out.println("listar veiculos por cliente");
			listarVeiculosPorCliente(scan, listaSeguradora);
		break;
		case 4:
			System.out.println("listar veiculos por seguradora");
			listarVeiculosPorSeguradora(scan, listaSeguradora);
			
		break;
		case 5:
			System.out.println("listar seguros por seguradora");
			listarSeguroPorSeguradora(scan, listaSeguradora);
			
		break;
		case 6:
			System.out.println("listar seguros por cliente");
			listarSeguroPorCliente(scan, listaSeguradora);
			
		break;
		
		case 7:
			System.out.println("voltar");
		break;
        
		}
	}
	
	//submenu
	static public void subMenuCadastrar(Scanner scan, MenuCadastrar menuCadastrar[], ArrayList<Seguradora> listaSeguradora) {
        for (MenuCadastrar mc: menuCadastrar) {
        	System.out.println(mc.ordinal() + " - " + mc.getStringmenucadastrar());
        	}
        int opUsuario = scan.nextInt();
        
		switch(opUsuario) {
		case 0:
			System.out.println("cadastrar cliente");
			cadastrarCliente(scan, listaSeguradora);
		break;
		case 1:
			System.out.println("cadastrar veiculo");
			cadastrarVeiculo(scan, listaSeguradora);
		break;
		case 2:
			System.out.println("cadastrar frota");
			cadastrarFrota(scan, listaSeguradora);
		break;
		case 3:
			System.out.println("cadastrar seguradora");
			cadastrarSeguradora(scan, listaSeguradora);
		break;
		case 4:
			System.out.println("cadastrar condutor");
			cadastrarCondutor(scan, listaSeguradora);
		break;
		case 5:
			System.out.println("voltar");
		break;
        
		}
		
	}
	
	//metodo excluir cliente
	static public void excluirCliente(Scanner scan, ArrayList<Seguradora> listaSeguradora) {
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
		
		for (int i = 0; i < listaSeguradora.get(indexSeguradora).getListaSeguro().size(); i++) {
			if (listaSeguradora.get(indexSeguradora).getListaSeguro().get(i) instanceof SeguroPJ) {
				if(((SeguroPJ)listaSeguradora.get(indexSeguradora).getListaSeguro().get(i)).getClientePJ().equals(listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente))){
					listaSeguradora.get(indexSeguradora).getListaSeguro().remove(i);
				}
			}
			if (listaSeguradora.get(indexSeguradora).getListaSeguro().get(i) instanceof SeguroPF) {
				if(((SeguroPF)listaSeguradora.get(indexSeguradora).getListaSeguro().get(i)).getClientePF().equals(listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente))) {
					listaSeguradora.get(indexSeguradora).getListaSeguro().remove(i);
				}
			}
		}
		listaSeguradora.get(indexSeguradora).getListaClientes().remove(indexCliente);
	}
	
	//excluir veiculo
	static public void excluirVeiculo(Scanner scan, ArrayList<Seguradora> listaSeguradora) {
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
		
		if (listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente) instanceof ClientePJ) {
			System.out.println("selecione a frota\n");
			
			for (int i = 0; i < ((ClientePJ)listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente)).getListaFrota().size(); i++) {
				System.out.println(i + " - " + ((ClientePJ)listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente)).getListaFrota().get(i).getCode());
			}
			int indexFrota = scan.nextInt();
			System.out.println("selecione o veiculo\n");
			for (int i = 0; i < ((ClientePJ)listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente)).getListaFrota().get(indexFrota).getListaVeiculos().size(); i++) {
				System.out.println(i + " - " + ((ClientePJ)listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente)).getListaFrota().get(indexFrota).getListaVeiculos().get(i).getPlaca());
				
			}
			int indexVeiculo = scan.nextInt();
			
			((ClientePJ)listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente)).getListaFrota().get(indexFrota).getListaVeiculos().remove(((ClientePJ)listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente)).getListaFrota().get(indexFrota).getListaVeiculos().get(indexVeiculo));
			
		}
		else if(listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente) instanceof ClientePF){
			System.out.println("selecione o veiculo\n");
			for (int i = 0; i < ((ClientePF)listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente)).getListaVeiculos().size(); i++) {
				System.out.println(i + " - " + ((ClientePF)listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente)).getListaVeiculos().get(i).getPlaca());
			}
			int indexVeiculo = scan.nextInt();
			((ClientePF)listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente)).getListaVeiculos().remove(((ClientePF)listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente)).getListaVeiculos().get(indexVeiculo));    
		}
	}
	
	//excluir sinistro
	static public void excluirSinistro(Scanner scan, ArrayList<Seguradora> listaSeguradora) {
		System.out.println("selecione a seguradora\n");
		for (int i = 0; i < listaSeguradora.size(); i++) {
			System.out.println(i + " - " + listaSeguradora.get(i).getNome());
		}
		int indexSeguradora = scan.nextInt();
		System.out.println("selecione o seguro\n");
		for (int i = 0; i < listaSeguradora.get(indexSeguradora).getListaSeguro().size(); i++) {
			System.out.println(i + " - " + listaSeguradora.get(indexSeguradora).getListaSeguro().get(i).getId());
		}
		int indexSeguro = scan.nextInt();
		System.out.println("selecione o sinistro\n");
		for (int i = 0; i < listaSeguradora.get(indexSeguradora).getListaSeguro().get(indexSeguro).getListaSinistros().size(); i++) {
			System.out.println(i + " - " + listaSeguradora.get(indexSeguradora).getListaSeguro().get(indexSeguro).getListaSinistros().get(i).getId());
		}
		int indexSinistro = scan.nextInt();
		
		listaSeguradora.get(indexSeguradora).getListaSeguro().get(indexSeguro).getListaSinistros().remove(indexSinistro);
		
		
	}
	
	//exclui seguro
	static public void excluirSeguro(Scanner scan, ArrayList<Seguradora> listaSeguradora) {
		System.out.println("selecione a seguradora\n");
		for (int i = 0; i < listaSeguradora.size(); i++) {
			System.out.println(i + " - " + listaSeguradora.get(i).getNome());
		}
		int indexSeguradora = scan.nextInt();
		System.out.println("selecione o seguro\n");
		for (int i = 0; i < listaSeguradora.get(indexSeguradora).getListaSeguro().size(); i++) {
			System.out.println(i + " - " + listaSeguradora.get(indexSeguradora).getListaSeguro().get(i).getId());
		}
		int indexSeguro = scan.nextInt();
		listaSeguradora.get(indexSeguradora).getListaSeguro().remove(indexSeguro);
	}
	
	//excluir condutor
	static public void excluirCondutor(Scanner scan, ArrayList<Seguradora> listaSeguradora) {
		System.out.println("selecione a seguradora\n");
		for (int i = 0; i < listaSeguradora.size(); i++) {
			System.out.println(i + " - " + listaSeguradora.get(i).getNome());
		}
		int indexSeguradora = scan.nextInt();
		System.out.println("selecione o seguro\n");
		for (int i = 0; i < listaSeguradora.get(indexSeguradora).getListaSeguro().size(); i++) {
			System.out.println(i + " - " + listaSeguradora.get(indexSeguradora).getListaSeguro().get(i).getId());
		}
		int indexSeguro = scan.nextInt();
		System.out.println("selecione o condutor\n");
		for (int i = 0; i < listaSeguradora.get(indexSeguradora).getListaSeguro().get(indexSeguro).getListaCondutor().size(); i++) {
			System.out.println(i + " - " + listaSeguradora.get(indexSeguradora).getListaSeguro().get(indexSeguro).getListaCondutor().get(i).getCpf());
		}
		int indexCondutor = scan.nextInt();
		
		listaSeguradora.get(indexSeguradora).getListaSeguro().get(indexSeguro).getListaCondutor().remove(indexCondutor);
	}
	
	//excluir frota
	static public void excluirFrota(Scanner scan, ArrayList<Seguradora> listaSeguradora) {
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
		if(listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente) instanceof ClientePF) {
			System.out.println("Cliente pessoa fisica nao possui frotas");
			return;
		}
		System.out.println("selecione a frota\n");
		for (int i = 0; i < ((ClientePJ)listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente)).getListaFrota().size(); i++) {
			System.out.println(i + " - " + ((ClientePJ)listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente)).getListaFrota().get(i).getCode());
		}
		int indexFrota = scan.nextInt();
		((ClientePJ)listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente)).atualizarFrota(((ClientePJ)listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente)).getListaFrota().get(indexFrota));
	}
	
	//listar clientes
	static public void listarClientePorSeguradora(Scanner scan, ArrayList<Seguradora> listaSeguradora){
		
		for (int i = 0; i < listaSeguradora.size(); i++) {
			System.out.println("Seguradora: " + listaSeguradora.get(i).getNome());
			System.out.println("Clientes: " + listaSeguradora.get(i).getListaClientes().stream().map(Cliente::getNome).collect(Collectors.toList()));
		}
	}

	static public void listarSinistroPorSeguradora(Scanner scan, ArrayList<Seguradora> listaSeguradora){	
		for (int i = 0; i < listaSeguradora.size(); i++) {
			System.out.println("Seguradora: " + listaSeguradora.get(i).getNome());
			
			for (int j = 0; j < listaSeguradora.get(i).getListaSeguro().size(); j++) {
				System.out.println("Seguro (ID): " + listaSeguradora.get(i).getListaSeguro().get(j).getId());
				System.out.println("Sinistros (sem condutor) (ID): " + listaSeguradora.get(i).getListaSeguro().get(j).getListaSinistros().stream().map(Sinistro::getId).collect(Collectors.toList()));
				
				for (int k = 0; k < listaSeguradora.get(i).getListaSeguro().get(j).getListaCondutor().size(); k++) {
					System.out.println("Condutor: " + listaSeguradora.get(i).getListaSeguro().get(j).getListaCondutor().get(k).getCpf());
					System.out.println("Sinistros (ID): " + listaSeguradora.get(i).getListaSeguro().get(j).getListaCondutor().get(k).getListaSinistros().stream().map(Sinistro::getId).collect(Collectors.toList()));
				}
				//listaSeguradora.get(i).getListaSeguro().get(j).getListaCondutor().get(0).getListaSinistros().stream().map(Sinistro::getId).collect(Collectors.toList());
				
			}
		}

	}
	
	//listar sinistros por cliente
	static public void listarSinistroPorCliente(Scanner scan, ArrayList<Seguradora> listaSeguradora){
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
		for(int j = 0; j < listaSeguradora.get(indexSeguradora).getListaSeguro().size(); j++) {
			if (listaSeguradora.get(indexSeguradora).getListaSeguro().get(j) instanceof SeguroPJ) {
				if(((SeguroPJ)listaSeguradora.get(indexSeguradora).getListaSeguro().get(j)).getClientePJ().equals(listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente))) {
					System.out.println("Cliente: " + listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente).getNome() + ", CNPJ: " + ((ClientePJ)listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente)).getCnpj());
					System.out.println("Sinistros (sem condutor) (ID): ");
					System.out.println(listaSeguradora.get(indexSeguradora).getListaSeguro().get(j).getListaSinistros().stream().map(Sinistro::getId).collect(Collectors.toList()));
					for(int k = 0; k < listaSeguradora.get(indexSeguradora).getListaSeguro().get(j).getListaCondutor().size(); k++) {
						System.out.println("Condutor: " + ((SeguroPJ)listaSeguradora.get(indexSeguradora).getListaSeguro().get(j)).getListaCondutor().get(k).getCpf());
						System.out.println("Sinistros (por condutor) (ID): ");
						System.out.println(((SeguroPJ)listaSeguradora.get(indexSeguradora).getListaSeguro().get(j)).getListaCondutor().get(k).getListaSinistros().stream().map(Sinistro::getId).collect(Collectors.toList()));
					}
				}
			}
			else if (listaSeguradora.get(indexSeguradora).getListaSeguro().get(j) instanceof SeguroPF) {
				if(((SeguroPF)listaSeguradora.get(indexSeguradora).getListaSeguro().get(j)).getClientePF().equals(listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente))) {
					System.out.println("Cliente: " + listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente).getNome() + ", CPF: " + ((ClientePF)listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente)).getCpf());
					System.out.println("Sinistros (ID): ");
					System.out.println(listaSeguradora.get(indexSeguradora).getListaSeguro().get(j).getListaSinistros().stream().map(Sinistro::getId).collect(Collectors.toList()));
					for(int k = 0; k < listaSeguradora.get(indexSeguradora).getListaSeguro().get(j).getListaCondutor().size(); k++) {
						System.out.println("Condutor: " + ((SeguroPF)listaSeguradora.get(indexSeguradora).getListaSeguro().get(j)).getListaCondutor().get(k).getCpf());
						System.out.println("Sinistros (por condutor) (ID): ");
						System.out.println(((SeguroPF)listaSeguradora.get(indexSeguradora).getListaSeguro().get(j)).getListaCondutor().get(k).getListaSinistros().stream().map(Sinistro::getId).collect(Collectors.toList()));
					}
					
					
				}
			}
		}
	}
	
	//lista veiculos por cliente
	static public void listarVeiculosPorCliente(Scanner scan, ArrayList<Seguradora> listaSeguradora) {
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
			System.out.println("Veiculos (placa): " + ((ClientePF)listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente)).getListaVeiculos().stream().map(Veiculo::getPlaca).collect(Collectors.toList()));
		}
		else if (listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente) instanceof ClientePJ) {
			for (int i = 0; i < ((ClientePJ)listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente)).getListaFrota().size(); i++) {
				System.out.println("frota: " + ((ClientePJ)listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente)).getListaFrota().get(i).getCode());
				System.out.println("Veículos (placa): " + ((ClientePJ)listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente)).getListaFrota().get(i).getListaVeiculos().stream().map(Veiculo::getPlaca).collect(Collectors.toList()));
			}
		}
	}
	
	//lista veiulo por seguradora
	static public void listarVeiculosPorSeguradora(Scanner scan, ArrayList<Seguradora> listaSeguradora) {
		for (int i = 0; i < listaSeguradora.size(); i++) {
			System.out.println("Seguradora: " + listaSeguradora.get(i).getNome());
			for (int j = 0; j < listaSeguradora.get(i).getListaClientes().size(); j++) {
				System.out.println("Cliente: " + listaSeguradora.get(i).getListaClientes().get(j).getNome());
				if(listaSeguradora.get(i).getListaClientes().get(j) instanceof ClientePF) {
					System.out.println("Veículos (placa): " + ((ClientePF)listaSeguradora.get(i).getListaClientes().get(j)).getListaVeiculos().stream().map(Veiculo::getPlaca).collect(Collectors.toList()));			
				}
				else if(listaSeguradora.get(i).getListaClientes().get(j) instanceof ClientePJ) {
					for (int k = 0; k < ((ClientePJ)listaSeguradora.get(i).getListaClientes().get(j)).getListaFrota().size(); k++) {
						System.out.println("frota: " + ((ClientePJ)listaSeguradora.get(i).getListaClientes().get(j)).getListaFrota().get(k).getCode());
						System.out.println("Veículos (placa): " + ((ClientePJ)listaSeguradora.get(i).getListaClientes().get(j)).getListaFrota().get(k).getListaVeiculos().stream().map(Veiculo::getPlaca).collect(Collectors.toList()));
					}		
				}
				
			}
			
		}
	}
	
	//listar seguros por seguradora
	static public void listarSeguroPorSeguradora(Scanner scan, ArrayList<Seguradora> listaSeguradora) {
		
		for (int i = 0; i < listaSeguradora.size(); i++) {
			System.out.println("Seguradora: " + listaSeguradora.get(i).getNome());
			System.out.println("Seguro (ID): " + listaSeguradora.get(i).getListaSeguro().stream().map(Seguro::getId).collect(Collectors.toList()));		
		}	
	}
	
	//listar seguros por cliente
	static public void listarSeguroPorCliente(Scanner scan, ArrayList<Seguradora> listaSeguradora) {
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
		if(listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente) instanceof ClientePJ) {
			System.out.println("Cliente: " + listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente).getNome() + ", CNPJ: " + ((ClientePJ)listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente)).getCnpj());
		}
		
		else if (listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente) instanceof ClientePF) {
			System.out.println("Cliente: " + listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente).getNome() + ", CPF: " + ((ClientePF)listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente)).getCpf());
		}
		
		for(int j = 0; j < listaSeguradora.get(indexSeguradora).getListaSeguro().size(); j++) {
			if (listaSeguradora.get(indexSeguradora).getListaSeguro().get(j) instanceof SeguroPJ) {
				if(((SeguroPJ)listaSeguradora.get(indexSeguradora).getListaSeguro().get(j)).getClientePJ().equals(listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente))) {
					//System.out.println("Cliente: " + listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente).getNome() + ", CNPJ: " + ((ClientePJ)listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente)).getCnpj());
					System.out.print("Seguro (ID): ");
					System.out.println(listaSeguradora.get(indexSeguradora).getListaSeguro().get(j).getId());
					System.out.print("Condutores (CPF): ");
					System.out.println(listaSeguradora.get(indexSeguradora).getListaSeguro().get(j).getListaCondutor().stream().map(Condutor::getCpf).collect(Collectors.toList()));
					//System.out.println("]");
				}
			}
			else if (listaSeguradora.get(indexSeguradora).getListaSeguro().get(j) instanceof SeguroPF) {
				if(((SeguroPF)listaSeguradora.get(indexSeguradora).getListaSeguro().get(j)).getClientePF().equals(listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente))) {
					//System.out.println("Cliente: " + listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente).getNome() + ", CPF: " + ((ClientePF)listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente)).getCpf());
					System.out.print("Seguro (ID): ");
					System.out.println(listaSeguradora.get(indexSeguradora).getListaSeguro().get(j).getId());
					System.out.print("Condutores (CPF): ");
					System.out.println(listaSeguradora.get(indexSeguradora).getListaSeguro().get(j).getListaCondutor().stream().map(Condutor::getCpf).collect(Collectors.toList()));
				}
			}
		}
		
	}
	
	
	
	
	
	
	//gerar sinistro
	static public void gerarSinistro(Scanner scan, ArrayList<Seguradora> listaSeguradora){
		System.out.println("selecione a seguradora\n");
		for (int i = 0; i < listaSeguradora.size(); i++) {
			System.out.println(i + " - " + listaSeguradora.get(i).getNome());
		}
		int indexSeguradora = scan.nextInt();
		System.out.println("selecione o seguro\n");
		for (int i = 0; i < listaSeguradora.get(indexSeguradora).getListaSeguro().size(); i++) {
			System.out.println(i + " - " + listaSeguradora.get(indexSeguradora).getListaSeguro().get(i).getId());
		}
		int indexSeguro = scan.nextInt();
		scan.nextLine();
		
		System.out.println("entre a data do sinistro no formato dd/MM/yyyy");
		String stringData = scan.nextLine();


		SimpleDateFormat formatadata = new SimpleDateFormat("dd/MM/yyyy");
		Date data = null;
		try {
			//dataLicenca = formatadata.parse(stringDataLicenca);
			data = formatadata.parse(stringData);
			
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("entre o endereco do sinistro");
		String endereco = scan.nextLine();
		
		System.out.println("selecione 0 para sinistro sem condutor e 1 para sinistro com condutor\n");
		int comCondutor = scan.nextInt();
		if(comCondutor == 1) {
			System.out.println("selecione o condutor\n");
			for (int i = 0; i < listaSeguradora.get(indexSeguradora).getListaSeguro().get(indexSeguro).getListaCondutor().size(); i++) {
				System.out.println(i + " - " + listaSeguradora.get(indexSeguradora).getListaSeguro().get(indexSeguro).getListaCondutor().get(i).getCpf());
			}
			int indexCondutor = scan.nextInt();
			scan.nextLine();
			listaSeguradora.get(indexSeguradora).getListaSeguro().get(indexSeguro).getListaCondutor().get(indexCondutor).adicionarSinistro(data, endereco);
		}
		else {
			if(listaSeguradora.get(indexSeguradora).getListaSeguro().get(indexSeguro) instanceof SeguroPJ) {
				((SeguroPJ)listaSeguradora.get(indexSeguradora).getListaSeguro().get(indexSeguro)).gerarSinistro(data, endereco);
			}
			else if(listaSeguradora.get(indexSeguradora).getListaSeguro().get(indexSeguro) instanceof SeguroPF) {
				((SeguroPF)listaSeguradora.get(indexSeguradora).getListaSeguro().get(indexSeguro)).gerarSinistro(data, endereco);
			}
		}
		

	}
//	

	//atualiza valor do seguro de cada seguro e calcula receita de cada seguradora
	static public Double calcularReceitaSeguradora(Scanner scan, ArrayList<Seguradora> listaSeguradora){
		
		Double total = 0.0;
		for (int i = 0; i < listaSeguradora.size(); i++) {
			
			System.out.println("Seguradora: " + listaSeguradora.get(i).getNome());
			
			total = listaSeguradora.get(i).calcularReceita();
		}
		
		System.out.printf("Receita: R$ %.2f \n", total);
		return total;
	}
	
	//cadastra cliente
	static public void cadastrarCliente(Scanner scan, ArrayList<Seguradora> listaSeguradora){
		System.out.println("digite 0 para PF e 1 para PJ");
		int pfoupj = scan.nextInt();
		System.out.println("selecione a seguradora\n");
		for (int i = 0; i < listaSeguradora.size(); i++) {
			
			System.out.println(i + " - " + listaSeguradora.get(i).getNome());
		}
		int indexSeguradora = scan.nextInt();
		
		if (pfoupj == 0) {
			
			boolean a = true;
			boolean b = true;
			String nome = null;
			String CPF = null;
			scan.nextLine();
			
			while(a) {
				System.out.println("entre o nome do cliente");
				nome = scan.nextLine();
				if(Validacao.validarNome(nome)) {
					a = false;
				}
				else {
					System.out.println("nome invalido");
				}
			}
			System.out.println("entre o telefone do cliente");
			String telefone = scan.nextLine();
			
			System.out.println("entre o endereco do cliente");
			String endereco = scan.nextLine();
			
			System.out.println("entre o e-mail do cliente");
			String email = scan.nextLine();
			
			while(b) {
				System.out.println("entre o CPF do cliente");
				CPF = scan.nextLine();
				if(Validacao.validarCPF(CPF)) {
					b = false;
				}
				else {
					System.out.println("CPF invalido");
				}
			}
			System.out.println("entre o genero do cliente");
			String genero = scan.nextLine();

			System.out.println("entre a escolaridade do cliente");
			String educacao = scan.nextLine();
			System.out.println("entre a data de nascimento do cliente no formato dd/MM/yyyy");
			String stringDataNascimento = scan.nextLine();


			SimpleDateFormat formatadata = new SimpleDateFormat("dd/MM/yyyy");
			Date dataLicenca = null;
			Date dataNascimento = null;
			try {
				//dataLicenca = formatadata.parse(stringDataLicenca);
				dataNascimento = formatadata.parse(stringDataNascimento);
				
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			Cliente cliente = new ClientePF(nome, telefone, endereco, email, CPF, 
					genero, educacao, dataNascimento);
			listaSeguradora.get(indexSeguradora).cadastrarCliente(cliente);
			
		}
		if (pfoupj == 1) {

			boolean a = true;
			boolean b = true;
			String nome = null;
			String CNPJ = null;
			scan.nextLine();
			while(a) {
				System.out.println("entre o nome do cliente");
				nome = scan.nextLine();
				if(Validacao.validarNome(nome)) {
					a = false;
				}
				else {
					System.out.println("nome invalido");
				}
			}
			System.out.println("entre o telefone do cliente");
			String telefone = scan.nextLine();
			
			System.out.println("entre o endereco do cliente");
			String endereco = scan.nextLine();
			
			System.out.println("entre o email do cliente");
			String email = scan.nextLine();
			
			while(b) {
				System.out.println("entre o CNPJ do cliente");
				CNPJ = scan.nextLine();
				if(Validacao.validarCNPJ(CNPJ)) {
					b = false;
				}
				else {
					System.out.println("CNPJ invalido");
				}
			}
			System.out.println("entre a data de fundacao do cliente no formato dd/MM/yyyy");
			String stringDataFundacao = scan.nextLine();
			System.out.println("entre a quantidade de funcionarios");
			int qtdeFuncionario = scan.nextInt();

			SimpleDateFormat formatadata = new SimpleDateFormat("dd/MM/yyyy");
			Date dataFundacao = null;
			try {
				dataFundacao = formatadata.parse(stringDataFundacao);
				
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			Cliente cliente = new ClientePJ(nome, telefone, endereco, email, CNPJ, 
					dataFundacao, qtdeFuncionario);
			listaSeguradora.get(indexSeguradora).cadastrarCliente(cliente);
			
		}
		
	}
	
	//cadastrar veiculo em uma frota ou cliente PF
	static public void cadastrarVeiculo(Scanner scan, ArrayList<Seguradora> listaSeguradora) {
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
		int indexFrota;
		if (listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente) instanceof ClientePJ) {
			System.out.println("selecione a frota\n");
			for (int i = 0; i < ((ClientePJ)listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente)).getListaFrota().size(); i++) {
				System.out.println(i + " - " + ((ClientePJ)listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente)).getListaFrota().get(i).getCode()); 
			}
			indexFrota = scan.nextInt();
			//((ClientePJ)listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente)).getListaFrota().get(indexFrota).addVeiculo(veiculo);
			((ClientePJ)listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente)).atualizarFrota(((ClientePJ)listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente)).getListaFrota().get(indexFrota), veiculo);
		}
		else if(listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente) instanceof ClientePF){
			((ClientePF)listaSeguradora.get(indexSeguradora).getListaClientes().get(indexCliente)).cadastrarVeiculo(veiculo); //getListaVeiculos().add(veiculo);   
		}
	}
	
	//cadastra frota
	static public void cadastrarFrota(Scanner scan, ArrayList<Seguradora> listaSeguradora) {
		System.out.println("selecione a seguradora\n");
		for (int i = 0; i < listaSeguradora.size(); i++) {
			
			System.out.println(i + " - " + listaSeguradora.get(i).getNome());
		}
		int indexSeguradora = scan.nextInt();
		
		System.out.println("selecione o cliente\n");
		for (int i = 0; i < listaSeguradora.get(indexSeguradora).listarClientes("PJ").size(); i++) {
			System.out.println(i + " - " + listaSeguradora.get(indexSeguradora).listarClientes("PJ").get(i).getNome());
		}
		int indexCliente = scan.nextInt();
		scan.nextLine();
		System.out.println("entre o codigo da frota");
		String codfrota = scan.nextLine();
		
		Frota frota1 = new Frota(codfrota);
		((ClientePJ)listaSeguradora.get(indexSeguradora).listarClientes("PJ").get(indexCliente)).cadastrarFrota(frota1);
	}
	
	//cadastra uma nova seguradora
	static public void cadastrarSeguradora(Scanner scan, ArrayList<Seguradora> listaSeguradora) {
		scan.nextLine();
		boolean a = true;
		boolean b = true;
		String cnpj = null;
		String nome = null;

		while(a) {
			System.out.println("entre o CNPJ da seguradora");
			cnpj = scan.nextLine();
			if(Validacao.validarCNPJ(cnpj)) {
				a = false;
			}
			else {
				System.out.println("cnpj invalido");
			}
		}
		
		while(b) {
			System.out.println("entre o nome da seguradora");
			nome = scan.nextLine();
			if(Validacao.validarNome(nome)) {
				b = false;
			}
			else {
				System.out.println("nome invalido");
			}
		}
		
		System.out.println("entre o telefone da seguradora");
		String telefone = scan.nextLine();
		System.out.println("entre o email da seguradora");
		String email = scan.nextLine();
		System.out.println("entre o endereco da seguradora");
		String endereco = scan.nextLine();
		Seguradora seguradora = new Seguradora(cnpj, nome, telefone, email, endereco);
		listaSeguradora.add(seguradora);
		
	}
	
	//cadastra novos condutores
	static public void cadastrarCondutor(Scanner scan, ArrayList<Seguradora> listaSeguradora) {
		System.out.println("digite 0 para cliente PF e 1 para cliente PJ");
		int pfoupj = scan.nextInt();
		
		System.out.println("selecione a seguradora\n");
		for (int i = 0; i < listaSeguradora.size(); i++) {
			System.out.println(i + " - " + listaSeguradora.get(i).getNome());
		}
		int indexSeguradora = scan.nextInt();
		System.out.println("selecione o seguro\n");
		for (int i = 0; i < listaSeguradora.get(indexSeguradora).getListaSeguro().size(); i++) {
			System.out.println(i + " - " + listaSeguradora.get(indexSeguradora).getListaSeguro().get(i).getId());
		}
		int indexSeguro = scan.nextInt();
		scan.nextLine();
		
		boolean a = true;
		boolean b = true;
		String CPF = null;
		String nome = null;
		while(a) {
			System.out.println("entre o CPF do cliente");
			CPF = scan.nextLine();
			if(Validacao.validarCPF(CPF)) {
				a = false;
			}
			else {
				System.out.println("CPF invalido");
			}
		}
		
		while(b) {
			System.out.println("entre o nome do cliente");
			nome = scan.nextLine();
			if(Validacao.validarNome(nome)) {
				b = false;
			}
			else {
				System.out.println("nome invalido");
			}
		}
		

		System.out.println("entre com o telefone");
		String telefone = scan.nextLine();
		System.out.println("entre com o endereco");
		String endereco = scan.nextLine();
		System.out.println("entre com o email");
		String email = scan.nextLine();
		System.out.println("entre a data nascimento no formato dd/MM/yyyy");
		String stringDataNascimento = scan.nextLine();


		SimpleDateFormat formatadata = new SimpleDateFormat("dd/MM/yyyy");
		Date dataNascimento = null;
		try {
			dataNascimento = formatadata.parse(stringDataNascimento);
			
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		Condutor condutor1 = new Condutor(CPF, nome, telefone, endereco, email, dataNascimento);

		if (pfoupj == 1) {
			((SeguroPJ)listaSeguradora.get(indexSeguradora).getListaSeguro().get(indexSeguro)).autorizarCondutor(condutor1);
		}
		else if(pfoupj == 0) {
			((SeguroPF)listaSeguradora.get(indexSeguradora).getListaSeguro().get(indexSeguro)).autorizarCondutor(condutor1);

		}
		
	}
}

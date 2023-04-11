//como instanciar data
//






package classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		//declarar as datas a serem utilizadas e formatar datas
		SimpleDateFormat formatadata = new SimpleDateFormat("dd/MM/yyyy");
		Date data1 = null, data2 = null, data3 = null, data4 = null, data5 = null, data6 = null, data7 = null;
		try {
		data1 = formatadata.parse("01/01/2020");
		data2 = formatadata.parse("02/02/2020");
		data3 = formatadata.parse("03/03/2020");
		data4 = formatadata.parse("04/04/2020");
		data5 = formatadata.parse("05/05/2020");
		data6 = formatadata.parse("06/06/2020");
		data7 = formatadata.parse("07/07/2020");
		
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
		ClientePJ clientepj2 = new ClientePJ("nomeclientepj2", "enderecoclientepj2", data1, 
				"escolaridadeclientepj2", "generoclientepj2", "classeeconomicaclientepj2",
				 "41.432.158/0001-18", data2);
		ClientePJ clientepj3 = new ClientePJ("nomeclientepj3", "enderecoclientepj3", data1, 
				"escolaridadeclientepj3", "generoclientepj3", "classeeconomicaclientepj3",
				 "28.378.541/0001-77", data2);
		ClientePF clientepf1 = new ClientePF("nomeclientepf1", "enderecoclientepf1", data2, 
				"escolaridadeclientepf1", "generoclientepf1", "classeeconomicaclientepf1",
				 "328.674.460-31", data3);
		ClientePF clientepf2 = new ClientePF("nomeclientepf1", "enderecoclientepf1", data2, 
				"escolaridadeclientepf1", "generoclientepf1", "classeeconomicaclientepf1",
				 "328.674.460-31", data3);
		ClientePF clientepf3 = new ClientePF("nomeclientepf1", "enderecoclientepf1", data2, 
				"escolaridadeclientepf1", "generoclientepf1", "classeeconomicaclientepf1",
				 "328.674.460-31", data3);
		
	
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
		
		//instanciando seguradora
		Seguradora seguradora1 = new Seguradora("nomeseguradora1", "1912341234", "seguradora1@seg.com", "enderecoseguradora1");
		
		//cadastrando clientes
		seguradora1.cadastrarCliente(clientepj1);
		seguradora1.cadastrarCliente(clientepj2);
		seguradora1.cadastrarCliente(clientepj3);
		seguradora1.cadastrarCliente(clientepf1);
		seguradora1.cadastrarCliente(clientepf2);
		seguradora1.cadastrarCliente(clientepf3);
		
		System.out.print(seguradora1.toString());
		
		//removendo cliente pj2 e pf2
		seguradora1.removerCliente(clientepj2);
		seguradora1.removerCliente(clientepf2);
		
		//gerar sinistro
		Sinistro sinistro1 = null;
		seguradora1.gerarSinistro("01-02-2023", "enderecodosinistro1", seguradora1, veiculopf1n2, clientepf1, sinistro1);
		seguradora1.gerarSinistro("02-02-2023", "enderecodosinistro2", seguradora1, veiculopj1n2, clientepj1, sinistro1);

		System.out.print(seguradora1.toString());
		
		System.out.print(seguradora1.getListaSinistros());
		
		seguradora1.visualizarSinistro("nomeclientepf1");
		
	}

}


package classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
//import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class main {
	public static void main(String[] args) {
//		List<String[]> listateste = new ArrayList<>();
//		String row;
//		try {
//		BufferedReader csvReader = new BufferedReader(new FileReader("teste.csv"));
//			System.out.println(csvReader.readLine());
//
//		while ((row = csvReader.readLine()) != null) {
//		    String[] data = row.split(",");
//		    // do something with the data
//		    System.out.println(Arrays.toString(data));
//		    listateste.add(data);
//		}
//		csvReader.close();
//		}catch (IOException ex) {
//			ex.printStackTrace();
//		}
//		System.out.println("ttt");
//		System.out.println((listateste));
		



//		        String csvFile = "teste.csv";
//		        String line;
//		        String csvSplitBy = ",";
//
//		        List<List<String>> lines = new ArrayList<>();
//
//		        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
//		            while ((line = br.readLine()) != null) {
//		                String[] data = line.split(csvSplitBy);
//		                List<String> lineData = new ArrayList<>();
//		                for (String value : data) {
//		                    lineData.add(value);
//		                }
//		                lines.add(lineData);
//		            }
//		        } catch (IOException e) {
//		            e.printStackTrace();
//		        }
//
//		        // Print the lines
//		        for (List<String> lineData : lines) {
//		            System.out.println(lineData);
//		        }
		    
		
//		ArquivoVeiculo arquivoVeiculo = new ArquivoVeiculo();
//		String tudo = arquivoVeiculo.lerArquivo();
//		        
//
//		
//		        String[] split;
//		        split = tudo.split(";");
//		        for (String a : split) {
//		        	System.out.println(a);
//		        	String splitA[];
//		        	splitA = a.split(",");
//		        	for (String b : splitA) {
//		        		System.out.println(b);
//		        	}
//		        }
		
		
		

		
		
		
		
//		Seguradora seguradora1 = new Seguradora("cnpj", "nomeseguradora1", "telefone", "email", "endereco");
//		System.out.println("testeseg");
//		seguradora1.lerDados();
//		System.out.println("testeseg");
//		
//		//System.out.println(((ClientePF)seguradora1.getListaClientes().get(6)).getListaVeiculos());
//		
//		System.out.println((seguradora1.getListaClientes()));
//
//		System.out.println(((ClientePJ)seguradora1.getListaClientes().get(0)).getListaFrota().get(0).getListaVeiculos() );
//
//		System.out.println("testeseg2");
//		seguradora1.gravarDados();
//		System.out.println("testeseg2");
		
		//System.out.println(((ClientePF)seguradora1.getListaClientes().get(6)).getDataNascimento());

		
		
//		Writer output;
//		output = new BufferedWriter(new FileWriter(my_file_name));  //clears file every time
//		output.append("New Line!");
//		output.close();
		
//	   File directory = new File("./");
//	   System.out.println(directory.getAbsolutePath());
//		List<List<String>> listaCompleta = new ArrayList<>();
//		String filename = "teste.csv";
//		try {
//			Scanner input = new Scanner(new File(filename));
//			input.useDelimiter(",");
//			List<String> listadados = new ArrayList<>();
//			while (input.hasNext()) {
//				String teste = input.next();
//				System.out.print(teste);
//				listadados.add(teste);
//				if(teste.endsWith("\n")) {
//					
//					listaCompleta.add(listadados);
//					listadados.clear();
//				}
//				//System.out.print(listadados);
//				//System.out.print(listadados);
//				//input.close();
//			}
//			System.out.print(listaCompleta);
//		}catch (IOException ex) {
//			ex.printStackTrace();
//		}
//		
//		System.out.print("teste");

		
	SimpleDateFormat formatadata = new SimpleDateFormat("dd/MM/yyyy");
	Date data1 = null, data2 = null, data3 = null, data4 = null, data5 = null, 
		 data6 = null, data7 = null, data8 = null, data9 = null, data10 = null,
		 data11 = null ,data12 = null, data13 = null, data14 = null, data15 = null
		 ; 
	try {
		data1 = formatadata.parse("01/01/2020");
		data2 = formatadata.parse("02/02/2000");
		data3 = formatadata.parse("03/03/2020");
		data4 = formatadata.parse("04/04/2000");
		data5 = formatadata.parse("05/05/1990");
		data6 = formatadata.parse("06/06/1950");
		data7 = formatadata.parse("07/07/1990");
		data8 = formatadata.parse("08/08/2000");
		data9 = formatadata.parse("09/09/2000");
		data10 = formatadata.parse("10/10/2000");
		data11 = formatadata.parse("11/11/2000");
		data12 = formatadata.parse("12/12/2000");
		data13 = formatadata.parse("13/01/2000");
		data14 = formatadata.parse("14/01/2000");
		data15 = formatadata.parse("15/01/2000");
	
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	ArrayList<Seguradora> listaSeguradora = new ArrayList<Seguradora>();
	Seguradora seguradora1 = new Seguradora("cnpj", "nomeseguradora1", "telefone", "email", "endereco");
	listaSeguradora.add(seguradora1);
		
	ClientePJ clientePJ1 = new ClientePJ("nomePJ1", "telefonePJ1", "enderecoPJ1", "emailPJ1", "cnpj1", data1, 100);
	ClientePJ clientePJ2 = new ClientePJ("nomePJ2", "telefonePJ2", "enderecoPJ2", "emailPJ2", "cnpj2", data2, 100);
	ClientePJ clientePJ3 = new ClientePJ("nomePJ3", "telefonePJ3", "enderecoPJ3", "emailPJ3", "cnpj3", data3, 100);
	ClientePJ clientePJ4 = new ClientePJ("nomePJ4", "telefonePJ4", "enderecoPJ4", "emailPJ4", "cnpj4", data4, 100);
	ClientePJ clientePJ5 = new ClientePJ("nomePJ5", "telefonePJ5", "enderecoPJ5", "emailPJ5", "cnpj5", data5, 100);
	//ClientePJ clientePJ6 = new ClientePJ("nomePJ6", "telefonePJ6", "enderecoPJ6", "emailPJ6", "cnpj6", data1, 100);
	//ClientePJ clientePJ7 = new ClientePJ("nomePJ7", "telefonePJ7", "enderecoPJ7", "emailPJ7", "cnpj7", data2, 100);
	//ClientePJ clientePJ8 = new ClientePJ("nomePJ8", "telefonePJ8", "enderecoPJ8", "emailPJ8", "cnpj8", data3, 100);
	//ClientePJ clientePJ9 = new ClientePJ("nomePJ9", "telefonePJ9", "enderecoPJ9", "emailPJ9", "cnpj9", data4, 100);
	//ClientePJ clientePJ10 = new ClientePJ("nomePJ10", "telefonePJ10", "enderecoPJ10", "emailPJ10", "cnpj10", data5, 100);

	ClientePF clientePF1 = new ClientePF("nomePF1", "telefonePF1", "enderecoPF1", "emailPF1", "CPF1", "generoPF1", "educacaoPF1", data6);
	ClientePF clientePF2 = new ClientePF("nomePF2", "telefonePF2", "enderecoPF2", "emailPF2", "CPF2", "generoPF2", "educacaoPF2", data7);
	ClientePF clientePF3 = new ClientePF("nomePF3", "telefonePF3", "enderecoPF3", "emailPF3", "CPF3", "generoPF3", "educacaoPF3", data8);
	ClientePF clientePF4 = new ClientePF("nomePF4", "telefonePF4", "enderecoPF4", "emailPF4", "CPF4", "generoPF4", "educacaoPF4", data9);
	ClientePF clientePF5 = new ClientePF("nomePF5", "telefonePF5", "enderecoPF5", "emailPF5", "CPF5", "generoPF5", "educacaoPF5", data10);
	ClientePF clientePF6 = new ClientePF("nomePF6", "telefonePF6", "enderecoPF6", "emailPF6", "CPF6", "generoPF6", "educacaoPF6", data6);
	ClientePF clientePF7 = new ClientePF("nomePF7", "telefonePF7", "enderecoPF7", "emailPF7", "CPF7", "generoPF7", "educacaoPF7", data7);
	ClientePF clientePF8 = new ClientePF("nomePF8", "telefonePF8", "enderecoPF8", "emailPF8", "CPF8", "generoPF8", "educacaoPF8", data8);
	ClientePF clientePF9 = new ClientePF("nomePF9", "telefonePF9", "enderecoPF9", "emailPF9", "CPF9", "generoPF9", "educacaoPF9", data9);
	ClientePF clientePF10 = new ClientePF("nomePF10", "telefonePF10", "enderecoPF10", "emailPF10", "CPF10", "generoPF10", "educacaoPF10", data10);
	
	seguradora1.cadastrarCliente(clientePJ1);
	seguradora1.cadastrarCliente(clientePJ2);
	seguradora1.cadastrarCliente(clientePJ3);
	seguradora1.cadastrarCliente(clientePJ4);
	seguradora1.cadastrarCliente(clientePJ5);
	//seguradora1.cadastrarCliente(clientePJ6);
	//seguradora1.cadastrarCliente(clientePJ7);
	//seguradora1.cadastrarCliente(clientePJ8);
	//seguradora1.cadastrarCliente(clientePJ9);
	//seguradora1.cadastrarCliente(clientePJ10);

	seguradora1.cadastrarCliente(clientePF1);
	seguradora1.cadastrarCliente(clientePF2);
	seguradora1.cadastrarCliente(clientePF3);
	seguradora1.cadastrarCliente(clientePF4);
	seguradora1.cadastrarCliente(clientePF5);
	seguradora1.cadastrarCliente(clientePF6);
	seguradora1.cadastrarCliente(clientePF7);
	seguradora1.cadastrarCliente(clientePF8);
	seguradora1.cadastrarCliente(clientePF9);
	seguradora1.cadastrarCliente(clientePF10);	
	
	Frota frota1 = new Frota("codigofrota1");
	Frota frota2 = new Frota("codigofrota2");
	Frota frota3 = new Frota("codigofrota3");
	Frota frota4 = new Frota("codigofrota4");
	Frota frota5 = new Frota("codigofrota5");
	//Frota frota6 = new Frota("codigofrota6");
	//Frota frota7 = new Frota("codigofrota7");
	//Frota frota8 = new Frota("codigofrota8");
	//Frota frota9 = new Frota("codigofrota9");
	//Frota frota10 = new Frota("codigofrota10");
	
	Veiculo veiculo1 = new Veiculo("placa1", "marca1", "modelo1", 1990);
	Veiculo veiculo2 = new Veiculo("placa2", "marca2", "modelo1", 1991);
	Veiculo veiculo3 = new Veiculo("placa3", "marca3", "modelo1", 1992);
	Veiculo veiculo4 = new Veiculo("placa4", "marca4", "modelo1", 1993);
	Veiculo veiculo5 = new Veiculo("placa5", "marca5", "modelo1", 1994);
	Veiculo veiculo6 = new Veiculo("placa6", "marca6", "modelo1", 1995);
	Veiculo veiculo7 = new Veiculo("placa7", "marca7", "modelo1", 1996);
	Veiculo veiculo8 = new Veiculo("placa8", "marca8", "modelo1", 1997);
	Veiculo veiculo9 = new Veiculo("placa9", "marca9", "modelo1", 1998);
	Veiculo veiculo10 = new Veiculo("placa10", "marca10", "modelo1", 1999);
	Veiculo veiculo11 = new Veiculo("placa11", "marca11", "modelo1", 2000);
	Veiculo veiculo12 = new Veiculo("placa12", "marca12", "modelo1", 2001);
	Veiculo veiculo13 = new Veiculo("placa13", "marca13", "modelo1", 2002);
	Veiculo veiculo14 = new Veiculo("placa14", "marca14", "modelo1", 2003);
	Veiculo veiculo15 = new Veiculo("placa15", "marca15", "modelo1", 2004);
	Veiculo veiculo16 = new Veiculo("placa16", "marca16", "modelo1", 2005);
	Veiculo veiculo17 = new Veiculo("placa17", "marca17", "modelo1", 2006);
	Veiculo veiculo18 = new Veiculo("placa18", "marca18", "modelo1", 2007);
	Veiculo veiculo19 = new Veiculo("placa19", "marca19", "modelo1", 2008);
	Veiculo veiculo20 = new Veiculo("placa20", "marca20", "modelo1", 2009);
	Veiculo veiculo21 = new Veiculo("placa21", "marca21", "modelo1", 2010);
	Veiculo veiculo22 = new Veiculo("placa22", "marca22", "modelo1", 2011);
	Veiculo veiculo23 = new Veiculo("placa23", "marca23", "modelo1", 2012);
	Veiculo veiculo24 = new Veiculo("placa24", "marca24", "modelo1", 2013);
	Veiculo veiculo25 = new Veiculo("placa25", "marca25", "modelo1", 2014);
	
	clientePJ1.cadastrarFrota(frota1);
	clientePJ2.cadastrarFrota(frota2);
	clientePJ3.cadastrarFrota(frota3);
	clientePJ4.cadastrarFrota(frota4);
	clientePJ5.cadastrarFrota(frota5);
	//clientePJ6.cadastrarFrota(frota6);
	//clientePJ7.cadastrarFrota(frota7);
	//clientePJ8.cadastrarFrota(frota8);
	//clientePJ9.cadastrarFrota(frota9);
	//clientePJ10.cadastrarFrota(frota10);
	

	clientePJ1.atualizarFrota(frota1, veiculo1);
	clientePJ2.atualizarFrota(frota2, veiculo2);
	clientePJ3.atualizarFrota(frota3, veiculo3);
	clientePJ4.atualizarFrota(frota4, veiculo4);
	clientePJ5.atualizarFrota(frota5, veiculo5);
	clientePJ1.atualizarFrota(frota1, veiculo6);
	clientePJ2.atualizarFrota(frota2, veiculo7);
	clientePJ3.atualizarFrota(frota3, veiculo8);
	clientePJ4.atualizarFrota(frota4, veiculo9);
	clientePJ5.atualizarFrota(frota5, veiculo10);
	clientePJ1.atualizarFrota(frota1, veiculo11);
	clientePJ2.atualizarFrota(frota2, veiculo12);
	clientePJ3.atualizarFrota(frota3, veiculo13);
	clientePJ4.atualizarFrota(frota4, veiculo14);
	clientePJ5.atualizarFrota(frota5, veiculo15);
	
	
	
	
	clientePF1.cadastrarVeiculo(veiculo16);
	clientePF2.cadastrarVeiculo(veiculo17);
	clientePF3.cadastrarVeiculo(veiculo18);
	clientePF4.cadastrarVeiculo(veiculo19);
	clientePF5.cadastrarVeiculo(veiculo20);
	clientePF6.cadastrarVeiculo(veiculo21);
	clientePF7.cadastrarVeiculo(veiculo22);
	clientePF8.cadastrarVeiculo(veiculo23);
	clientePF9.cadastrarVeiculo(veiculo24);
	clientePF10.cadastrarVeiculo(veiculo25);
	
	
	
	
	
	Condutor condutor1 = new Condutor("CPF1", "nomecond1", "telefone1", "endereco1", "email1", data15);
	Condutor condutor2 = new Condutor("CPF2", "nomecond1", "telefone1", "endereco1", "email1", data15);
	Condutor condutor3 = new Condutor("CPF3", "nomecond1", "telefone1", "endereco1", "email1", data15);
	Condutor condutor4 = new Condutor("CPF4", "nomecond1", "telefone1", "endereco1", "email1", data15);
	Condutor condutor5 = new Condutor("CPF5", "nomecond1", "telefone1", "endereco1", "email1", data15);
	Condutor condutor6 = new Condutor("CPF6", "nomecond1", "telefone1", "endereco1", "email1", data15);
	Condutor condutor7 = new Condutor("CPF7", "nomecond1", "telefone1", "endereco1", "email1", data15);
	Condutor condutor8 = new Condutor("CPF8", "nomecond1", "telefone1", "endereco1", "email1", data15);
	Condutor condutor9 = new Condutor("CPF9", "nomecond1", "telefone1", "endereco1", "email1", data15);
	Condutor condutor10 = new Condutor("CPF10", "nomecond1", "telefone1", "endereco1", "email1", data15);
	Condutor condutor11 = new Condutor("CPF11", "nomecond1", "telefone1", "endereco1", "email1", data15);
	Condutor condutor12 = new Condutor("CPF12", "nomecond1", "telefone1", "endereco1", "email1", data15);
	Condutor condutor13 = new Condutor("CPF13", "nomecond1", "telefone1", "endereco1", "email1", data15);
	Condutor condutor14 = new Condutor("CPF14", "nomecond1", "telefone1", "endereco1", "email1", data15);
	Condutor condutor15 = new Condutor("CPF15", "nomecond1", "telefone1", "endereco1", "email1", data15);
	Condutor condutor16 = new Condutor("CPF16", "nomecond1", "telefone1", "endereco1", "email1", data15);
	Condutor condutor17 = new Condutor("CPF17", "nomecond1", "telefone1", "endereco1", "email1", data15);
	Condutor condutor18 = new Condutor("CPF18", "nomecond1", "telefone1", "endereco1", "email1", data15);
	Condutor condutor19 = new Condutor("CPF19", "nomecond1", "telefone1", "endereco1", "email1", data15);
	Condutor condutor20 = new Condutor("CPF20", "nomecond1", "telefone1", "endereco1", "email1", data15);
	Condutor condutor21 = new Condutor("CPF21", "nomecond1", "telefone1", "endereco1", "email1", data15);
	Condutor condutor22 = new Condutor("CPF22", "nomecond1", "telefone1", "endereco1", "email1", data15);
	Condutor condutor23 = new Condutor("CPF23", "nomecond1", "telefone1", "endereco1", "email1", data15);
	Condutor condutor24 = new Condutor("CPF24", "nomecond1", "telefone1", "endereco1", "email1", data15);
	Condutor condutor25 = new Condutor("CPF25", "nomecond1", "telefone1", "endereco1", "email1", data15);
	Condutor condutor26 = new Condutor("CPF26", "nomecond1", "telefone1", "endereco1", "email1", data15);
	Condutor condutor27 = new Condutor("CPF27", "nomecond1", "telefone1", "endereco1", "email1", data15);
	Condutor condutor28 = new Condutor("CPF28", "nomecond1", "telefone1", "endereco1", "email1", data15);
	Condutor condutor29 = new Condutor("CPF29", "nomecond1", "telefone1", "endereco1", "email1", data15);
	Condutor condutor30 = new Condutor("CPF30", "nomecond1", "telefone1", "endereco1", "email1", data15);

	seguradora1.gerarSeguro(data14, data15, frota1, clientePJ1);
	seguradora1.gerarSeguro(data14, data15, frota2, clientePJ2);
	seguradora1.gerarSeguro(data14, data15, frota3, clientePJ3);
	seguradora1.gerarSeguro(data14, data15, frota4, clientePJ4);
	seguradora1.gerarSeguro(data14, data15, frota5, clientePJ5);
//	seguradora1.gerarSeguro(data14, data15, frota6, clientePJ6);
//	seguradora1.gerarSeguro(data14, data15, frota7, clientePJ7);
//	seguradora1.gerarSeguro(data14, data15, frota8, clientePJ8);
//	seguradora1.gerarSeguro(data14, data15, frota9, clientePJ9);
//	seguradora1.gerarSeguro(data14, data15, frota10, clientePJ10);
//	
	seguradora1.gerarSeguro(data14, data15, veiculo16, clientePF1);
	seguradora1.gerarSeguro(data14, data15, veiculo17, clientePF2);
	seguradora1.gerarSeguro(data14, data15, veiculo18, clientePF3);
	seguradora1.gerarSeguro(data14, data15, veiculo19, clientePF4);
	seguradora1.gerarSeguro(data14, data15, veiculo20, clientePF5);
//	seguradora1.gerarSeguro(data14, data15, veiculo21, clientePF6);
//	seguradora1.gerarSeguro(data14, data15, veiculo22, clientePF7);
//	seguradora1.gerarSeguro(data14, data15, veiculo23, clientePF8);
//	seguradora1.gerarSeguro(data14, data15, veiculo24, clientePF9);
//	seguradora1.gerarSeguro(data14, data15, veiculo25, clientePF10);
//	
//	//seguradora1.gerarSeguro(data14, data15, frota1, clientePJ1);
//	
	((SeguroPJ)seguradora1.getListaSeguro().get(0)).autorizarCondutor(condutor1);
	((SeguroPJ)seguradora1.getListaSeguro().get(1)).autorizarCondutor(condutor2);
	((SeguroPJ)seguradora1.getListaSeguro().get(2)).autorizarCondutor(condutor3);
	((SeguroPJ)seguradora1.getListaSeguro().get(3)).autorizarCondutor(condutor4);
	((SeguroPJ)seguradora1.getListaSeguro().get(4)).autorizarCondutor(condutor5);
	((SeguroPJ)seguradora1.getListaSeguro().get(0)).autorizarCondutor(condutor6);
	((SeguroPJ)seguradora1.getListaSeguro().get(1)).autorizarCondutor(condutor7);
	((SeguroPJ)seguradora1.getListaSeguro().get(2)).autorizarCondutor(condutor8);
	((SeguroPJ)seguradora1.getListaSeguro().get(3)).autorizarCondutor(condutor9);
	((SeguroPJ)seguradora1.getListaSeguro().get(4)).autorizarCondutor(condutor10);
	((SeguroPJ)seguradora1.getListaSeguro().get(0)).autorizarCondutor(condutor11);
	((SeguroPJ)seguradora1.getListaSeguro().get(1)).autorizarCondutor(condutor12);
	((SeguroPJ)seguradora1.getListaSeguro().get(2)).autorizarCondutor(condutor13);
	((SeguroPJ)seguradora1.getListaSeguro().get(3)).autorizarCondutor(condutor14);
	((SeguroPJ)seguradora1.getListaSeguro().get(4)).autorizarCondutor(condutor15);
	
	((SeguroPF)seguradora1.getListaSeguro().get(5)).autorizarCondutor(condutor16);
	((SeguroPF)seguradora1.getListaSeguro().get(6)).autorizarCondutor(condutor17);
	((SeguroPF)seguradora1.getListaSeguro().get(7)).autorizarCondutor(condutor18);
	((SeguroPF)seguradora1.getListaSeguro().get(8)).autorizarCondutor(condutor19);
	((SeguroPF)seguradora1.getListaSeguro().get(9)).autorizarCondutor(condutor20);
	((SeguroPF)seguradora1.getListaSeguro().get(5)).autorizarCondutor(condutor21);
	((SeguroPF)seguradora1.getListaSeguro().get(6)).autorizarCondutor(condutor22);
	((SeguroPF)seguradora1.getListaSeguro().get(7)).autorizarCondutor(condutor23);
	((SeguroPF)seguradora1.getListaSeguro().get(8)).autorizarCondutor(condutor24);
	((SeguroPF)seguradora1.getListaSeguro().get(9)).autorizarCondutor(condutor25);
	((SeguroPF)seguradora1.getListaSeguro().get(5)).autorizarCondutor(condutor26);
	((SeguroPF)seguradora1.getListaSeguro().get(6)).autorizarCondutor(condutor27);
	((SeguroPF)seguradora1.getListaSeguro().get(7)).autorizarCondutor(condutor28);
	((SeguroPF)seguradora1.getListaSeguro().get(8)).autorizarCondutor(condutor29);
	((SeguroPF)seguradora1.getListaSeguro().get(9)).autorizarCondutor(condutor30);

	((SeguroPJ)seguradora1.getListaSeguro().get(0)).gerarSinistro(data15, "endereco"); //, condutor1);
	((SeguroPJ)seguradora1.getListaSeguro().get(0)).gerarSinistro(data11, "endereco2");
	((SeguroPJ)seguradora1.getListaSeguro().get(1)).gerarSinistro(data15, "endereco"); //, condutor2);
	((SeguroPJ)seguradora1.getListaSeguro().get(2)).gerarSinistro(data15, "endereco"); //, condutor3);
	((SeguroPJ)seguradora1.getListaSeguro().get(3)).gerarSinistro(data15, "endereco"); //, condutor4);
	((SeguroPJ)seguradora1.getListaSeguro().get(4)).gerarSinistro(data15, "endereco"); //, condutor5);
//	((SeguroPJ)seguradora1.getListaSeguro().get(5)).gerarSinistro(data15, "endereco"); //, condutor6);
//	((SeguroPJ)seguradora1.getListaSeguro().get(6)).gerarSinistro(data15, "endereco"); //, condutor7);
//	((SeguroPJ)seguradora1.getListaSeguro().get(7)).gerarSinistro(data15, "endereco"); //, condutor8);
//	((SeguroPJ)seguradora1.getListaSeguro().get(8)).gerarSinistro(data15, "endereco"); //, condutor9);
//	((SeguroPJ)seguradora1.getListaSeguro().get(9)).gerarSinistro(data15, "endereco"); //, condutor10);
//	
	((SeguroPF)seguradora1.getListaSeguro().get(5)).gerarSinistro(data15, "endereco"); //, condutor11);
	((SeguroPF)seguradora1.getListaSeguro().get(5)).gerarSinistro(data15, "endereco");
	((SeguroPF)seguradora1.getListaSeguro().get(6)).gerarSinistro(data15, "endereco"); //, condutor12);
	((SeguroPF)seguradora1.getListaSeguro().get(7)).gerarSinistro(data15, "endereco"); //, condutor13);
	((SeguroPF)seguradora1.getListaSeguro().get(8)).gerarSinistro(data15, "endereco"); //, condutor14);
	((SeguroPF)seguradora1.getListaSeguro().get(9)).gerarSinistro(data15, "endereco"); //, condutor15);
//	((SeguroPF)seguradora1.getListaSeguro().get(10)).gerarSinistro(data15, "endereco"); //, condutor16);
//	((SeguroPF)seguradora1.getListaSeguro().get(11)).gerarSinistro(data15, "endereco"); //, condutor17);
//	((SeguroPF)seguradora1.getListaSeguro().get(12)).gerarSinistro(data15, "endereco"); //, condutor18);
//	((SeguroPF)seguradora1.getListaSeguro().get(13)).gerarSinistro(data15, "endereco"); //, condutor19);
//	((SeguroPF)seguradora1.getListaSeguro().get(14)).gerarSinistro(data15, "endereco"); //, condutor20);
	
	seguradora1.getListaSeguro().get(0).getListaCondutor().get(0).adicionarSinistro(data15, "endereco");
	seguradora1.getListaSeguro().get(0).getListaCondutor().get(0).adicionarSinistro(data15, "endereco");
	seguradora1.getListaSeguro().get(1).getListaCondutor().get(0).adicionarSinistro(data15, "endereco");
	seguradora1.getListaSeguro().get(2).getListaCondutor().get(0).adicionarSinistro(data15, "endereco");
	seguradora1.getListaSeguro().get(3).getListaCondutor().get(0).adicionarSinistro(data15, "endereco");
	seguradora1.getListaSeguro().get(4).getListaCondutor().get(0).adicionarSinistro(data15, "endereco");
	seguradora1.getListaSeguro().get(5).getListaCondutor().get(0).adicionarSinistro(data15, "endereco");
	seguradora1.getListaSeguro().get(6).getListaCondutor().get(0).adicionarSinistro(data15, "endereco");
	seguradora1.getListaSeguro().get(7).getListaCondutor().get(0).adicionarSinistro(data15, "endereco");
	seguradora1.getListaSeguro().get(8).getListaCondutor().get(0).adicionarSinistro(data15, "endereco");
	seguradora1.getListaSeguro().get(9).getListaCondutor().get(0).adicionarSinistro(data15, "endereco");
//	seguradora1.getListaSeguro().get(10).getListaCondutor().get(0).adicionarSinistro(data15, "endereco");
//	seguradora1.getListaSeguro().get(11).getListaCondutor().get(0).adicionarSinistro(data15, "endereco");
//	seguradora1.getListaSeguro().get(12).getListaCondutor().get(0).adicionarSinistro(data15, "endereco");
//	seguradora1.getListaSeguro().get(13).getListaCondutor().get(0).adicionarSinistro(data15, "endereco");
//	seguradora1.getListaSeguro().get(14).getListaCondutor().get(0).adicionarSinistro(data15, "endereco");
//	seguradora1.getListaSeguro().get(15).getListaCondutor().get(0).adicionarSinistro(data15, "endereco");
//	seguradora1.getListaSeguro().get(16).getListaCondutor().get(0).adicionarSinistro(data15, "endereco");
//	seguradora1.getListaSeguro().get(17).getListaCondutor().get(0).adicionarSinistro(data15, "endereco");
//	seguradora1.getListaSeguro().get(18).getListaCondutor().get(0).adicionarSinistro(data15, "endereco");
//	seguradora1.getListaSeguro().get(19).getListaCondutor().get(0).adicionarSinistro(data15, "endereco");
//	
//   	System.out.println("valor mensal " + ((SeguroPJ)seguradora1.getListaSeguro().get(0)).getValorMensal());
////	
////	((SeguroPJ)seguradora1.getListaSeguro().get(0)).calcularValor();
////	
////	System.out.println("valor mensal " + ((SeguroPJ)seguradora1.getListaSeguro().get(0)).getValorMensal());
////	
////	
////	System.out.println("valor mensal " + ((SeguroPF)seguradora1.getListaSeguro().get(10)).getValorMensal());
////	
////	((SeguroPF)seguradora1.getListaSeguro().get(6)).calcularValor();
////	
////	System.out.println("valor mensal " + ((SeguroPF)seguradora1.getListaSeguro().get(10)).getValorMensal());
////	
//	
//	
////	System.out.println(frota1.getListaVeiculos());
////	System.out.println(clientePF1.getListaVeiculos());
////	System.out.println(seguradora1.getListaSeguro().get(0).getId());
////	System.out.println(seguradora1.getListaSeguro().get(0).getListaCondutor().stream().map(Condutor::getCpf).collect(Collectors.toList()));
////	System.out.println(seguradora1.getSeguroPorCliente(clientePF1).stream().map(Seguro::getId).collect(Collectors.toList())); 
////	System.out.println(seguradora1.getListaSeguro().get(0).getId());
////	System.out.println(seguradora1.getListaSeguro().get(0).getId());
////	System.out.println(seguradora1.getListaSeguro().get(0).getId());
//	
	
	for(int i =0; i < seguradora1.getListaSeguro().size(); i++) {
		if(seguradora1.getListaSeguro().get(i) instanceof SeguroPF) {
			((SeguroPF)seguradora1.getListaSeguro().get(i)).calcularValor();
		}
		if(seguradora1.getListaSeguro().get(i) instanceof SeguroPJ) {
			((SeguroPJ)seguradora1.getListaSeguro().get(i)).calcularValor();
		}
	}
	
	
	seguradora1.lerDados();
	seguradora1.gravarDados();
	
	//chama menu principal
	Scanner scan = new Scanner (System.in);
	FuncoesMenu.menuPrincipal(scan, listaSeguradora);
//
//
	    }
		
	

		
}

	

	


	



	




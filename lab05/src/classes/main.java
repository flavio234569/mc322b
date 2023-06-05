package classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class main {
	public static void main(String[] args) {
		
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
	ClientePJ clientePJ6 = new ClientePJ("nomePJ6", "telefonePJ6", "enderecoPJ6", "emailPJ6", "cnpj6", data1, 100);
	ClientePJ clientePJ7 = new ClientePJ("nomePJ7", "telefonePJ7", "enderecoPJ7", "emailPJ7", "cnpj7", data2, 100);
	ClientePJ clientePJ8 = new ClientePJ("nomePJ8", "telefonePJ8", "enderecoPJ8", "emailPJ8", "cnpj8", data3, 100);
	ClientePJ clientePJ9 = new ClientePJ("nomePJ9", "telefonePJ9", "enderecoPJ9", "emailPJ9", "cnpj9", data4, 100);
	ClientePJ clientePJ10 = new ClientePJ("nomePJ10", "telefonePJ10", "enderecoPJ10", "emailPJ10", "cnpj10", data5, 100);

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
	seguradora1.cadastrarCliente(clientePJ6);
	seguradora1.cadastrarCliente(clientePJ7);
	seguradora1.cadastrarCliente(clientePJ8);
	seguradora1.cadastrarCliente(clientePJ9);
	seguradora1.cadastrarCliente(clientePJ10);

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
	Frota frota6 = new Frota("codigofrota6");
	Frota frota7 = new Frota("codigofrota7");
	Frota frota8 = new Frota("codigofrota8");
	Frota frota9 = new Frota("codigofrota9");
	Frota frota10 = new Frota("codigofrota10");
	
	Veiculo veiculo1 = new Veiculo("placa1", "marca1", "modelo1", 1990);
	Veiculo veiculo2 = new Veiculo("placa2", "marca1", "modelo1", 1990);
	Veiculo veiculo3 = new Veiculo("placa3", "marca1", "modelo1", 1990);
	Veiculo veiculo4 = new Veiculo("placa4", "marca1", "modelo1", 1990);
	Veiculo veiculo5 = new Veiculo("placa5", "marca1", "modelo1", 1990);
	Veiculo veiculo6 = new Veiculo("placa6", "marca1", "modelo1", 1990);
	Veiculo veiculo7 = new Veiculo("placa7", "marca1", "modelo1", 1990);
	Veiculo veiculo8 = new Veiculo("placa8", "marca1", "modelo1", 1990);
	Veiculo veiculo9 = new Veiculo("placa9", "marca1", "modelo1", 1990);
	Veiculo veiculo10 = new Veiculo("placa10", "marca1", "modelo1", 1990);
	Veiculo veiculo11 = new Veiculo("placa11", "marca1", "modelo1", 1990);
	Veiculo veiculo12 = new Veiculo("placa12", "marca1", "modelo1", 1990);
	Veiculo veiculo13 = new Veiculo("placa13", "marca1", "modelo1", 1990);
	Veiculo veiculo14 = new Veiculo("placa14", "marca1", "modelo1", 1990);
	Veiculo veiculo15 = new Veiculo("placa15", "marca1", "modelo1", 1990);
	Veiculo veiculo16 = new Veiculo("placa16", "marca1", "modelo1", 1990);
	Veiculo veiculo17 = new Veiculo("placa17", "marca1", "modelo1", 1990);
	Veiculo veiculo18 = new Veiculo("placa18", "marca1", "modelo1", 1990);
	Veiculo veiculo19 = new Veiculo("placa19", "marca1", "modelo1", 1990);
	Veiculo veiculo20 = new Veiculo("placa20", "marca1", "modelo1", 1990);
	Veiculo veiculo21 = new Veiculo("placa21", "marca1", "modelo1", 1990);
	Veiculo veiculo22 = new Veiculo("placa22", "marca1", "modelo1", 1990);
	Veiculo veiculo23 = new Veiculo("placa23", "marca1", "modelo1", 1990);
	Veiculo veiculo24 = new Veiculo("placa24", "marca1", "modelo1", 1990);
	Veiculo veiculo25 = new Veiculo("placa25", "marca1", "modelo1", 1990);
	
	clientePJ1.cadastrarFrota(frota1);
	clientePJ2.cadastrarFrota(frota2);
	clientePJ3.cadastrarFrota(frota3);
	clientePJ4.cadastrarFrota(frota4);
	clientePJ5.cadastrarFrota(frota5);
	clientePJ6.cadastrarFrota(frota6);
	clientePJ7.cadastrarFrota(frota7);
	clientePJ8.cadastrarFrota(frota8);
	clientePJ9.cadastrarFrota(frota9);
	clientePJ10.cadastrarFrota(frota10);
	
	//clientePJ1.atualizarFrota(clientePJ1.getListaFrota().get(0), veiculo1);
	clientePJ1.atualizarFrota(frota1, veiculo1);
	clientePJ2.atualizarFrota(frota2, veiculo2);
	clientePJ3.atualizarFrota(frota3, veiculo3);
	clientePJ4.atualizarFrota(frota4, veiculo4);
	clientePJ5.atualizarFrota(frota5, veiculo5);
	clientePJ6.atualizarFrota(frota6, veiculo6);
	clientePJ7.atualizarFrota(frota7, veiculo7);
	clientePJ8.atualizarFrota(frota8, veiculo8);
	clientePJ9.atualizarFrota(frota9, veiculo9);
	clientePJ10.atualizarFrota(frota10, veiculo10);
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
	seguradora1.gerarSeguro(data14, data15, frota6, clientePJ6);
	seguradora1.gerarSeguro(data14, data15, frota7, clientePJ7);
	seguradora1.gerarSeguro(data14, data15, frota8, clientePJ8);
	seguradora1.gerarSeguro(data14, data15, frota9, clientePJ9);
	seguradora1.gerarSeguro(data14, data15, frota10, clientePJ10);
	
	seguradora1.gerarSeguro(data14, data15, veiculo16, clientePF1);
	seguradora1.gerarSeguro(data14, data15, veiculo17, clientePF2);
	seguradora1.gerarSeguro(data14, data15, veiculo18, clientePF3);
	seguradora1.gerarSeguro(data14, data15, veiculo19, clientePF4);
	seguradora1.gerarSeguro(data14, data15, veiculo20, clientePF5);
	seguradora1.gerarSeguro(data14, data15, veiculo21, clientePF6);
	seguradora1.gerarSeguro(data14, data15, veiculo22, clientePF7);
	seguradora1.gerarSeguro(data14, data15, veiculo23, clientePF8);
	seguradora1.gerarSeguro(data14, data15, veiculo24, clientePF9);
	seguradora1.gerarSeguro(data14, data15, veiculo25, clientePF10);
	
	//seguradora1.gerarSeguro(data14, data15, frota1, clientePJ1);
	
	((SeguroPJ)seguradora1.getListaSeguro().get(0)).autorizarCondutor(condutor1);
	((SeguroPJ)seguradora1.getListaSeguro().get(1)).autorizarCondutor(condutor2);
	((SeguroPJ)seguradora1.getListaSeguro().get(2)).autorizarCondutor(condutor3);
	((SeguroPJ)seguradora1.getListaSeguro().get(3)).autorizarCondutor(condutor4);
	((SeguroPJ)seguradora1.getListaSeguro().get(4)).autorizarCondutor(condutor5);
	((SeguroPJ)seguradora1.getListaSeguro().get(5)).autorizarCondutor(condutor6);
	((SeguroPJ)seguradora1.getListaSeguro().get(6)).autorizarCondutor(condutor7);
	((SeguroPJ)seguradora1.getListaSeguro().get(7)).autorizarCondutor(condutor8);
	((SeguroPJ)seguradora1.getListaSeguro().get(8)).autorizarCondutor(condutor9);
	((SeguroPJ)seguradora1.getListaSeguro().get(9)).autorizarCondutor(condutor10);
	((SeguroPJ)seguradora1.getListaSeguro().get(0)).autorizarCondutor(condutor11);
	((SeguroPJ)seguradora1.getListaSeguro().get(1)).autorizarCondutor(condutor12);
	((SeguroPJ)seguradora1.getListaSeguro().get(2)).autorizarCondutor(condutor13);
	((SeguroPJ)seguradora1.getListaSeguro().get(3)).autorizarCondutor(condutor14);
	((SeguroPJ)seguradora1.getListaSeguro().get(4)).autorizarCondutor(condutor15);
	
	((SeguroPF)seguradora1.getListaSeguro().get(10)).autorizarCondutor(condutor16);
	((SeguroPF)seguradora1.getListaSeguro().get(11)).autorizarCondutor(condutor17);
	((SeguroPF)seguradora1.getListaSeguro().get(12)).autorizarCondutor(condutor18);
	((SeguroPF)seguradora1.getListaSeguro().get(13)).autorizarCondutor(condutor19);
	((SeguroPF)seguradora1.getListaSeguro().get(14)).autorizarCondutor(condutor20);
	((SeguroPF)seguradora1.getListaSeguro().get(15)).autorizarCondutor(condutor21);
	((SeguroPF)seguradora1.getListaSeguro().get(16)).autorizarCondutor(condutor22);
	((SeguroPF)seguradora1.getListaSeguro().get(17)).autorizarCondutor(condutor23);
	((SeguroPF)seguradora1.getListaSeguro().get(18)).autorizarCondutor(condutor24);
	((SeguroPF)seguradora1.getListaSeguro().get(19)).autorizarCondutor(condutor25);
	((SeguroPF)seguradora1.getListaSeguro().get(10)).autorizarCondutor(condutor26);
	((SeguroPF)seguradora1.getListaSeguro().get(11)).autorizarCondutor(condutor27);
	((SeguroPF)seguradora1.getListaSeguro().get(12)).autorizarCondutor(condutor28);
	((SeguroPF)seguradora1.getListaSeguro().get(13)).autorizarCondutor(condutor29);
	((SeguroPF)seguradora1.getListaSeguro().get(14)).autorizarCondutor(condutor30);

	((SeguroPJ)seguradora1.getListaSeguro().get(0)).gerarSinistro(data15, "endereco", condutor1);
	((SeguroPJ)seguradora1.getListaSeguro().get(1)).gerarSinistro(data15, "endereco", condutor2);
	((SeguroPJ)seguradora1.getListaSeguro().get(2)).gerarSinistro(data15, "endereco", condutor3);
	((SeguroPJ)seguradora1.getListaSeguro().get(3)).gerarSinistro(data15, "endereco", condutor4);
	((SeguroPJ)seguradora1.getListaSeguro().get(4)).gerarSinistro(data15, "endereco", condutor5);
	((SeguroPJ)seguradora1.getListaSeguro().get(5)).gerarSinistro(data15, "endereco", condutor6);
	((SeguroPJ)seguradora1.getListaSeguro().get(6)).gerarSinistro(data15, "endereco", condutor7);
	((SeguroPJ)seguradora1.getListaSeguro().get(7)).gerarSinistro(data15, "endereco", condutor8);
	((SeguroPJ)seguradora1.getListaSeguro().get(8)).gerarSinistro(data15, "endereco", condutor9);
	((SeguroPJ)seguradora1.getListaSeguro().get(9)).gerarSinistro(data15, "endereco", condutor10);
	
	((SeguroPF)seguradora1.getListaSeguro().get(10)).gerarSinistro(data15, "endereco", condutor11);
	((SeguroPF)seguradora1.getListaSeguro().get(11)).gerarSinistro(data15, "endereco", condutor12);
	((SeguroPF)seguradora1.getListaSeguro().get(12)).gerarSinistro(data15, "endereco", condutor13);
	((SeguroPF)seguradora1.getListaSeguro().get(13)).gerarSinistro(data15, "endereco", condutor14);
	((SeguroPF)seguradora1.getListaSeguro().get(14)).gerarSinistro(data15, "endereco", condutor15);
	((SeguroPF)seguradora1.getListaSeguro().get(15)).gerarSinistro(data15, "endereco", condutor16);
	((SeguroPF)seguradora1.getListaSeguro().get(16)).gerarSinistro(data15, "endereco", condutor17);
	((SeguroPF)seguradora1.getListaSeguro().get(17)).gerarSinistro(data15, "endereco", condutor18);
	((SeguroPF)seguradora1.getListaSeguro().get(18)).gerarSinistro(data15, "endereco", condutor19);
	((SeguroPF)seguradora1.getListaSeguro().get(19)).gerarSinistro(data15, "endereco", condutor20);
	
	
	System.out.println(frota1.getListaVeiculos());
	System.out.println(clientePF1.getListaVeiculos());
	System.out.println(seguradora1.getListaSeguro().get(0).getId());
	System.out.println(seguradora1.getListaSeguro().get(0).getListaCondutor().stream().map(Condutor::getCpf).collect(Collectors.toList()));
	System.out.println(seguradora1.getSeguroPorCliente(clientePF1).stream().map(Seguro::getId).collect(Collectors.toList())); 
	System.out.println(seguradora1.getListaSeguro().get(0).getId());
	System.out.println(seguradora1.getListaSeguro().get(0).getId());
	System.out.println(seguradora1.getListaSeguro().get(0).getId());
	
	Scanner scan = new Scanner (System.in);
	FuncoesMenu.menuPrincipal(scan, listaSeguradora);

//	
//	
//	
//
//	
//	Veiculo veiculo1 = new Veiculo("placa1", "marca1", "modelo1", 1994);
//	
//	
//	//System.out.println(veiculo1.toString());
//	
//	System.out.println(frota1.toString());
//	
//	frota1.addVeiculo(veiculo1);
//	
//	System.out.println(frota1.toString());
//	
//	frota1.addVeiculo(veiculo1);
//	
//	
//	
//	System.out.println(clientePJ1.toString());
//	
//	clientePJ1.cadastrarFrota(frota1);
//	
//	System.out.println(clientePJ1.cadastrarFrota(frota2));
//	
//	
//	
//	seguradora1.gerarSeguro(data1, data2, 90.0, veiculo1, clientePF1);
//	seguradora1.gerarSeguro(data1, data2, 90.0, frota1, clientePJ1);
//
	
	
	//System.out.println(seguradora1.toString());
	
	//System.out.println("asdf" + seguradora1.getListaSeguro().stream().map(Seguro::getId).collect(Collectors.toList()));
	
	//System.out.println("asdf" + seguradora1.getListaSeguro().get(0).getSeguradora());
	

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

	

	


	



	




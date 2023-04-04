//como instanciar data
//






package classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		
//		ArrayList<Integer> list = new ArrayList<>();
//		list.add(67);
//		list.add(98);
		
//		Seguradora seguradora1 = new Seguradora("nomeseguradora1", "19555555555", "nomeseguradora1@email.com", "rua da seguradora1 num 111",
//				list, list);
		
		
		//Cliente cliente1 = new Cle
		
		//System.out.print(seguradora1.toString());
		Date date = new Date(2009, 9, 12);
		//List<Veiculo> listaveiculocliente1 = new ArrayList<Veiculo>();
		Veiculo veiculo1 = new Veiculo("abc1111", "marca1", "modelo1", 2021);
		Veiculo veiculo2 = new Veiculo("abc2222", "marca2", "modelo2", 2022);

		
		
		ClientePJ clientepj1 = new ClientePJ("nomecliente1", "enderecocliente1", new Date(2009, 9, 12), 
				"escolaridadecliente1", "generocliente1", "classeeconomicacliente1",
				 "68.518.377/0001-70", new Date(2009, 9, 12));
		
		clientepj1.setListaVeiculos(veiculo1);
		//clientepj1.setListaVeiculos(veiculo2);
		
		System.out.print(clientepj1.toString());
		
	}

}


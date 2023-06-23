package classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Seguradora {
	private final String cnpj;
	private String nome;
	private String telefone;
	private String endereco;
	private String email;

	private List<Cliente> listaClientes;
	private List<Seguro> listaSeguros;
	
	//metodo construtor
	public Seguradora (String cnpj, String nome, String telefone, String email, String endereco) {
			//List<Sinistro> listaSinistros, List<Cliente> listaClientes) {
		this.cnpj = cnpj;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
		//this.listaSinistros = new ArrayList<Sinistro>();
		this.listaClientes = new ArrayList<Cliente>(); 
		this.listaSeguros = new ArrayList<Seguro>();
	
	}
	
	
	//metodos getters e setters
	public String getCnpj() {
		return cnpj;
	}	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public List<Seguro> getListaSeguro() {
		return listaSeguros;
	}

	//lista clientes por PJ ou PF como parametro na forma de string
	//public List<String> listarClientes(String tipoCliente) {
	public List<Cliente> listarClientes(String tipoCliente) {	
		List<Cliente> listaCliente = new ArrayList<Cliente>();
		for (Cliente cliente : this.getListaClientes()) {
			if (tipoCliente == "PJ") {
				if (cliente instanceof ClientePJ) {
					//System.out.println(cliente.getNome());
					listaCliente.add(cliente);
				}
			}
			else if(tipoCliente == "PF"){
				if (cliente instanceof ClientePF) {
					//System.out.println(cliente.getNome());
					listaCliente.add(cliente);
				}
			}
		}
		return listaCliente;
	}
	

	//gerar seguro PJ
	public boolean gerarSeguro(Date dataInicio, Date dataFim, Frota frota, ClientePJ clientePJ){

		SeguroPJ seguroPJ1 = new SeguroPJ(dataInicio, dataFim, this, frota, clientePJ);
		this.listaSeguros.add(seguroPJ1);

	return true;
	
}
	
	//gerar seguro PF
	public boolean gerarSeguro(Date dataInicio, Date dataFim, Veiculo veiculo, ClientePF clientePF){
			SeguroPF seguroPF1 = new SeguroPF(dataInicio, dataFim, this, veiculo, clientePF);
			this.getListaSeguro().add(seguroPF1);
		return true;
	}
	
	//remove seguro
	public void cancelarSeguro(Seguro seguro) {
		this.getListaSeguro().remove(seguro);
	}

	//metodo para cadastrar cliente, caso ja exista o objeto, retorna falso
	public boolean cadastrarCliente(Cliente cliente) {
		if (this.listaClientes.contains(cliente)) {
			return false;
		}
		else {
			this.listaClientes.add(cliente);
			return true;
		}
		
	}
	
	//remove cliente pela String CPF, caso nao exista o cpf retorna falso
	public boolean removerCliente(String cpfcnpj) {
		for (Cliente cliente : this.getListaClientes()) {
			if (cliente instanceof ClientePF) {
				if(((ClientePF) cliente).getCpf().replaceAll("\\.", "").replaceAll("-", "").equals(cpfcnpj.replaceAll("\\.", "").replaceAll("-", ""))) {
					this.listaClientes.remove(cliente);
					return true;
				}			
			}
			else if (cliente instanceof ClientePJ) {
				if(((ClientePJ) cliente).getCnpj().replaceAll("\\.", "").replaceAll("-", "").replaceAll("/", "").equals(cpfcnpj.replaceAll("\\.", "").replaceAll("-", "").replaceAll("/", ""))) {
					this.listaClientes.remove(cliente);
					return true;
				}	
			}
			else {
				return false;
			}
		}
	return false;
	}

	
	//lista seguro por cliente
	public List<Seguro> getSeguroPorCliente(ClientePJ clientePJ){
		List <Seguro> listaSeguroPorCliente = new ArrayList<Seguro>();
		for (int i = 0; i < this.listaSeguros.size(); i++) {
			if (this.listaSeguros.get(i) instanceof SeguroPJ) {
				if (((SeguroPJ)this.listaSeguros.get(i)).getClientePJ().equals(clientePJ)) {
					listaSeguroPorCliente.add(((SeguroPJ)this.listaSeguros.get(i)));
				}
			}

		}
		
		return listaSeguroPorCliente;
		
	}
	
	public List<Sinistro> getSinistroPorCliente(ClientePJ clientePJ){
		List<Sinistro> listaSinistro1 = new ArrayList<Sinistro>();
		for (int i = 0; i < this.getListaSeguro().size(); i++) {
			if ((this.getListaSeguro().get(i)) instanceof SeguroPJ) {
				
				if(((SeguroPJ)this.getListaSeguro().get(i)).getClientePJ().equals(clientePJ)) {
					listaSinistro1 = Stream.concat(listaSinistro1.stream(), this.getListaSeguro().get(i).getListaSinistros().stream()).toList();
				}	
			}
		}
		return listaSinistro1;
	}

	public List<Sinistro> getSinistroPorCliente(ClientePF clientePF){
		List<Sinistro> listaSinistro1 = new ArrayList<Sinistro>();
		for (int i = 0; i < this.getListaSeguro().size(); i++) {
			if ((this.getListaSeguro().get(i)) instanceof SeguroPF) {
				
				if(((SeguroPF)this.getListaSeguro().get(i)).getClientePF().equals(clientePF)) {
					listaSinistro1 = Stream.concat(listaSinistro1.stream(), this.getListaSeguro().get(i).getListaSinistros().stream()).toList();
				}
			}
		}
		return listaSinistro1;
	}


	
	public List<Seguro> getSeguroPorCliente(ClientePF clientePF){
		List <Seguro> listaSeguroPorCliente = new ArrayList<Seguro>();
		for (int i = 0; i < this.listaSeguros.size(); i++) {
			if (this.listaSeguros.get(i) instanceof SeguroPF) {
				if (((SeguroPF)this.listaSeguros.get(i)).getClientePF().equals(clientePF)) {
					listaSeguroPorCliente.add(((SeguroPF)this.listaSeguros.get(i)));
				}
			}

		}
		
		return listaSeguroPorCliente;
		
	}
	
	//atualiza valores do seguro e calcula receita total
	public double calcularReceita(){
		double receitaTotal = 0;
		
		for (int j = 0; j < this.getListaSeguro().size(); j++) {
			this.getListaSeguro().get(j).calcularValor();
		}
		for (int j = 0; j < this.getListaSeguro().size(); j++) {
			receitaTotal = receitaTotal + this.getListaSeguro().get(j).getValorMensal();
		}
		return receitaTotal;
	}
	
	//metodo com sobrescrita
	public void lerDados() {
		SimpleDateFormat formatadata = new SimpleDateFormat("yyyy-MM-dd");
		Date data1 = null;
		try {
			data1 = formatadata.parse("2020-12-15");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArquivoClientePF arquivoClientePF = new ArquivoClientePF();
		String[] stringClientePF = arquivoClientePF.lerArquivo().split(";");
		
		ArquivoClientePJ arquivoClientePJ = new ArquivoClientePJ();
		String[] stringClientePJ = arquivoClientePJ.lerArquivo().split(";");
		
		ArquivoFrota arquivoFrota = new ArquivoFrota();
		String[] stringFrota = arquivoFrota.lerArquivo().split(";");
		
		ArquivoVeiculo arquivoVeiculo = new ArquivoVeiculo();
		String[] stringVeiculos = arquivoVeiculo.lerArquivo().split(";");
		
		ArquivoCondutor arquivoCondutor = new ArquivoCondutor();
		String[] stringCondutor = arquivoCondutor.lerArquivo().split(";");

		//condutor
				int auxCondutor = 0;
				for (String a : stringCondutor) {
					String splitA[] = a.split(",");
					try {
		            	if (auxCondutor != 0) {
		            		
		            		try {
		            			Condutor condutor = new Condutor(splitA[0], splitA[1], splitA[2], 
		            				splitA[3], splitA[4], formatadata.parse(splitA[5]));
		            		

		            			if(this.listaSeguros.get(0) instanceof SeguroPF) {
		            				((SeguroPF)this.listaSeguros.get(0)).autorizarCondutor(condutor);
		            				this.listaSeguros.get(0).getListaCondutor().get(this.listaSeguros.get(0).getListaCondutor().size()-1).adicionarSinistro(data1, "endsinistro");
		            			}
		            			else {
		            				((SeguroPJ)this.listaSeguros.get(0)).autorizarCondutor(condutor);
		            				this.listaSeguros.get(0).getListaCondutor().get(this.listaSeguros.get(0).getListaCondutor().size()-1).adicionarSinistro(data1, "endsinistro");
		            			}
		            			

		            			
		            		}catch (ParseException e){
		                        e.printStackTrace();
		                    }
		            		
		            		//listadeveiculoarq.add(veiculo1);
		            		//clientePF.getListaVeiculos().add(veiculo1);
		            	}
					}catch (NumberFormatException ex){
		                ex.printStackTrace();
		            }
					auxCondutor++;
				}
		
		
		//clientePJ
		int auxClientePJ = 0;
		for (String a : stringClientePJ) {
			String splitA[] = a.split(",");
			try {
            	if (auxClientePJ != 0) {
            		
            		try {
            			ClientePJ clientePJ1 = new ClientePJ(splitA[1], splitA[2], splitA[3], 
            				splitA[4], splitA[0], formatadata.parse(splitA[5]),10);

            			for (String b : stringFrota) {
            				String splitB[] = b.split(",");
            				//System.out.println("spliteste" + splitB[0] + " " + splitA[6]);
            				if (splitB[0].equals(splitA[6])) {
            					Frota frota1 = new Frota(splitB[0]);
            					
                    			for (String c : stringVeiculos) {
                    				String splitC[] = c.split(",");
                    				//System.out.println(splitB[0] + " " + splitA[8]);
                    				if (splitC[0].equals(splitB[1])) {
                    					
                    					Veiculo veiculo1 = new Veiculo(splitC[0], splitC[1], splitC[2], Integer.parseInt(splitC[3]));
                    					frota1.addVeiculo(veiculo1);
                    				}
                    				if (splitC[0].equals(splitB[2])) {
                    					
                    					Veiculo veiculo1 = new Veiculo(splitC[0], splitC[1], splitC[2], Integer.parseInt(splitC[3]));
                    					frota1.addVeiculo(veiculo1);
                    				}
                    				if (splitC[0].equals(splitB[3])) {
                    					
                    					Veiculo veiculo1 = new Veiculo(splitC[0], splitC[1], splitC[2], Integer.parseInt(splitC[3]));
                    					frota1.addVeiculo(veiculo1);
                    				}
                    				
                    			}
                    			clientePJ1.cadastrarFrota(frota1);

            				}
            			}
            			this.cadastrarCliente(clientePJ1);

            			
            		}catch (ParseException e){
                        e.printStackTrace();
                    }
            		
            		//listadeveiculoarq.add(veiculo1);
            		//clientePF.getListaVeiculos().add(veiculo1);
            	}
			}catch (NumberFormatException ex){
                ex.printStackTrace();
            }
			auxClientePJ++;
		}
		
		
		
		
		//clientePF
		int auxClientePF = 0;
		for (String a : stringClientePF) {
			String splitA[] = a.split(",");
			try {
            	if (auxClientePF != 0) {
            		
            		try {
            			ClientePF clientePF1 = new ClientePF(splitA[1], splitA[2], splitA[3], 
            				splitA[4], splitA[0], splitA[5], splitA[6], formatadata.parse(splitA[7]));
            			//System.out.print("aaaaaaaaaaaaaaaaaa");
            			for (String b : stringVeiculos) {
            				String splitB[] = b.split(",");
            				//System.out.println(splitB[0] + " " + splitA[8]);
            				if (splitB[0].equals(splitA[8])) {
            					
            					Veiculo veiculo1 = new Veiculo(splitB[0], splitB[1], splitB[2], Integer.parseInt(splitB[3]));
            					clientePF1.cadastrarVeiculo(veiculo1);
            				}
            			}
            			this.cadastrarCliente(clientePF1);
//            			for(String d : stringCondutor) {
//            				String splitD[] = d.split(",");
//            				if(splitA[1].equals(splitD[1])) {
//            					//System.out.println("entraif2");
//            					clientePF1.getLista
//            					
//            				}
//            			}
            			
            		}catch (ParseException e){
                        e.printStackTrace();
                    }
            		
            		//listadeveiculoarq.add(veiculo1);
            		//clientePF.getListaVeiculos().add(veiculo1);
            	}
			}catch (NumberFormatException ex){
                ex.printStackTrace();
            }
			auxClientePF++;
		}
		
//        String[] split;
//        split = tudo.split(";");
//        int aux = 0;
//        for (String a : split) {
//        	String splitA[];
//        	splitA = a.split(",");
//            try{
//            	if (aux != 0) {
//            		Veiculo veiculo1 = new Veiculo(splitA[0], splitA[1], splitA[2], Integer.parseInt(splitA[3])); 
//            		listadeveiculoarq.add(veiculo1);
//            		//clientePF.getListaVeiculos().add(veiculo1);
//            	}
//            }
//            catch (NumberFormatException ex){
//                ex.printStackTrace();
//            }
//			aux++;
//        }
//        System.out.println(listadeveiculoarq);
	}

	public void gravarDados(){
		
		ArquivoVeiculo arquivoVeiculo = new ArquivoVeiculo();
		arquivoVeiculo.gravarArquivo(this.gerarStringVeiculos());
		
		ArquivoClientePF arquivoClientePF = new ArquivoClientePF();
		arquivoClientePF.gravarArquivo(this.gerarStringClientePF());
		
		ArquivoClientePJ arquivoClientePJ = new ArquivoClientePJ();
		arquivoClientePJ.gravarArquivo(this.gerarStringClientePJ());
		
		ArquivoFrota arquivoFrota = new ArquivoFrota();
		arquivoFrota.gravarArquivo(this.gerarStringFrotas());
		
		ArquivoSeguros arquivoSeguros = new ArquivoSeguros();
		arquivoSeguros.gravarArquivo(this.gerarStringSeguros());
		
		ArquivoSinistro arquivoSinistro = new ArquivoSinistro();
		arquivoSinistro.gravarArquivo(this.gerarStringSinistros());
		
		
		

	}
	
	public String gerarStringSinistros(){
		SimpleDateFormat formatadata = new SimpleDateFormat("yyyy-MM-dd");
		String stringSinistros = "";
			
			for(Seguro seguro : this.getListaSeguro()) {
				for(Sinistro sinistro : seguro.getListaSinistros()) {
					stringSinistros = stringSinistros + sinistro.getId() + "," +
							formatadata.format(sinistro.getData()) + "," + sinistro.getEndereco() + "," +
							"sem_condutor," + seguro.getId() + "\n";
				}
			}
			
			
			
			
			for (Seguro seguro : this.getListaSeguro()) {
				for(Condutor condutor : seguro.getListaCondutor()) {
					for(Sinistro sinistro : condutor.getListaSinistros()) {
						stringSinistros = stringSinistros + sinistro.getId() + "," +
								formatadata.format(sinistro.getData()) + "," + sinistro.getEndereco() + "," +
								sinistro.getCondutor().getCpf() + "," + seguro.getId() + "\n";
					}
				}
			}
		System.out.print(stringSinistros); 
		return stringSinistros;
	}
	
	
	private String gerarStringSeguros(){
		SimpleDateFormat formatadata = new SimpleDateFormat("yyyy-MM-dd");
		String stringSeguros = "";
		
		for (Seguro seguro : this.getListaSeguro()) {
			if (seguro instanceof SeguroPF) {
				stringSeguros = stringSeguros + ((SeguroPF)seguro).getId() + "," + formatadata.format(((SeguroPF)seguro).getDataInicio()) + "," +
				formatadata.format(((SeguroPF)seguro).getDataFim()) + "," + 
						((SeguroPF)seguro).getListaSinistros().stream().map(Sinistro::getId).collect(Collectors.toList()) + "," +
						((SeguroPF)seguro).getListaCondutor().stream().map(Condutor::getCpf).collect(Collectors.toList()) + "," + 
						((SeguroPF)seguro).getValorMensal() + "\n";
			}
			if (seguro instanceof SeguroPJ) {
				stringSeguros = stringSeguros + ((SeguroPJ)seguro).getId() + "," + formatadata.format(((SeguroPJ)seguro).getDataInicio()) + "," +
				formatadata.format(((SeguroPJ)seguro).getDataFim()) + "," + 
						((SeguroPJ)seguro).getListaSinistros().stream().map(Sinistro::getId).collect(Collectors.toList()) + "," +
						((SeguroPJ)seguro).getListaCondutor().stream().map(Condutor::getCpf).collect(Collectors.toList()) + "," + 
						((SeguroPJ)seguro).getValorMensal() + "\n";
			}

		}
		
		
		//System.out.print(stringSeguros); 
		stringSeguros = "ID,DATAINICIO,DATAFIM,LISTASINISTROS,LISTACONDUTORES,VALORMENSAL\n" + stringSeguros;
		//System.out.print(stringSeguros);
		return stringSeguros;
	}
	
	private String gerarStringFrotas(){
		String stringFrota = "";
		for(Cliente cliente : this.listarClientes("PJ")) {
			stringFrota = stringFrota + ((ClientePJ)cliente).getListaFrota().get(0).getCode() + "," +
					((ClientePJ)cliente).getListaFrota().get(0).getListaVeiculos().get(0).getPlaca() + "," +
					((ClientePJ)cliente).getListaFrota().get(0).getListaVeiculos().get(1).getPlaca() + "," +
					((ClientePJ)cliente).getListaFrota().get(0).getListaVeiculos().get(2).getPlaca() + "\n";
		}
		
		stringFrota = "ID_FROTA,PLACA_VEICULO1,PLACA_VEICULO2,PLACA_VEICULO3\n" + stringFrota;
		
		return stringFrota;
	}
	
	
	private String gerarStringVeiculos(){
		String stringVeiculos = "";
		
		List<Veiculo> listaVeiculoArq = new ArrayList<Veiculo>();
		for (int i = 0; i < this.getListaClientes().size(); i++) {
			if(this.getListaClientes().get(i) instanceof ClientePF) {
				for(int j = 0; j < ((ClientePF)this.getListaClientes().get(i)).getListaVeiculos().size(); j++) {
					listaVeiculoArq.add(((ClientePF)this.getListaClientes().get(i)).getListaVeiculos().get(j));
				}
				
			}
			else if(this.getListaClientes().get(i) instanceof ClientePJ) {
				for (int j = 0; j < ((ClientePJ)this.getListaClientes().get(i)).getListaFrota().size(); j++) {
					for(int k = 0; k < ((ClientePJ)this.getListaClientes().get(i)).getListaFrota().get(j).getListaVeiculos().size(); k++) {
						listaVeiculoArq.add(((ClientePJ)this.getListaClientes().get(i)).getListaFrota().get(j).getListaVeiculos().get(k));
					}
				}		
			}
			
		}
		
		//System.out.print(listaVeiculoArq);
		for(Veiculo veiculo : listaVeiculoArq) {
			stringVeiculos = stringVeiculos + veiculo.getPlaca() + "," + veiculo.getMarca() + "," + veiculo.getModelo() + "," + veiculo.getAnoFabricacao() + "\n";
		}
		stringVeiculos = "PLACA,MARCA,MODELO,ANO_FAB\n" + stringVeiculos;
		//System.out.print(stringVeiculos);
		return stringVeiculos;
		
		
	}
	
	private String gerarStringClientePF(){
		SimpleDateFormat formatadata = new SimpleDateFormat("yyyy-MM-dd");
		String stringClientePF = "";
		for(Cliente cliente : this.listarClientes("PF")) {
			stringClientePF = stringClientePF + ((ClientePF)cliente).getCpf() + "," +
					((ClientePF)cliente).getNome() + "," + ((ClientePF)cliente).getTelefone() + "," +
					((ClientePF)cliente).getEndereco() + "," + ((ClientePF)cliente).getEmail() + "," +
					((ClientePF)cliente).getGenero() + "," + ((ClientePF)cliente).getEducacao() + "," +
					//((ClientePF)cliente).getDataNascimento()
					formatadata.format(((ClientePF)cliente).getDataNascimento())
					+ "," + ((ClientePF)cliente).getListaVeiculos().get(0).getPlaca() + "\n";	
		}
		stringClientePF = "CPF_CLIENTE,NOME_CLIENTE,TELEFONE_CLIENTE,ENDERECO_CLIENTE,EMAIL_CLIENTE,SEXO,ENSINO,DATA_NASCIMENTO,PLACA_VEICULO_CLIENTE1\n" + stringClientePF;
		System.out.println("");
		return stringClientePF;
	}
	
	private String gerarStringClientePJ(){
		SimpleDateFormat formatadata = new SimpleDateFormat("yyyy-MM-dd");
		String stringClientePJ = "";
		for(Cliente cliente : this.listarClientes("PJ")) {
			stringClientePJ = stringClientePJ + ((ClientePJ)cliente).getCnpj() + "," +
					((ClientePJ)cliente).getNome() + "," + ((ClientePJ)cliente).getTelefone() + "," +
					((ClientePJ)cliente).getEndereco() + "," + ((ClientePJ)cliente).getEmail() + "," +
					formatadata.format(((ClientePJ)cliente).getDataFundacao())
					+ "," + ((ClientePJ)cliente).getListaFrota().get(0).getCode() + "\n";	
			//CNPJ_CLIENTE,NOME_CLIENTE,TELEFONE,ENDERECO,EMAIL_CLIENTE,DATA_FUND,CODE_FROTA
		}
		stringClientePJ = "CNPJ_CLIENTE,NOME_CLIENTE,TELEFONE,ENDERECO,EMAIL_CLIENTE,DATA_FUND,CODE_FROTA\n" + stringClientePJ;
		System.out.println("");
		return stringClientePJ;
	}
	
	

	@Override
	public String toString() {
		return "Seguradora [cnpj=" + cnpj + ", nome=" + nome + ", telefone=" + telefone + ", endereco=" + endereco
				+ ", email=" + email + ", listaClientes=" + this.getListaClientes().stream().map(Cliente::getNome).collect(Collectors.toList())
				+ ", listaSeguros=" + this.getListaSeguro().stream().map(Seguro::getId).collect(Collectors.toList())  //+ this.getListaSeguro() + "]"
				;
	}

}

package classes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ArquivoClientePF implements I_Arquivo{

	@Override
	public boolean gravarArquivo(String string) {
		// TODO Auto-generated method stub
		try {
			PrintWriter out = new PrintWriter("clientesPF_save.csv");
			out.println(string);
			out.close();
			
			return true;
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public String lerArquivo() {
		// TODO Auto-generated method stub
        String csvFile = "clientesPF.csv";
        String line;
        String dados = "";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                dados = dados + line + ";";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //System.out.println(dados);
		return dados;
		
	}

}

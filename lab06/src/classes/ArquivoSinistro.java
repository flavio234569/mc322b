package classes;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ArquivoSinistro implements I_Arquivo{

	@Override
	public boolean gravarArquivo(String string) {
		// TODO Auto-generated method stub
		try {
			PrintWriter out = new PrintWriter("sinistro_save.csv");
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
		return null;
	}

}

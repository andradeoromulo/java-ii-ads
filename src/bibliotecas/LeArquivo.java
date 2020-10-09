package bibliotecas;

import java.io.*;

public class LeArquivo {
	public static void main(String[] args) {
		
		try {
			
			InputStream is = new FileInputStream("teste.txt"); // Agora estamos lendo de outra entrada
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			String s;
			s = br.readLine();
			
			while(s != null) {
				System.out.println(s);
				s = br.readLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		
	}
}

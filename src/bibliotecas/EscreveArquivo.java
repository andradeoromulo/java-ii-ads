package bibliotecas;

import java.io.*;

public class EscreveArquivo {
	public static void main(String[] args) {
		
		try {
			
			OutputStream os = new FileOutputStream("escrita.txt");
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			
			bw.write("Testeando 123");
			bw.close();
			
			System.out.println("Escrita realizada com sucesso!");
			
		} catch(FileNotFoundException e) {
			e.printStackTrace(); 	
		} catch(IOException e) {
			e.printStackTrace();
		}
	
	}
}

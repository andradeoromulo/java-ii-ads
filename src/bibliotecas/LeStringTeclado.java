package bibliotecas;

import java.io.*;

public class LeStringTeclado {
	public static void main(String[] args) {
		
		System.out.println("Digite uma frase: ");
		
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);// BufferedReader sabe receber vários caracteres e armazená-los num buffer como uma String
		
		String s = "default";
		
		try {
			s = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Você digitou: " + s);
		
	}
}

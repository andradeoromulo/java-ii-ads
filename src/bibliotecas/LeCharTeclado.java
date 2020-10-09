package bibliotecas;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeCharTeclado {

	public static void main(String[] args) {
		
		System.out.println("Digite uma tecla: ");
		
		InputStream is = System.in; //InputStream � a classe que sabe capturar um byte. System.in � a entrada que estamos fornecendo. 
		InputStreamReader isr = new InputStreamReader(is); //InputStreamReader sabe receber um byte e transform�-lo em char.
		
		char c = 'a';
		
		try {
			c = (char) isr.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Voc� digitou: " + c);
	}

}

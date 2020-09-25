package excecoes;

import java.io.FileNotFoundException;

public class TesteCheckedException {
	public static void main(String[] args) {
		try {
			new java.io.FileReader("arquivoTeste.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		/*
		 * Poderia pegar como uma exception gen�rica, mas n�o 
		 * � uma boa pr�tica.
		try {
			new java.io.FileReader("arquivoTeste.txt");
		} catch (Exception e) { => m� pratica
			e.printStackTrace();
		}
		*/
	}
}
 
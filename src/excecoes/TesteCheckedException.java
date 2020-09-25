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
		 * Poderia pegar como uma exception genérica, mas não 
		 * é uma boa prática.
		try {
			new java.io.FileReader("arquivoTeste.txt");
		} catch (Exception e) { => má pratica
			e.printStackTrace();
		}
		*/
	}
}
 
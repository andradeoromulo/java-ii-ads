package bibliotecas;

public class TestaEquals {
	public static void main(String[] args) {
		String c = new String("String 456");
		String d = new String("String 456");
		
		if (c == d)
			System.out.println("c e d s�o iguais");
		else
			System.out.println("c e d s�o diferentes");
		
		// toString() e equals() s�o os objetos mais importantes de Object
		if (c.equals(d))
			System.out.println("c e d s�o iguais");
		else
			System.out.println("c e d s�o diferentes");
		
	}
}

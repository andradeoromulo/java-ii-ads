package bibliotecas;

public class TestaString {
	public static void main(String[] args) {
		
		/*
		 * String a = "Senac 123";
		 * String b = "Senac 123";
		 * int i = 0;
		 * int j = 0;
		 * String c = new String("String 456");
		 * String d = new String("String 456");
		 * 
		 * if (i == j)
		 * 	System.out.println("i e j são iguais");
		 * else
		 * 	System.out.println("i e j são diferentes");
		 * 
		 * if (a == b)
		 * 	System.out.println("a e b são iguais");
		 * else
		 * 	System.out.println("a e b são diferentes");
		 * 
		 * if (c == d)
		 * 	System.out.println("c e d são iguais");
		 * else
		 * 	System.out.println("c e d são diferentes");
		 * 
		 */
		
		String a = "Aprendendo Java sexta-feira";
		String b[] = a.split(" ");
		
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		// System.out.println(b[3]); OutOfBounds
		
		String c = "aprendendo java sexta-feira";
		int i = a.compareTo(a);
		System.out.println(i);
		int j = a.compareTo(c);
		System.out.println(j);
		int k = a.compareToIgnoreCase(c);
		System.out.println(k);
		
		a.toLowerCase();
		System.out.println(a);
		String d = a.toLowerCase();
		System.out.println(d);
		String e = a.toUpperCase();
		System.out.println(e);
		
		/*
		 * Com a variável "a" e o auxílio de outras variáveis,
		 * crie exemplos para demonstrar a funcionalidade
		 * dos seguintes métodos de String (podem ou não ter params):
		 * charAt(); length(); substring(); indexOf(); lastIndexOf();
		 * isEmpty(); contains(); replace().
		 * 
		 * Respostas na classe TarefaString
		 */
		
	}
}

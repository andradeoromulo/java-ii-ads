package bibliotecas;

public class TarefaString {
	public static void main(String[] args) {
		
		/*
		 * Com a vari�vel "a" e o aux�lio de outras vari�veis,
		 * crie exemplos para demonstrar a funcionalidade
		 * dos seguintes m�todos de String (podem ou n�o ter params):
		 * charAt(); length(); substring(); indexOf(); lastIndexOf();
		 * isEmpty(); contains(); replace().
		 */
		
		String palavra = "Trovoa";
		String frase = "Sob o meu peito eu te trovo e me ajoelho";
		
		// charAt(int): char -> retorna o caractere correspondente ao index passado por par�metro.
		// caso seja passado um index inexistente, lan�a IndexOutOfBoundsException
		
		System.out.println(palavra.charAt(0));
		System.out.println(frase.charAt(0));
		
		// length(): int -> retorna o tamanho da string 
		
		System.out.println(palavra.length());
		System.out.println(frase.length());
		
		// substring(int(, int)): String -> retorna uma parte da string original, come�ando
		// o recorte pelo primeiro numero e indo at� o fim ou at� o segundo numero - 1, caso passado
		
		System.out.println(palavra.substring(3));
		System.out.println(frase.substring(7, 9));
		
		// indexOf(): int -> procura o indice da primeira ocorr�ncia de um caractere ou substring,
		// aceitando tamb�m o �ndice inicial (opcional) de onde a busca deve come�ar
		
		System.out.println(palavra.indexOf("o"));
		System.out.println(palavra.indexOf("o", 3));
		System.out.println(frase.indexOf("me"));
		System.out.println(frase.indexOf("me", 8));
		
		// lastIndexOf(): int -> procura o indice da �ltima ocorr�ncia de um caractere ou substring,
		// aceitando tamb�m o �ndice (de tr�s pra frente) de onde a busca deve come�ar
		
		System.out.println(palavra.lastIndexOf("o"));
		System.out.println(palavra.lastIndexOf("o", 3));
		System.out.println(frase.lastIndexOf("me"));
		System.out.println(frase.lastIndexOf("me", 29));
		
		// isEmpty(): boolean -> retorna se uma string est� vazia (true) ou n�o (false)
		
		String nada = "";
		
		System.out.println(nada.isEmpty());
		System.out.println(palavra.isEmpty());
		
		// contains(): boolean -> retorna se uma string contem o caractere (ou sequ�ncia) ou n�o
		
		System.out.println(palavra.contains("T"));
		System.out.println(palavra.contains("Ch"));
		
		// replace(string, string): string -> retorna nova string com substitui��o de uma determinada 
		// sequ�ncia de caracteres por outra sequ�ncia 
		
		System.out.println(palavra.replace("a", "o"));
		System.out.println(frase.replace("p", "l"));
		
	}
}

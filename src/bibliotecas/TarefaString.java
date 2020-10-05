package bibliotecas;

public class TarefaString {
	public static void main(String[] args) {
		
		/*
		 * Com a variável "a" e o auxílio de outras variáveis,
		 * crie exemplos para demonstrar a funcionalidade
		 * dos seguintes métodos de String (podem ou não ter params):
		 * charAt(); length(); substring(); indexOf(); lastIndexOf();
		 * isEmpty(); contains(); replace().
		 */
		
		String palavra = "Trovoa";
		String frase = "Sob o meu peito eu te trovo e me ajoelho";
		
		// charAt(int): char -> retorna o caractere correspondente ao index passado por parâmetro.
		// caso seja passado um index inexistente, lança IndexOutOfBoundsException
		
		System.out.println(palavra.charAt(0));
		System.out.println(frase.charAt(0));
		
		// length(): int -> retorna o tamanho da string 
		
		System.out.println(palavra.length());
		System.out.println(frase.length());
		
		// substring(int(, int)): String -> retorna uma parte da string original, começando
		// o recorte pelo primeiro numero e indo até o fim ou até o segundo numero - 1, caso passado
		
		System.out.println(palavra.substring(3));
		System.out.println(frase.substring(7, 9));
		
		// indexOf(): int -> procura o indice da primeira ocorrência de um caractere ou substring,
		// aceitando também o índice inicial (opcional) de onde a busca deve começar
		
		System.out.println(palavra.indexOf("o"));
		System.out.println(palavra.indexOf("o", 3));
		System.out.println(frase.indexOf("me"));
		System.out.println(frase.indexOf("me", 8));
		
		// lastIndexOf(): int -> procura o indice da última ocorrência de um caractere ou substring,
		// aceitando também o índice (de trás pra frente) de onde a busca deve começar
		
		System.out.println(palavra.lastIndexOf("o"));
		System.out.println(palavra.lastIndexOf("o", 3));
		System.out.println(frase.lastIndexOf("me"));
		System.out.println(frase.lastIndexOf("me", 29));
		
		// isEmpty(): boolean -> retorna se uma string está vazia (true) ou não (false)
		
		String nada = "";
		
		System.out.println(nada.isEmpty());
		System.out.println(palavra.isEmpty());
		
		// contains(): boolean -> retorna se uma string contem o caractere (ou sequência) ou não
		
		System.out.println(palavra.contains("T"));
		System.out.println(palavra.contains("Ch"));
		
		// replace(string, string): string -> retorna nova string com substituição de uma determinada 
		// sequência de caracteres por outra sequência 
		
		System.out.println(palavra.replace("a", "o"));
		System.out.println(frase.replace("p", "l"));
		
	}
}

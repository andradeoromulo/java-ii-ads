package bibliotecas;

public class TarefaMath {

	public static void main(String[] args) {
		
		/*
		 * Implementar testes para os seguintes m�todos de Math,
		 * usando e comentando sobre o funcionamento:
		 * random, max, min, ceil, floor, exp, log, pow, sqrt, sin, toDegrees, toRadians
		 */
		
		/*
		 *  Math.random() => retorna um n�mero double (pseudo)aleat�rio entre 0.0 e 1.0 (n�o incluso)...
		 *  Para obter um range espec�fico, podemos multiplicar essa sa�da pelo maior n�mero 
		 *  (n�o incluso) que desejamos:
		 *  Por exemplo, para n�meros entre 0 e 100, basta multiplicar a sa�da do random() por 101
		 */
		
		double a;
		int b;
		
		a = Math.random();
		b = (int) (Math.random() * 101);
		
		System.out.println("N�mero aleat�rio entre 0.0 e 1.0: " + a);
		System.out.println("N�mero aleat�rio entre 0 e 100: " + b);
		
		/*
		 * Math.max() => retorna o maior de dois n�meros passados
		 * Math.min() => retorna o menor de dois n�meros passados
		 * Em ambos os casos, s�o aceitos n�meros dos tipos int, double, float e long
		 */
		
		double c = 3.54;
		double d = 3.58;
		
		System.out.println("Maior n�mero: " + Math.max(c, d));
		System.out.println("Menor n�mero: " + Math.min(c, d));
		
		/*
		 * Math.floor() => retorna o maior inteiro que seja menor ou igual ao double passado
		 * Math.ceil() => retorna o menor inteiro que seja maior ou igual ao double passado 
		 */
		
		double e = 7.89;
		double f;
		double g;
		
		f = Math.floor(e);
		g = Math.ceil(e);
		
		System.out.println("Floor: " + f);
		System.out.println("Ceil: " + g);
		
		/*
		 * Math.exp() => retorna a Constante de Euler elevada � pot�ncia do double passado
		 */
		
		double h = 3.0;
		double i;
		
		i = Math.exp(h);
		
		System.out.println("Constante de Euler elevada a " + h + ": " + i);
		
		/*
		 * Math.log() => retorna o logaritmo natural (base e = 2,718) do double passado
		 */
		
		double j = 10;
		double k;
		
		k = Math.log(j);
		
		System.out.println("Logaritmo natural do n�mero " + j + ": " + k);
		
		/*
		 * Math.pow() => retorna o valor do primeiro double elevado pelo segundo double
		 * Math.sqrt() => retorna a raiz quadrada de um double passado
		 */
		
		double l = 16;
		double m;
		double n;
		
		m = Math.pow(l, 2);
		n = Math.sqrt(l);
		
		System.out.println(l + " elevado a pot�ncia de 2: " + m);
		System.out.println("Raiz quadrada de " + l + ": " + n);
		
		/*
		 * Math.sin() => retorna o seno de um �ngulo passado em radianos entre 0 e pi 
		 * Math.toDegrees() => retorna a convers�o (aproximada) de um �ngulo medido em radianos para graus
		 * Math.toRadians() => retorna a convers�o (aproximada) de um �ngulo medido em graus para radianos	
		 */
		
		double o = 90;
		double p;
		double q;
		double r;
		
		p = Math.toRadians(o);
		q = Math.toDegrees(p);
		r = Math.sin(p);
		
		System.out.println("�ngulo de " + o + " graus convertido em radianos: " + p);
		System.out.println("�ngulo de " + p + " radianos convertido em graus: " + q);
		System.out.println("Seno do �ngulo de " + p + " radianos: " + r);
	}

}

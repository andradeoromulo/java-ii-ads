package bibliotecas;

public class TarefaMath {

	public static void main(String[] args) {
		
		/*
		 * Implementar testes para os seguintes métodos de Math,
		 * usando e comentando sobre o funcionamento:
		 * random, max, min, ceil, floor, exp, log, pow, sqrt, sin, toDegrees, toRadians
		 */
		
		/*
		 *  Math.random() => retorna um número double (pseudo)aleatório entre 0.0 e 1.0 (não incluso)...
		 *  Para obter um range específico, podemos multiplicar essa saída pelo maior número 
		 *  (não incluso) que desejamos:
		 *  Por exemplo, para números entre 0 e 100, basta multiplicar a saída do random() por 101
		 */
		
		double a;
		int b;
		
		a = Math.random();
		b = (int) (Math.random() * 101);
		
		System.out.println("Número aleatório entre 0.0 e 1.0: " + a);
		System.out.println("Número aleatório entre 0 e 100: " + b);
		
		/*
		 * Math.max() => retorna o maior de dois números passados
		 * Math.min() => retorna o menor de dois números passados
		 * Em ambos os casos, são aceitos números dos tipos int, double, float e long
		 */
		
		double c = 3.54;
		double d = 3.58;
		
		System.out.println("Maior número: " + Math.max(c, d));
		System.out.println("Menor número: " + Math.min(c, d));
		
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
		 * Math.exp() => retorna a Constante de Euler elevada à potência do double passado
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
		
		System.out.println("Logaritmo natural do número " + j + ": " + k);
		
		/*
		 * Math.pow() => retorna o valor do primeiro double elevado pelo segundo double
		 * Math.sqrt() => retorna a raiz quadrada de um double passado
		 */
		
		double l = 16;
		double m;
		double n;
		
		m = Math.pow(l, 2);
		n = Math.sqrt(l);
		
		System.out.println(l + " elevado a potência de 2: " + m);
		System.out.println("Raiz quadrada de " + l + ": " + n);
		
		/*
		 * Math.sin() => retorna o seno de um ângulo passado em radianos entre 0 e pi 
		 * Math.toDegrees() => retorna a conversão (aproximada) de um ângulo medido em radianos para graus
		 * Math.toRadians() => retorna a conversão (aproximada) de um ângulo medido em graus para radianos	
		 */
		
		double o = 90;
		double p;
		double q;
		double r;
		
		p = Math.toRadians(o);
		q = Math.toDegrees(p);
		r = Math.sin(p);
		
		System.out.println("Ângulo de " + o + " graus convertido em radianos: " + p);
		System.out.println("Ângulo de " + p + " radianos convertido em graus: " + q);
		System.out.println("Seno do ângulo de " + p + " radianos: " + r);
	}

}

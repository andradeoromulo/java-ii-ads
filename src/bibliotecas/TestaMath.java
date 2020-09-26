package bibliotecas;

public class TestaMath {
	public static void main(String[] args) {
		
		// número absoluto
		int i = -10;
		System.out.println(i);
		
		int j = Math.abs(i);
		System.out.println(j);
		
		// arredondar um número (floor, round, ceil)
		double d1 = 4.55;
		System.out.println(d1);
		
		double d2 = Math.floor(d1);
		double d3 = Math.round(d1);
		double d4 = Math.ceil(d1);
		
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		
	}
}

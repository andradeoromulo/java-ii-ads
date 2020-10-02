package bibliotecas;

public class TesteIntToString {

	public static void main(String[] args) {
		int i = 1;
		String s1 = " "+i;
		
		System.out.println(s1);	
		
		String s2 = "11";
		// int j = i + s2;
		// vamos usar um wrapper
		int k = Integer.parseInt(s2);
		int j = k + i;
		
		System.out.println(j);
		
		/*
		 * Classes Wrapper:
		 * boolean -> Boolean
		 * char -> Character
		 * byte -> Byte
		 * short -> Short
		 * int -> Integer
		 * long -> Long
		 * float -> Float
		 * double -> Double
		 */
	}

}

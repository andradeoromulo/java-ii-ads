package bibliotecas;

public class TesteClienteToString {

	public static void main(String[] args) {
		Cliente1 c1 = new Cliente1();
		
		Cliente2 c2 = new Cliente2("Fulano");
		Cliente2 c3 = new Cliente2(); 
		
		System.out.println(c1); // vai imprimir o hash do OID j� que o m�todo toString() n�o foi sobrescrito
		System.out.println(c2);
		System.out.println(c3);

	}

}

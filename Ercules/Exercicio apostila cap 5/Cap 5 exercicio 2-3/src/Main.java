
public class Main {

	public static void main(String[] args) {
		
		ContaBanco c1 = new ContaBanco("Ercules", 12321, "Banco do Brasil", 10, 12, 2013);
		
		c1.depositar(1500.51);
		c1.depositar(100.07);
		c1.sacar(70.0);
		System.out.println(c1.recuperarDados());
		
	}
}

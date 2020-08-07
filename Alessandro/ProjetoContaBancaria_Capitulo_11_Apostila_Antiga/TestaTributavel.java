
public class TestaTributavel {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(); // Exercício - 2. Ocorreu uma "Exception in thread "main".
		
		try {
			cc.saca(100);
			} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			}
		
		ContaPoupanca cp = new ContaPoupanca();
			
		try {
			cp.deposita(-1000); // Exercício - 4.
			} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
			}
		
		
	}

}

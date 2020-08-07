// Exercício - 2.


public class TestaTributavel {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		Tributavel t = cc;
		System.out.println(t.calculaTributos());
		System.out.println(t.getSaldo()); 
		
		/*
		 * Exercício - 2. Tente, agora, chamar o método getSaldo através da referência t, 
		 * o que ocorre?
		 * Ocorre um erro.
		 * Por quê?
		 * Porque o método getSaldo não foi definido na classe Tributavel. 
		 */
		
		
		System.out.println(t.getSaldo());
	}

}

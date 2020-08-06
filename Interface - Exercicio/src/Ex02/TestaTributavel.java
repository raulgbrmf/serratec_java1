
public class TestaTributavel {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		Tributavel getSaldo = cc;
		System.out.println(getSaldo.calculaTributos());

	}

}

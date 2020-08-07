
public class Main {
	public static void main(String[] args) {

		Conta c = new Conta();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		AtualizadorDeContas at = new AtualizadorDeContas(0);

		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);

		at.roda(c);
		at.roda(cc);
		at.roda(cp);

		c.atualiza(0.01);
		cc.atualiza(0.01);
		cp.atualiza(0.01);

		System.out.println(c.getSaldo());
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());

		System.out.println();
	}

}

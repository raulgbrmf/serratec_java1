// Exercício -4.

public class Main {

	public static void main(String[] args) {

		/*
		 * Exercício - 5. Compila? Sim. Roda? Sim. O que muda? Aparentemente, nada. Qual
		 * é a utilidade disso? Em princípio, escrever menos.
		 */

		Conta conta = new Conta();
		Conta cc = new Conta();
		Conta cp = new Conta();

		conta.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);

		// Exercício - 7.

		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
		adc.roda(conta);
		adc.roda(cc);
		adc.roda(cp);
		System.out.println("Saldo total: " + adc.getSaldoTotal());

		// conta.atualiza(0.01);
		// cc.atualiza(0.01);
		// cp.atualiza(0.01);

		// System.out.println(conta.getSaldo());
		// System.out.println(cc.getSaldo());
		// System.out.println(cp.getSaldo());

		/*
		 * System.out.println(cc.saldo); cc.deposita(150); System.out.println(cc.saldo);
		 * cc.deposita(100); System.out.println(cc.saldo); cc.saca(30);
		 * System.out.println(cc.saldo);
		 */

		// System.out.println(conta.getSaldo());
	}
}
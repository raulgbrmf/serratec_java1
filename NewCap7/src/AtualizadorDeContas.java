
public class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;

	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	void roda(Conta c) {
		System.out.println("O saldo anterior da conta é: " + c.getSaldo());
		c.atualiza(this.selic);
		System.out.println("Saldo total é: " + c.getSaldo());
		saldoTotal += c.getSaldo();
	}

	public double getSaldoTotal() {
		return saldoTotal;
	}

}

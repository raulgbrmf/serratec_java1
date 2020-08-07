// Exercício - 6.

public class AtualizadorDeContas {

	private double saldoTotal = 0;
	private double selic;
	
	AtualizadorDeContas(double selic){
		this.selic = selic;
	}
	
	public double getSaldoTotal() {
		return this.saldoTotal;
	}
	
	public void roda(Conta conta) {
		System.out.println("Saldo anterior: " + conta.getSaldo());
		conta.atualiza(this.selic);
		System.out.println("Saldo final: " + conta.getSaldo());
		saldoTotal = saldoTotal + conta.getSaldo();
		

	}
}
	
	
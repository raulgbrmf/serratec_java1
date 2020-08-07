// Exercício - 1. A, B e C.

public class Conta {
	
	protected double saldo;
	
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

	public void saca(double valor) {
		this.saldo = this.saldo - valor;
	}

	public double getSaldo() {
		return this.saldo ;
	}
	
	// Exercício - 2.
	
	public void atualiza(double valor) {
		this.saldo += this.saldo * valor;
	}
	
	
		
}

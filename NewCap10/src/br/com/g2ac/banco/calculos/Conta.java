package br.com.g2ac.banco.calculos;

public abstract class Conta {
	int numero;
	protected double saldo;
	double limite;

	public abstract void atualiza(double taxa);

	public double getSaldo() {
		return this.saldo;
	}

	boolean saca(double valor) {
		if (this.saldo < valor) {
			return false;
		} else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}

	void deposita(double quantidade) {
		this.saldo += quantidade;
	}

	boolean transfere(Conta destino, double valor) {
		boolean retirou = this.saca(valor);
		if (retirou == false) {
			return false;
		} else {
			destino.deposita(valor);
			return true;
		}
	}

}

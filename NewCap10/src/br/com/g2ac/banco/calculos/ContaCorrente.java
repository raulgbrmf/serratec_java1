package br.com.g2ac.banco.calculos;

public class ContaCorrente extends Conta implements Tributavel {

	public double calculaTributos() {
		return this.saldo * 0.01;
	}

	public void deposita(double quantidade) {
		this.saldo += quantidade - 0.10;
	}

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}
}

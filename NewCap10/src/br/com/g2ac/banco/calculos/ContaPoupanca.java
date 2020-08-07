package br.com.g2ac.banco.calculos;

public class ContaPoupanca extends Conta {

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;

	}
}

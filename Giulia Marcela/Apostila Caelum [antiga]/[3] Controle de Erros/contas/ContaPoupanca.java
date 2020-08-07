package br.com.g2ac.contas.modelo;

public class ContaPoupanca extends Conta {

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;

	}

	/*
	 * public void atualiza(double taxa) { super.atualiza(taxa * 3); }
	 */
}

package br.com.g2ac.contas.modelo;

import br.com.g2ac.interfaces.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {

	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}
	/*
	 * @Override public void atualiza(double taxa) { super.atualiza(taxa * 2); }
	 */

	public void deposita(double valor) {
		super.deposita(valor - 0.10);
	}

	public double calculaTributos() {
		return this.saldo * 0.01;
	}
}

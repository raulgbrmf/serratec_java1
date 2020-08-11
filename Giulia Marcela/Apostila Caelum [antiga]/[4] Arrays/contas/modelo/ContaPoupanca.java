package br.com.g2ac.contas.modelo;

public class ContaPoupanca extends Conta {

	public String getTipo() {
		return "Conta Poupanca";
	}

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;

	}
}

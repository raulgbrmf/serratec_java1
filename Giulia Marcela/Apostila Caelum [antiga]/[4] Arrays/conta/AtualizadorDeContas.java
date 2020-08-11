package br.com.g2ac.conta;

import br.com.g2ac.contas.modelo.Conta;

public class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;

	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	public double getSaldoTotal() {
		return this.saldoTotal;
	}

	public void roda(Conta conta) {
		System.out.println("Saldo Anterior: " + conta.getSaldo());
		conta.atualiza(this.selic);
		System.out.println("Saldo Final: " + conta.getSaldo());
		saldoTotal += conta.getSaldo();
	}
}

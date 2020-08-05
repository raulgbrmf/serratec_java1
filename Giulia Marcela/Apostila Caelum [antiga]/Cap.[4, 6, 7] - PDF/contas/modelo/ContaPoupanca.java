package br.com.g2ac.contas.modelo;

public class ContaPoupanca extends Conta {
	
	public void atualiza(double taxa) {
		super.atualiza(taxa * 3);
	}
}

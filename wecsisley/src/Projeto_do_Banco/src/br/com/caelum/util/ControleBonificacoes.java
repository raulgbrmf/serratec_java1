package br.com.caelum.util;

import br.com.caelum.contas.Funcionario;

public class ControleBonificacoes {
	private double totalDeBonificacoes = 0;

	public void registra(Funcionario funcionario) {
		this.totalDeBonificacoes += funcionario.getBonificacao();
	}

	public double getTotalDeBonificacoes() {
		return this.totalDeBonificacoes;
	}

	public void consultaTotalBonicacao() {
		System.out.printf("Total pago em bonificações: R$ %.2f%n", getTotalDeBonificacoes());
	}
}

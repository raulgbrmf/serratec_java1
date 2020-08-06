package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Funcionario;

public class ControleDeBonificacoes {

	private double totalDeBonificacoes = 0;

	public void registra(Funcionario funcionario) {
		this.totalDeBonificacoes += funcionario.getBonificacao();
	}

	public double getTotalDeBonificacoes() {

		return this.totalDeBonificacoes;

	}

}

package br.com.caelum.contas.main;

import br.com.caelum.contas.funcionario.Funcionario;

public class ControleDeBonificacao {
	
	private double totalDeBonificacoes = 0;

	public void registra(Funcionario f) {
		System.out.println("Adicionando	bonificação	do	funcionario:	" + f);
		this.totalDeBonificacoes += f.getBonificacao();
	}

	public double getTotalDeBonificacoes() {
		return this.totalDeBonificacoes;
	}
}

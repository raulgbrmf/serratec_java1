package br.com.g2ac.usuario;

public class ControleDeBonificacoes {
	private double totalDeBonificacoes = 0;

	public void registra(Funcionario funcionario) {
		System.out.println("Adicionando bonificacao do funcionario: " + funcionario);
		this.totalDeBonificacoes += funcionario.getBonificacao();
	}

	public double getTotalDeBonificacoes() {
		return this.totalDeBonificacoes;
	}
}

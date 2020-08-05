package br.com.caelum.usuario;

public class ControleDeBonificacoes {
	private double totalDeBonificacoes = 0;
	
	public void registra (Funcionario funcionario) {
		this.totalDeBonificacoes += funcionario.getBonificacao();
	}
	
	public double getTotalDeBonificacoes() {
		return this.totalDeBonificacoes;
	}
	
}

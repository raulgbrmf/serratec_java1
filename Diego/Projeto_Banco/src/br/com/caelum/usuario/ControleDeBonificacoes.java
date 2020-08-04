package br.com.caelum.usuario;

public class ControleDeBonificacoes {
	
	private double totalDeBonificacoes;

	public void registra(Funcionario funcionario) {
		 System.out.println("Adicionando bonificação do funcionario: " + funcionario.nome);
		this.totalDeBonificacoes += funcionario.getBonificacao();
	}

	public double getTotalDeBonificacoes() {
		return this.totalDeBonificacoes;
	}
}

package Projeto_Banco;

public class ControleBonificacoes {
	private double totalDeBonificacoes = 0;

	public void registra(Funcionario funcionario) {
		this.totalDeBonificacoes += funcionario.getBonificacao();
	}

	public double getTotalDeBonificacoes() {
		return this.totalDeBonificacoes;
	}

	void consultaTotalBonicacao() {
		System.out.printf("Total pago em bonificações: R$ %.2f%n", getTotalDeBonificacoes());
	}
}

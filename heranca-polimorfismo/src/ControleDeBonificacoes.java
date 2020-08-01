
public class ControleDeBonificacoes {
	private double totaDeBonificacoes = 0;

	public void registra(Funcionario funcionario) {
		this.totaDeBonificacoes += funcionario.getBonificacao();
	}

	public double getTotalDeBonificacoes() {
		return this.totaDeBonificacoes;
	}

}

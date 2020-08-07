/*
 * Exercício - 3. Ao passar o método "atualiza" da classe mãe para "abstract", a classe filha
 * apresentou um erro, no qual há a informação de que não é possível invocar
 * o método "abstract" diretamente do método "atualiza".
 */

public class ContaPoupanca extends Conta {

	public void atualiza(double taxa) { // Exercício - 4.
		this.saldo = this.saldo * (taxa * 3);
	}

}

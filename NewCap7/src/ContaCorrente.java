
public class ContaCorrente extends Conta {

	public void deposita(double quantidade) {
		this.saldo += quantidade - 0.10;
	}

	public void atualiza(double taxa) {
		super.atualiza(taxa * 2);
	}
}

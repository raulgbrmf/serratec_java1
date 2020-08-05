package modeloContas;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca() {
		super();
	}
	
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}
}

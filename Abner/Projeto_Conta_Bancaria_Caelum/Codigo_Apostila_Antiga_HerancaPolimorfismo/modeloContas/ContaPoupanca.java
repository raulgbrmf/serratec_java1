package modeloContas;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca() {
		super();
	}
	
	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}
}

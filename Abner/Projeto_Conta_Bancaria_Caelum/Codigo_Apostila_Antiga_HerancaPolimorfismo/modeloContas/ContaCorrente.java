package modeloContas;
import interfaces.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente() {
		super();
	}
	
	public double calculaTributos() {
		return this.saldo * 0.01;
	}

	@Override
	public void atualiza(double taxa) {		
		this.saldo += this.saldo * taxa * 2;
	}
	
	@Override
	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}
}

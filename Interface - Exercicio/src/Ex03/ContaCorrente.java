
public class ContaCorrente extends Conta implements Tributavel {

	protected double saldo;
	
	public double getSaldo() {
		return saldo;
	}

	public double calculaTributos() {
		return this.saldo * 0.01;
		}

	public void deposita(double valor) {
		double novoSaldo = this.saldo + valor;
		this.saldo = novoSaldo;
	}

}

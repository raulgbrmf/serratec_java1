
public class ContaCorrente {
	
	double saldo;

	public void deposita(double valor) {
		double NovoSaldo = this.saldo + valor;
		this.saldo = NovoSaldo;
		
	}

	public double getSaldo() {
		return saldo;
	}
}


public class Conta03 {

	private double saldo;	
	private String titular;
	

	Conta03(String titular) {
		this.titular = titular;

	}

	public double getSaldo() {
		return this.saldo;
		
	}

	public String getTitular() {
		return this.titular;
		
	}

	void deposita(double valor) {
		if (valor <= 0) {
			System.out.println("Não foi possível realizar o depósito! Verifique o valor depositado!");
		} else {
			double novoSaldo = this.saldo + valor;
			this.saldo = novoSaldo;

		}

	}

}

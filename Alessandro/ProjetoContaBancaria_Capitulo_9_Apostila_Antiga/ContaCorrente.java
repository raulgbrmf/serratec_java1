//Exercício - 3.

public class ContaCorrente extends Conta {

	public void atualiza(double taxa) { // Exercício - 5. Creio que não.
		 this.saldo = this.saldo * (taxa *2);
	}
	
	public void deposita(double valor) {
		this.saldo = valor - 0.10;
	}

}

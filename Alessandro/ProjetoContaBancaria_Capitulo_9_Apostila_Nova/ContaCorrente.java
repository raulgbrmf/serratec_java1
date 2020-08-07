//Exercício - 3.

public class ContaCorrente extends Conta {

	public void atualiza(double taxa) { // Exercício - 8.
		 super.atualiza(taxa *2);
	}
	
	public void deposita(double valor) {
		this.saldo = valor - 0.10;
	}

}

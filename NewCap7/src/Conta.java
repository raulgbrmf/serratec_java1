
public class Conta {

	protected double saldo;
	int numero;
	String nome;
	double limite;

	boolean saca(double valor) {
		if (this.saldo < valor) {
			return false;
		} else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}

	void deposita(double quantidade) {
		this.saldo += quantidade;
	}

	double getSaldo() {
		return this.saldo;
	}

	void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;
	}

	boolean transfere(Conta destino, double valor) {
		boolean retirou = this.saca(valor);
		if (retirou == false) {
			return false;
		} else {
			destino.deposita(valor);
			return true;
		}
	}
}

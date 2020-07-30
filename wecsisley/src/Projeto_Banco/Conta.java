package Projeto_Banco;

public class Conta {

	int numero;
	int agencia;
	String titular;
	String dataAbertura;
	double saldo;
	final double TAXA = 1.0025;

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

	boolean transferePara(Conta destino, double valor) {
		boolean retirou = saca(valor);
		if (retirou == false) {
			return false;
		} else {
			destino.deposita(valor);
			return true;
		}
	}

	boolean rendimentoMensal() {
		if (this.saldo > 0) {
			this.saldo = this.saldo * TAXA;
			return true;
		} else {
			return false;
		}
	}
}

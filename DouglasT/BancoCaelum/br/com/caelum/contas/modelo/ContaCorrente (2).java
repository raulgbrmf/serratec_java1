package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta {

	public String getTipo() {
		return super.getTipo()+" Corrente";
	}
	
	public boolean saca(double valorDigitado) {
		if (this.saldo >= valorDigitado) {
			this.saldo -= (valorDigitado + 0.10);
			return true;
		} else {
			return false;
		}

	}

}

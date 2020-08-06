package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel {

	public String getTipo() {
		return "Conta Corrente";
	}

	public void saca(double valor) {
		super.saca(valor + 0.10);
	}

	public double getValorImposto() {
		return this.saldo * 0.01;
	}
}

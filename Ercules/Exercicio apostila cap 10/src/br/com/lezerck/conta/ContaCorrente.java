package br.com.lezerck.conta;

public class ContaCorrente extends Conta {

	public String getTipo() {
		return "Conta Corrente";
	}

	public void saca(double valor) {
		super.saca(valor + 0.10);
	}
}

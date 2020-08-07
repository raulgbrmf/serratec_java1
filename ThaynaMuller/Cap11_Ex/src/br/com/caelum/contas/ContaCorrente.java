package br.com.caelum.contas;

import br.com.caelum.controle.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {

	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}

	public void atualiza(double taxa) {
		this.saldo += this.saldo * (2 * taxa);

	}

	public double calculaTributos() {
		return this.saldo * 0.01;
	}

}

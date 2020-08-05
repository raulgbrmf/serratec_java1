package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel{

	void atualiza(double taxaSelic) {
		super.atualiza(taxaSelic*2);
	}

	public double calculaTributos() {
		return this.saldo * 0.01;
	}
	
}

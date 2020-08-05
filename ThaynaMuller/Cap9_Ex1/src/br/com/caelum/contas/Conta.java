package br.com.caelum.contas;

public class Conta {

	protected double saldo;

	public double getSaldo() {
		return this.saldo;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}
	
	//Exercicio 2:
	public void atualiza(double taxa) {
		this.saldo += this.saldo*taxa;
	}

}

package br.com.caelum.contas.modelo;

abstract class Conta {
	protected double saldo;
	protected String agencia;
	protected int numero;
	protected String titular;
	protected final double taxaSelic=0.10;
	
	
	

	void deposita (double valor) {
		this.saldo += valor;
	}
	
	void saca (double valor) {
		this.saldo -= valor;
	}
	
	double getSaldo() {
		return this.saldo;
	}
	
		
	void atualiza (double taxaSelic) {
		this.saldo += this.saldo * taxaSelic;
	}
}


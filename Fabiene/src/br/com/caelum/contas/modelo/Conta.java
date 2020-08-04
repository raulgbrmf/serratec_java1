package br.com.caelum.contas.modelo;

public class Conta {
	protected double saldo;
	protected String agencia;
	protected int numero;
	protected String titular;
	protected final double taxa=0.10;
	
	
	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	void deposita (double valor) {
		this.saldo += valor;
	}
	
	void saca (double valor) {
		this.saldo -= valor;
	}
	
	double getSaldo() {
		return this.saldo;
	}
	
		
	void atualiza () {
		this.saldo += this.saldo * taxa;
		System.out.println(this.saldo);
	}
}


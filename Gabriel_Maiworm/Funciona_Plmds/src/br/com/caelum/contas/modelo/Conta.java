package br.com.caelum.contas.modelo;

import br.com.caelum.util.Data;

public class Conta {
	int numero;
	private String titular;
	protected double saldo;
	private String agencia;
	Data dataDeAbertura = new Data(3, 8, 2020);

	public String getTipo() {
		return "Conta";
	}

	public Conta() {
	}

	public Conta(String titular, String agencia, double saldo, int numero) {
		this.titular = titular;
		this.agencia = agencia;
		this.saldo = saldo;
		this.numero = numero;
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

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void saca(double quantidade) {
		if (this.saldo >= quantidade) {
			this.saldo = this.saldo - quantidade;
			System.out.println("Saque realizado.");
		} else {
			System.out.println("Saldo insuficiente para o saque desejado.");
		}
	}

	public void deposita(double quantidade) {
		this.saldo = this.saldo + quantidade;
	}

	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}

	public String toString() {
		return "Conta [numero= " + numero + ", titular= " + titular + ", saldo= " + saldo + "]";
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;

	}

}

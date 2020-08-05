package br.com.caelum.contas.modelo;

import br.com.caelum.contas.util.Data;

public class Conta {
	private String nome, agencia;
	private int conta;
	protected double saldo;
	Data dataAbertura;

	public Conta() {

	}

	public void setTitular(String nome) {
		this.nome = nome;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public void setNumero(int conta) {
		this.conta = conta;
	}

	public String getTitular() {
		return nome;
	}

	public String getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void getDataAbertura() {
		this.dataAbertura.getData();
	}

	public int getDiaAbertura() {
		return this.dataAbertura.getDia();
	}

	public int getMesAbertura() {
		return this.dataAbertura.getMes();
	}

	public int getAnoAbertura() {
		return this.dataAbertura.getAno();
	}

	public String getTipo() {
		return "Conta";
	}

	public void saca(double valor) {
		if (valor <= this.saldo && valor > 0) {
			this.saldo -= valor;
		} else {
			System.out.println("Você não pode fazer essa operação.");
		}
	}

	public void deposita(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		} else {
			System.out.println("Você não pode fazer essa operação.");
		}
	}

	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}
}

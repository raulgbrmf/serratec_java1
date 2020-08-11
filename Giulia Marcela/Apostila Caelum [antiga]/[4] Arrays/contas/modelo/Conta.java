package br.com.g2ac.contas.modelo;

import br.com.g2ac.usuario.Cliente;

public abstract class Conta {

	private int numero;
	private Cliente titular = new Cliente();
	protected double saldo;
	private String Agencia;
	private double limite;

	public Conta() {
	}

	public Conta(String nome) {
		this.getTitular().setNome(nome);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public boolean saque(double valor) {
		if (saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			System.out.println("Saque indisponível.");
			return false;
		}
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	boolean transferencia(Conta destino, double valor) {
		boolean retirou = this.saque(valor);
		if (retirou == false) {
			return false;
		} else {
			destino.deposita(valor);
			return true;
		}
	}

	public abstract void atualiza(double taxa);

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return Agencia;
	}

	public void setAgencia(String agencia) {
		this.Agencia = agencia;
	}

	protected abstract String getTipo();

}

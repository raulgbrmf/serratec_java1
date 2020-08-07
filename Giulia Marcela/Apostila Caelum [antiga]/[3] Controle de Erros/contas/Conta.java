package br.com.g2ac.contas.modelo;

import br.com.g2ac.usuario.Cliente;
import br.com.g2ac.usuario.main.ValorInvalidoException;

public abstract class Conta {

	// private int numero;
	private Cliente titular = new Cliente();
	protected double saldo;
	private double limite;

	public Conta() {
	}

	public Conta(String nome) {
		this.getTitular().setNome(nome);
	}

	public double getSaldo() {
		return this.saldo;
	}
	//Modificado no Exercício 2
	public void saque(double valor) {
		if (this.saldo < valor) {
			throw new IllegalArgumentException("Saldo insuficiente");
		} else {
			this.saldo -= valor;
		}
	}
	//Modificado no Exercício 3, 4 e 6
	public void deposita(double valor) throws ValorInvalidoException {
		if (valor < 0) {
			throw new ValorInvalidoException(valor);//Modificado no Exercício 6
		} else {
			this.saldo += valor * 0.9962;
		}
	}

	/*
	 * boolean transferencia(Conta destino, double valor) { boolean retirou =
	 * this.saque(valor); if (retirou == false) { return false; } else {
	 * destino.deposita(valor); return true; } }
	 */

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

}

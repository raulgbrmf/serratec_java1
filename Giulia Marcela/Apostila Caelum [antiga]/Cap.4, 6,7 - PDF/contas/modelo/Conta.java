package br.com.g2ac.contas.modelo;

public class Conta {
	public int numero;
	public Cliente titular = new Cliente();
	protected double saldo;
	public double limite;

	public Conta() {

	}

	public Conta(String nome) {
		this.titular.nome = nome;
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

	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
}

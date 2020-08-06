package br.com.caelum.contas.modelo;

public class ContaPoupanca implements Conta {

	private String nome, agencia;
	private int conta;
	private double saldo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public String getTipo() {
		return "Conta Poupança";
	}

	public void saca(double valor) {
		if (valor <= saldo && valor > 0) {
			saldo -= valor;
		} else {
			System.out.println("Você não pode fazer essa operação.");
		}
	}

	public void deposita(double valor) {
		if (valor > 0) {
			saldo += valor;
		} else {
			System.out.println("Você não pode fazer essa operação.");
		}
	}

	public void atualiza(double taxaSelic) {
		// Devo ter pulado esse metodo e nem reparei ;-;
	}
}

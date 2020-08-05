package br.com.caelum.contas.modelo;

import br.com.caelum.util.Data;

public class Conta {
	int numero;
	private String titular;
	//private double saldo;     *questao 7
	protected double saldo;		//*questao7
	private String agencia;
	private static int totaldecontas;
	Data dataDeAbertura = new Data(3,8,2020);
	
	public Conta(){
	}
	
	public Conta(String titular, String agencia, double saldo, int numero){
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
			System.out.println("saque realizado");
		} else {
			System.out.println("O saldo insuficiente para o saque desejado");
		}
	}

	public void deposita(double quantidade) {
		this.saldo = this.saldo + quantidade;
	}
	
	void transfere(Conta destino, double valor) {
		if (this.saldo >= valor) {
			
			this.saca(valor);
			destino.deposita(valor); 
			
			System.out.println("O valor tranferido da conta de " + this.titular + " foi de " + valor);
			System.out.println("O saldo de " + destino.titular + " Ã© agora de: " + destino.saldo);
		} else {
			System.out.println("Não há saldo o suficiente para transferir este valor");
		}
	}
	
	public String toString() {
		return "Conta [numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + "]";
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public String getTipo() {
		return "Conta";
	}
	public void transfere(double valor,Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}
}

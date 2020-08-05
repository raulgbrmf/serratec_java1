package br.com.caelum.contas.modelo;

import br.com.caelum.util.Data;

public class Conta {
	int numero;
	private String titular;
	protected double saldo;
	private String agencia;
	//private static int totaldecontas;
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
			System.out.println("Saque realizado com sucesso.");
		} else {
			System.out.println("Saldo insuficiente.");
		}
	}

	public void deposita(double quantidade) {   
		this.saldo = this.saldo + quantidade;
		System.out.println("Operacao realizada com sucesso.");
	}
	
	void transfere(Conta destino, double valor) {  
		if (this.saldo >= valor) {
			
			this.saca(valor);
			destino.deposita(valor); 
			
			System.out.println("O valor tranferido da conta de " + this.titular + " foi de " + valor);
			System.out.println("O saldo de " + destino.titular + " é agora de: " + destino.saldo);
		} else {
			System.out.println("Saldo insuficiente para transferencia.");
		}
	}
	
	public String toString() {
		return "Conta [numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + "]";
	}


	public void setSaldo(int saldo) {
		this.saldo = saldo;
		
	}
	
	public String getTipo() {   // numero 6 - pag 146 - cap 9
		return "Conta";   
	}
	
	public void transfere(double valor, Conta conta) {
		
		this.saca(valor);
		conta.deposita(valor);
		
	}
}

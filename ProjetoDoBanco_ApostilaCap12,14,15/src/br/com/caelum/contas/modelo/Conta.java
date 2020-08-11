package br.com.caelum.contas.modelo;

import br.com.caelum.util.Data;

public abstract class Conta implements Comparable<Conta> {	//Não basta ter o método sem assinar o contrato da interface. Dá erro de compilação.
	
	int numero;
	private String titular;    
	protected double saldo;		
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

	public void saca(double quantidade) {	//a operacao saca teve que ser tratada no manipulador de contas
		if (this.saldo >= quantidade) {
			this.saldo = this.saldo - quantidade;
			System.out.println("saque realizado");
		} else {
			System.out.println("O saldo insuficiente para o saque desejado");
		}
	}

	public void deposita(double valorDigitado) throws IllegalArgumentException {	//tratamento do deposita
		//this.saldo = this.saldo + quantidade;
		
		//Cap12.11.1
		if (valorDigitado < 0) {
			//throw new IllegalArgumentException();		//	Cap12.11.3
			throw new IllegalArgumentException("O valor depositado não pode ser negativo");  //	Cap12.11.3 A mensagem "Você tentou depositar um valor negativo." aparece na tela
		} else {
			this.saldo += valorDigitado;
		}		//Cap12.11.2   DEU PAU!
	}
	
	

	void transfere(Conta destino, double valor) throws IllegalArgumentException {
		if (this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor); 
			
			System.out.println("O valor tranferido da conta de " + this.titular + " foi de " + valor);
			System.out.println("O saldo de " + destino.titular + " agora é de: " + destino.saldo);
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
	
	// TIPO
	public abstract String getTipo();		//Cap10.6.3)O problema: A ContaPoupança pede para torna-la uma classe abstrata.
	
	public void transfere(double valor,Conta conta) throws IllegalArgumentException {
		this.saca(valor);
		conta.deposita(valor);
	}
	
	public int compareTo(Conta outraConta) {		//cap15.6-1
		return this.titular.compareTo(outraConta.titular);
	}
	
	

}

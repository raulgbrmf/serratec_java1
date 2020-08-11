package br.com.caelum.contas.modelo;

public abstract class Conta {
		
	public String agencia;
	public int numero;
	public String titular;
	public String tipo;
	protected double saldo;
	
	public String getAgencia() {
		return this.agencia;
	}
	
	public String setAgencia(String agencia) {
		return this.agencia = agencia; 	
	}
	
	public int getNumero() {
		return this.numero;	
	}
	
	public int setNumero(int numero) {
		return this.numero = numero;
	}
	
	public String getTitular(){
		return this.titular;
	}
	
	public String setTitular(String titular) {
		return this.titular = titular;
	}
	
	public String getTipo() {
	return "conta";
	}
	
	public String setTipo(String tipo) {
		return this.tipo = tipo;
	}
	
	public double getSaldo() {
		return this.saldo;
		
	}
	
	public String toString() {
		return "Conta [numero =" + numero + " ,titular= " + titular + ", saldo=" + saldo + "]";
		
	}
	
	public void deposita (double quantidade) {
		if(quantidade < 0) {
			throw new IllegalArgumentException("Você tentou depositar " + " um valor negativo.");}
		else {this.saldo += quantidade;
		}
	}
	
	public void saca (double quantidade) {
		if (saldo>= quantidade) {
			this.saldo = this.saldo - quantidade;
	}
		else {}
		
	}
	
	public void transfere (double valor, Conta conta) {
		this.saca(valor);
        conta.deposita(valor);
			System.out.println("o valor transferido da conta de " + this.titular + "foi de " + valor);
			System.out.println("o saldo do destino titular agora é de " + conta.saldo);
	}
}
		

	


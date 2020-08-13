package br.com.raul.contas;

public abstract class Conta {

	public long cpfTitular;
	public double saldo;
	public int numAgencia;
	
	public Conta(long cpfTitular, double saldo, int numAgencia) {
		this.cpfTitular = cpfTitular;
		this.saldo = saldo;
		this.numAgencia = numAgencia;
	}
	
	public abstract void saca(double valor);
}

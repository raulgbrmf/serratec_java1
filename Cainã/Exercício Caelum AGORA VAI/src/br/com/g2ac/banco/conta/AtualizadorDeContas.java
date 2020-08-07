package br.com.g2ac.banco.conta;

public class AtualizadorDeContas 
{
	private double saldoTotal = 0;
	private double selic;
	
	public AtualizadorDeContas(double selic)
	{
		this.selic = selic;
	}
	
	public void roda(Conta conta)
	{
		System.out.println("Saldo anterior: " + conta.saldo);
		conta.atualizaSaldo(selic);
		System.out.println("Saldo final: " + conta.saldo);
		this.saldoTotal += conta.saldo;
	}
	
	public double getSaldoTotal()
	{
		return this.saldoTotal;
	}
}



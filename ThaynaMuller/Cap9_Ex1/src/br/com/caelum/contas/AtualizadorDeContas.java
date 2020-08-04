package br.com.caelum.contas;
//Exercicio 6:

public class AtualizadorDeContas {
	
	private double saldoTotal = 0;
	private double selic;
	
	public AtualizadorDeContas(double selic) {
		this.selic = selic;
		
	}
	
	public void roda(Conta c) {
		
		double saldo = c.getSaldo();
		saldo += saldo*selic;
		saldoTotal = saldo;
		
	}
	
	public double getSaldoTotal() {
		return saldoTotal;
	}
	
	

}

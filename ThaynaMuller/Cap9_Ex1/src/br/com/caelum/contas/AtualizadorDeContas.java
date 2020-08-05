package br.com.caelum.contas;
//Exercicio 6:

public class AtualizadorDeContas {
	
	private double saldoTotal = 0;
	private double selic;
	
	public AtualizadorDeContas(double selic) {
		this.selic = selic;
		
	}
	
	public void roda(Conta c) {
		
		System.out.println("Saldo anterior: R$ " +c.getSaldo());
		c.atualiza(selic);
		System.out.println("Novo saldo: R$ "+c.getSaldo());
		saldoTotal = c.getSaldo();
		
	}
	
	public double getSaldoTotal() {
		return saldoTotal;
	}
	
	

}

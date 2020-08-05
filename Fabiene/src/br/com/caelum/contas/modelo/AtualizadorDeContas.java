package br.com.caelum.contas.modelo;


public class AtualizadorDeContas{
	
	
	private double saldoTotal = 0;
	private double selic;
	double taxa;
	
	AtualizadorDeContas(double selic){
		this.selic = selic;
	}
	
	void roda (Conta c) {
		System.out.println("Saldo Inicial da Conta: "+ c.getSaldo());
		c.atualiza(this.selic);
		System.out.println("Valor atualizado: "+c.getSaldo());
		saldoTotal += c.getSaldo();	
		
	}

	double getSaldoTotal() {
		return saldoTotal;
	}
	
}

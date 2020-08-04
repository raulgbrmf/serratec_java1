package br.com.caelum.contas.modelo;
import java.util.Scanner;

public class AtualizadorDeContas{
	
	Scanner ler= new Scanner(System.in);
	private double saldoTotal = 0;
	private double selic;
	double taxa;
	
	AtualizadorDeContas(double selic){
		this.selic = selic;
	}
	
	void roda (Conta c) {
		c.getSaldo(); 
		System.out.println("Saldo Inicial da Conta: "+ c.getSaldo());
		System.out.println("Entre com o valor da taxa de atualização: ");
		taxa = ler.nextDouble();
		c.atualiza();
		System.out.println("Valor atualizado: "+c.getSaldo());
		saldoTotal += getSaldoTotal();	
		
	}
	
	double getSaldoTotal() {
		return this.saldoTotal;
	}
}

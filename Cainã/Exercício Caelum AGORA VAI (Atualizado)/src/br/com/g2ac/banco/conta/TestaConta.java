package br.com.g2ac.banco.conta;

import br.com.g2ac.banco.util.Data;

public class TestaConta 
{
	public static void main(String[] args) 
	{
		
		Data data5 = new Data(5, 4, 2000);
		/*
		Cliente cliente1 = new Cliente("Cainã", "Machado");
		Conta c1 = new Conta(123, cliente1.getNome(), "1234-5", data5, 2000);
		
		
		c1.mostraConta();
		
		c1.atualizaSaldo(0.1);
		
		c1.mostraConta();
		*/
		
		Conta cp1 = new ContaPoupanca(123, "Cainã", "1234-5", data5, 0);
		Conta cc1 = new ContaCorrente(124, "Caio", "5432-1", data5, 0);
		Conta cp2 = new ContaPoupanca(125, "Julio", "5432-2", data5, 0);
		
		cp1.deposita(1000);
		cc1.deposita(1000);
		cp2.deposita(1000);
		
		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
		
		adc.roda(cp1);
		System.out.println();
		adc.roda(cc1);
		System.out.println();
		adc.roda(cp2);
		
		System.out.println("\n" + "Saldo total: " + adc.getSaldoTotal());
	}
}

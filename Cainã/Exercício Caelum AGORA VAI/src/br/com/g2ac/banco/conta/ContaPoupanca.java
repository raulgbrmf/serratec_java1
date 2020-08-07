package br.com.g2ac.banco.conta;

import br.com.g2ac.banco.util.Data;

public class ContaPoupanca extends Conta
{
	public ContaPoupanca (int num, String nome, String agencia, Data dataAbertura, double saldo) 
	{
		super(num, nome, agencia, dataAbertura, saldo);
	}
	
	public void atualizaSaldo (double taxa)
	{
		this.saldo += this.saldo * taxa * 3;
	}
}

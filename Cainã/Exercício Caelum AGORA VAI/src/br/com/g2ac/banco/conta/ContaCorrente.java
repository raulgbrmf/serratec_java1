package br.com.g2ac.banco.conta;

import br.com.g2ac.banco.util.Data;
import br.com.g2ac.banco.util.Tributavel;
import br.com.g2ac.banco.util.ValorInvalidoException;

public class ContaCorrente extends Conta implements Tributavel
{
	public ContaCorrente (int num, String nome, String agencia, Data dataAbertura, double saldo)
	{
		super(num, nome, agencia, dataAbertura, saldo);
	}
	
	public void atualizaSaldo (double taxa)
	{
		this.saldo += this.saldo * taxa * 2;
	}
	
	public void deposita (double valor) throws ValorInvalidoException
	{
		super.deposita(valor - 0.10);
	}
	
	public double calculaTributos()
	{
		return this.saldo * 0.01;
	}
}

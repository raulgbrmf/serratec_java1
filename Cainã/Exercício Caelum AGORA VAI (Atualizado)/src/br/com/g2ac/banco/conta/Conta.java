package br.com.g2ac.banco.conta;

import br.com.g2ac.banco.util.Data;

abstract class Conta 
{
	private int numConta;
	private String nomeTitular;
	private String agencia;
	private Data dataAbertura;
	protected double saldo = 0;
	private static int totalDeContas;
	
	public Conta (int num, String nome, String agencia, Data dataAbertura, double saldo)
	{
		Conta.totalDeContas = Conta.totalDeContas + 1;
		this.numConta = num;
		this.nomeTitular = nome;
		this.agencia = agencia;
		this.dataAbertura = dataAbertura;
		this.saldo = saldo;
	}
	
	public double getSaldo()
	{
		return this.saldo;
	}
	
	public void saca (double valor)
	{
		if (this.saldo < valor)
		{
			System.out.println("Não é possível sacar esse valor");
		}
		else
		{
			double novoSaldo = this.saldo - valor;
			this.saldo = novoSaldo;
		}
	}

	public void deposita (double valor)
	{
		this.saldo += valor;
	}
	
	public void transfere (Conta destino, double valor)
	{
		if (this.saldo < valor)
		{
			System.out.println("Não é possível realizar essa transferência");
		}
		else
		{
			this.saldo = this.saldo - valor;
			destino.saldo += valor;
		}
	}
	
	abstract void atualizaSaldo(double taxa);
	
	public void mostraConta()
	{
		System.out.println("Número da conta: " + this.numConta);
		System.out.println("Titular da conta: " + this.nomeTitular);
		System.out.println("Agência: " + this.agencia);
		System.out.println("Data de abertura: " + this.dataAbertura.imprimeData());
		System.out.println("Saldo atual: " + this.saldo);
		System.out.println("Total de contas: " + Conta.totalDeContas);
		System.out.println();
	}
}

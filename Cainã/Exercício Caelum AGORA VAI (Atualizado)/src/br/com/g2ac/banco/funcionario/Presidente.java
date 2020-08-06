package br.com.g2ac.banco.funcionario;

import br.com.g2ac.banco.util.Data;

public class Presidente extends Funcionario
{
	public Presidente(String nome, double salario, Data dataEntrada) 
	{
		super(nome, salario, dataEntrada);
	}
	
	public double getBonificacao()
	{
		return this.salario * 0.20;
	}
}

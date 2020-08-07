package br.com.g2ac.banco.funcionario;

import br.com.g2ac.banco.util.Data;

abstract class Secretaria extends Funcionario
{
	public Secretaria(String nome, double salario, Data dataEntrada) 
	{
		super(nome, salario, dataEntrada);
	}
}

package br.com.g2ac.banco.funcionario;

import br.com.g2ac.banco.util.Data;

public class Diretor extends Gerente
{
	public Diretor(String nome, double salario, Data dataEntrada, int senha) 
	{
		super(nome, salario, dataEntrada, senha);
	}
}

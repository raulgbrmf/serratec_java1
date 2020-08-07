package br.com.g2ac.banco.funcionario;

import br.com.g2ac.banco.util.Autenticavel;
import br.com.g2ac.banco.util.Data;

public class Gerente extends Funcionario implements Autenticavel
{
	private int senha;
	
	public Gerente(String nome, double salario, Data dataEntrada, int senha) 
	{
		super(nome, salario, dataEntrada);
		this.senha = senha;
	}
	
	public boolean autenticaSenha(int senha)
	{
		if(this.senha == senha)
		{
			System.out.println("Acesso permitido!");
			return true;
		}
		else
		{
			System.out.println("Acesso negado!");
			return false;
		}
	}
	
	public double getBonificacao()
	{
		return salario * 0.15;
	}
}

package br.com.g2ac.banco.funcionario;

import br.com.g2ac.banco.util.Data;

public class SecretariaAdministrativa extends Secretaria
{
	public SecretariaAdministrativa(String nome, double salario, Data dataEntrada) 
	{
		super(nome, salario, dataEntrada);
	}
	
	public double getBonificacao()
	{
		return this.salario * 0.14;
	}
}

package br.com.g2ac.banco.util;

public class ValorInvalidoException extends Exception
{	
	public ValorInvalidoException(double valor) 
	{
		super("Não foi possível realizar a ação com o seguinte valor: " + valor);
	}
}

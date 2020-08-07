package br.com.g2ac.banco.conta;

import br.com.g2ac.banco.util.Data;
import br.com.g2ac.banco.util.ValorInvalidoException;

public class TestaDeposita 
{
	public static void main(String[] args)
	{
		Data d1 = new Data(25, 5, 5000);
		Conta cp = new ContaPoupanca(123, "J", "12-3", d1, 2000);
		
		try
		{
			cp.deposita(-500);
		}
		catch(ValorInvalidoException e)
		{
			System.out.println(e.getMessage());
		}
		
		Conta cc = new ContaCorrente(321, "K", "32-1", d1, 2000);
		
		try
		{
			cc.saca(5000);
		}
		catch(ValorInvalidoException e)
		{
			System.out.println(e.getMessage());
		}
	}
}

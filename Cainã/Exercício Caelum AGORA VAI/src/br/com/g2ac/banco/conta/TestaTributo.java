package br.com.g2ac.banco.conta;

import br.com.g2ac.banco.util.Data;
import br.com.g2ac.banco.util.Tributavel;

public class TestaTributo 
{
	public static void main(String[] args) 
	{
		Data data1 = new Data(25, 3, 2020);
		ContaCorrente cc = new ContaCorrente(567, "ABC", "13579-0", data1, 5000);
		Tributavel t = cc;
		System.out.println(t.calculaTributos());
	}
}

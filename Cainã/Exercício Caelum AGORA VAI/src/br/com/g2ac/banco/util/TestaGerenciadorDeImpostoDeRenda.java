package br.com.g2ac.banco.util;

import br.com.g2ac.banco.conta.ContaCorrente;
import br.com.g2ac.banco.conta.SeguroDeVida;

public class TestaGerenciadorDeImpostoDeRenda 
{
	public static void main(String[] args) 
	{
		Data d1 = new Data(25, 1, 2077);
		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
		
		SeguroDeVida sv = new SeguroDeVida();
		gerenciador.adiciona(sv);
		
		ContaCorrente cc = new ContaCorrente(123, "Post", "1234-5", d1, 1000);
		gerenciador.adiciona(cc);
		
		System.out.println(gerenciador.getTotal());
		
		System.out.println();
		
		double res = gerenciador.getTotal() + cc.getSaldo();
		System.out.printf("O saldo é: %.2f", res);
	}
}

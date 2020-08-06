package br.com.g2ac.usuario.main;

import br.com.g2ac.contas.modelo.ContaCorrente;
import br.com.g2ac.usuario.GerenciadorDeImpostoDeRenda;
import br.com.g2ac.usuario.SeguroDeVida;

public class TestaGerenciadorDeImpostoDeRenda {

	public static void main(String[] args) {

		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();

		SeguroDeVida sv = new SeguroDeVida();
		gerenciador.adiciona(sv);
		
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(1000);
		gerenciador.adiciona(cc);
		
		System.out.printf("%.2f", gerenciador.getTotal());
		
	}
}

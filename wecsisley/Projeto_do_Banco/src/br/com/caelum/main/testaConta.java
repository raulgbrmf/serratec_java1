package br.com.caelum.main;

import br.com.caelum.contas.modelo.ManipuladorDeSeguroDeVidas;
import br.com.caelum.util.SeguroDeVida;

public class testaConta {
	public static void main(String[] args) {
		
		ManipuladorDeSeguroDeVidas teste1 = new ManipuladorDeSeguroDeVidas();
		
		SeguroDeVida s1 = new SeguroDeVida();
		
		teste1.criarSeguro();
		
		System.out.println(s1.getTitular());
		System.out.println(s1.getNumeroApolice());
		System.out.println(s1.getValor());
	}
}

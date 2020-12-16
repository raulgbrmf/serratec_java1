package br.com.caelum.usuario.main;

import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.Tributavel;

public class TestaTributavel {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.getValorImpostos());
		
	
		// testando polimorfismo:
		
		Tributavel t = cc;
		System.out.println(t.getValorImpostos());
	}
}



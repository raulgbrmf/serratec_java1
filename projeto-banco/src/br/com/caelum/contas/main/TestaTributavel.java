package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.Tributavel;

public class TestaTributavel {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		cc.setTitular("Renato Viana");
		System.out.println(cc.getValorImposto());

		// Testando polimorfismo:
		Tributavel t = cc;
		System.out.println(t.getValorImposto());
		System.out.println(t.getTitular());
		System.out.println(t.getTipo());
	}

}

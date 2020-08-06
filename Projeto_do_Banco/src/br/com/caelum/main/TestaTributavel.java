package br.com.caelum.main;

import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.interfaces.Tributavel;

//import br.com.caelum.javafx.api.main.TelaDeContas;

public class TestaTributavel {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente();

		cc.deposita(100);

		System.out.println(cc.getValorImposto());

		// testando polimorfismo:

		Tributavel t = cc;

		System.out.println(t.getValorImposto());

	}

}
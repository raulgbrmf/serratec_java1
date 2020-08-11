package br.com.g2ac.interfaces.main;

import br.com.g2ac.contas.modelo.ContaCorrente;
import br.com.g2ac.interfaces.Tributavel;

public class TesteTributavel {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		Tributavel t = cc;
		System.out.println(t.calculaTributos());

		System.out.println(t.getSaldo());

	}
}

package mainsTestes;

import interfaces.Tributavel;
import modeloContas.ContaCorrente;

public class TestaTributavel {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		Tributavel t = cc;
		System.out.println(t.calculaTributos());		
		System.out.println(t.getSaldo());

	}

}

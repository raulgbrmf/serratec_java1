package br.com.g2ac.banco.calculos;

public class TestaTributavel {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		Tributavel t = cc;
		System.out.println( t.calculaTributos());
		System.out.println( t.getSaldo()); 
	}

}

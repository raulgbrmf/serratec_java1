package br.com.caelum.controle;
import br.com.caelum.contas.ContaCorrente;

public class TestaTributavel {

	public static void main(String[] args) {
		
		
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(2000);
		Tributavel t = cc;
		System.out.println("O Valor tributado em cima do deposito feito foi de: R$ " +t.calculaTributos());
		
		
		
	
		
		
		
		
		

	}

}

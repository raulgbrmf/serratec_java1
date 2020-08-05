//	Cap11.7
//	imprime o valor 10^2

package br.com.caelum.contas.modelo;

public class TestaTributavel {
	
	public static void main (String[]args) {
	ContaCorrente cc = new ContaCorrente();
	cc.deposita(100);
	System.out.println(cc.getValorImposto());
	
	//	testando polimorfismo
	
	/*
	Tributavel t = cc;
	System.out.println(t.getValorImposto());
	*/
	
	}

}

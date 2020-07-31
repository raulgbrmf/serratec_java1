package java3;

public class ex2_14_v2_2 {

	public static void main(String[] args) {
		conta c1 = new conta();
		c1.titular = "Hugo";
		c1.numeroDaConta = 123;
		c1.agencia = "45678-9";
		c1.saldo = 50.0;
		c1.dataDeAbertura = "04/06/2015";
//		c1.deposita(10.0);
		
	//	c1.saca(10);
		//System.out.println("rendimento mensal: ");
//		System.out.println("Seu rendimento neste mês foi de :" + c1.calculaRendimento());
//		System.out.println("Seu saldo atual é :" + c1.calculaRendimento());
		
		conta c2 = new conta();
		c2.titular = "Hugo";
		c2.numeroDaConta = 123;
		c2.agencia = "45678-9";
		c2.saldo = 50.0;
		c2.dataDeAbertura = "04/06/2015";
		
	
		System.out.println(c1.toString());
		
		if (c1 == c2) {
			System.out.println("iguais");
			} else {
			System.out.println("diferentes");
			}

	}

}

package guilherme;

public class Main {

	public static void main(String[] args) {
		conta c1 = new conta();
		c1.titular = "Hugo";
		c1.numeroDaConta = 123;
		c1.agencia = "45678-9";
		c1.saldo = 50.0;
		c1.dataDeAbertura = "04/06/2015";
		c1.deposita(10.0);
		
		c1.saca(10);
		//System.out.println("rendimento mensal: ");
//		System.out.println("Seu rendimento neste mês foi de :" + c1.calculaRendimento());
//		System.out.println("Seu saldo atual é :" + c1.calculaRendimento());
	}

	
}
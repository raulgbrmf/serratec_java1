
public class Main {

	public static void main(String[] args) {
		
		//Exerc�cio 2
		Conta minhaconta = new Conta();
		
	    minhaconta.titular = "Mariana";
		minhaconta.saldo = 800;
		minhaconta.agencia = "3455";
		minhaconta.datadeabertura = "20/03/2020";
		minhaconta.numero = 2560;
		
		minhaconta.deposita(100.0);
		System.out.println("O saldo	atual �: "	+	minhaconta.saldo);
		System.out.println("O rendimento mensal �:  "	+  minhaconta.calculaRendimento());
		
		//Exerc�cio 4
		Conta c2 = new Conta();
		c2.titular = "Maria";
		c2.saldo = 100;
		c2.agencia = "2566";
		c2.datadeabertura = "25/04/2019";
		c2.numero = 300;
		
		if(minhaconta == c2) {
			System.out.println("Contas iguais");
		} else {
			System.out.println("Contas diferentes");
		}
		
		//Exerc�cio 5; o if do exerc�cio 4 n�o muda//
		Conta mesmaconta = new Conta();
		mesmaconta.titular = "Mariana";
		mesmaconta.saldo = 100;
		c2 = mesmaconta;

	 
		


		
		
		

	}

}

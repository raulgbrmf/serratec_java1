package aula_orientacao_a_objeto;

public class Main {

	public static void main(String[] args) {
		
		Conta minhaconta = new Conta();
		Conta suaconta = new Conta();
		
		//---System.out.println(minhaconta.titular + " " + minhaconta.numero);
		
		//altero os valores da minha conta
		minhaconta.titular = "Ingrid";
		minhaconta.numero = 20;
		minhaconta.saldo = 100.50;
		
		//altero os valores da sua conta
		suaconta.titular = "Raul";
		suaconta.numero = 30;
		suaconta.saldo = 1000;
		
		System.out.println(minhaconta.numero + " | " + minhaconta.titular + " | " + minhaconta.saldo);
		System.out.println(suaconta.numero + " | " + suaconta.titular + " | " + suaconta.saldo);
		
	}
}

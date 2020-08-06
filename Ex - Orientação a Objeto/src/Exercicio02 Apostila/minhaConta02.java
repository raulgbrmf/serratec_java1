import java.util.Scanner;
public class minhaConta02 {
	
	public static void main(String[] args) {
	
		Conta02 minhaconta = new Conta02();
		
		minhaconta.titular = "Alan Patrik";
		minhaconta.numero = 11;
		minhaconta.agencia = "34879-5";
		minhaconta.saldo = 200.90;
		minhaconta.dataDeAbertura = "29/07/2020";
		
		minhaconta.deposita(100.0);
		minhaconta.saca(500);
		
		System.out.println("saldo atual: " + minhaconta.saldo);
		System.out.println("rendimento mensal: " + minhaconta.calculaRendimento());
	}
}

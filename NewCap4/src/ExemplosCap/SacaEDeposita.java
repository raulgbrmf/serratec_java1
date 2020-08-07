package ExemplosCap;

public class SacaEDeposita {

	public static void main(String[] args) {

		Conta minhaConta = new Conta();
		minhaConta.titular.nome  = "Duke";
		minhaConta.saldo = 1000;
		minhaConta.saca(200);
		minhaConta.deposita(500);
		
		boolean resposta =  minhaConta.saca(1000);
		if(resposta){
			System.out.println("Saque Aprovado.");
		}else {
			System.out.println("Saque Indisponível");
		}
		System.out.println(minhaConta.titular.nome);	
		System.out.println("Saldo Total = " + minhaConta.saldo);
	}

}

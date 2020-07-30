package experimento_sala;

public class novo_projeto {

	public static void main(String[] args) {
	
		Conta1 minhaconta = new Conta1();
		
		minhaconta.titular= "nicholas";
		minhaconta.numero= 20;
		minhaconta.saldo= 1523;
		
		
		minhaconta.deposita(50);
		
		System.out.println(minhaconta.saldo);
		
		
		minhaconta.saca(25); 
		
		System.out.println(minhaconta.saldo);
		
				

	}

}
public class Main03 {
	
	public static void main(String[] args) {

		Conta03 minhaconta = new Conta03("Alan");

		minhaconta.deposita(100);
		
		System.out.println(minhaconta.getTitular() + " Seu saldo é : " + minhaconta.getSaldo());
		
	}
}

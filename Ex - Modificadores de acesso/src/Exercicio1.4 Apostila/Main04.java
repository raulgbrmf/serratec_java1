
public class Main04 {
	
	public static void main(String[] args) {

		Conta04 minhaconta = new Conta04("Patrik");

		minhaconta.deposita(150);
		
		System.out.println(minhaconta.getTitular() + " Seu saldo é : " + minhaconta.getSaldo());
		
	}
}

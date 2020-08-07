
public class Exercicio3 {

	public static void main(String[] args) {

		Conta minhaConta = new Conta();
		minhaConta.setAgencia("4531");
		minhaConta.setNomeTitular("Mordred");
		minhaConta.deposita(134.55);
		
		System.out.println(minhaConta.getAgencia());
		System.out.println(minhaConta.getNomeTitular());
		System.out.println(minhaConta.getSaldo());
		
	

		}
}

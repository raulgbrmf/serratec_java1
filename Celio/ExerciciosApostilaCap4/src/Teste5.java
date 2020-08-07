public class Teste5 {

	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		minhaConta.nomeTitular = "Celio";
		minhaConta.saldo = 100;
		
		Conta outraConta = new Conta();
		outraConta = minhaConta;
		
		if(minhaConta == outraConta) {
			System.out.println("As contas são iguais.");
		}
		else {
			System.out.println("As contas são diferentes.");
		}
	}

}

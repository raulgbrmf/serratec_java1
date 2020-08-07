
public class Teste4 {

	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		minhaConta.nomeTitular = "Celio";
		minhaConta.saldo = 100;
		
		Conta outraConta = new Conta();
		outraConta.nomeTitular = "Celio";
		outraConta.saldo = 100;
		
		if(minhaConta == outraConta) {
			System.out.println("As contas são iguais.");
		}
		else {
			System.out.println("As contas são diferentes.");
		}
	}

}

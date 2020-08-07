
public class Teste6 {
	
	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		minhaConta.agencia = "1461-8";
		minhaConta.nomeTitular = "Célio da Paz";
		minhaConta.numero = 2500;
		minhaConta.saldo = 1555.00;
		
		Data data = new Data();
		minhaConta.dataDeAbertura = data;
		
		System.out.println(minhaConta.recuperaDados());
	}

}

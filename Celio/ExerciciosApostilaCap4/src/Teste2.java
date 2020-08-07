
public class Teste2 {

	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		minhaConta.agencia = "1461-8";
		minhaConta.nomeTitular = "Célio da Paz";
		minhaConta.numero = 2500;
		minhaConta.saldo = 1555.00;
		
		minhaConta.saca(200.00);
		minhaConta.deposita(500);
		minhaConta.calculaRendimento();
		
	}

}

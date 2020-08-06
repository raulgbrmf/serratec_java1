public class minhaConta03 {
	
	public static void main(String[] args) {
	
		Conta03 minhaconta = new Conta03();
		
		minhaconta.titular = "Alan Patrik";
		minhaconta.numero_da_conta = "01.065983-4";
		minhaconta.agencia = "46791-7";
		minhaconta.saldo = 150.50;
		minhaconta.dataDeAbertura = "29/07/2020";
		
		System.out.println(minhaconta.recuperaDadosParaImpressao());
	}
}

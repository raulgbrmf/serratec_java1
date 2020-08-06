public class minhaConta07 {
	
	public static void main(String[] args) {
	
		Conta07 minhaconta = new Conta07();
		Data07 data = new Data07();
				
		data.dia = 30;
		data.mes = 07;
		data.ano = 2020;
		minhaconta.dataDeAbertura =	data;
		
		minhaconta.saldo = 500;
		minhaconta.titular = "Alan";
		minhaconta.numero_da_conta = "11";
		minhaconta.agencia = "34879-5";

		
		System.out.print(minhaconta.recuperaDadosParaImpressao());
		
	}
}

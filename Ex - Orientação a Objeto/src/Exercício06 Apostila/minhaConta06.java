public class minhaConta06 {
	
	public static void main(String[] args) {
	
		Conta06 minhaconta = new Conta06();
		Data06 data = new Data06();
				
		data.dia = 30;
		data.mes = 07;
		data.ano = 2020;
		minhaconta.dataDeAbertura =	data;
		
		minhaconta.saldo = 500;
		minhaconta.titular = "Alan";
		minhaconta.numero_da_conta = "11";
		minhaconta.agencia = "34879-5";

		System.out.println(minhaconta.dataDeAbertura);

	}
}

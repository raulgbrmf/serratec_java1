
public class Teste9 {
	
	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		minhaConta.agencia = "1461-8";
		minhaConta.nomeTitular = "Célio da Paz";
		minhaConta.numero = 2500;
		minhaConta.saldo = 1555.00;
		
		Data data = new Data();
		data.dia = 25;
		data.mes = 12;
		data.ano = 1976;
		minhaConta.dataDeAbertura = data;
		
		System.out.println(minhaConta.recuperaDados());
	}

}
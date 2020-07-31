package conta_exer_cap5;

public class Main {
	public static void main (String[]args) {
		Conta minhaconta = new Conta();
		Data data = new Data();
		
		minhaconta.getTitular();
		minhaconta.dataAbertura = data;
		data.dia=20;
		data.mes=7;
		data.ano=2020;
		minhaconta.agencia = "3533";
		minhaconta.numero = 20;
		minhaconta.getSaldo();
		
		
		//Exercício 3 página 76
		minhaconta.setTitular("Fabiene Avilla");
		
		System.out.println(minhaconta.recuperaDadosParaImpressao ());
		
		
		//Exercício 2 página 76
		System.out.println("Seu saldo com rendimento é de "+minhaconta.getcalculaRendimento());
		
				
		
	}
}



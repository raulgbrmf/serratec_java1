
public class Main {

	public static void main(String[] args) {

		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		Data data1 = new Data();
		Data data2 = new Data();
		data1.dia = 5;
		data1.mes = 10;
		data1.ano = 2020;
		
		data2.dia = 8;
		data2.mes = 12;            // QUESTÃO 7
		data2.ano = 2020;
		

		conta1.numero = 1;
		conta1.saldo = 1000;
		conta1.titular = "Mayana";
		conta1.agencia = "23";
		conta1.data_abertura = data1;
		

		conta2.numero = 2;
		conta2.saldo = 2000;
		conta2.titular = "Pedro";
		conta2.agencia = "25";
		conta2.data_abertura = data2;
		

		// conta1.deposita(100);     
		//System.out.println("Saldo Atual: R$" + conta1.saldo);              -> QUESTÃO 2
		//System.out.println("Rendimento Mensal: R$" + conta1.calculaRendimento());
		System.out.println(conta2.recuperaDadosImpressao()); 

		/*
		 * if(conta1 == conta2) { 
		 *    System.out.println("Iguais"); 
		 * }                                            -> QUESTÃO 4
		 * else {
		 *    System.out.println("Diferentes."); 
		 * }
		 */

		/*conta2 = conta1; 
		if (conta1 == conta2) {
			System.out.println("Iguais");
		}                                                  -> QUESTÃO 5
		else {
			System.out.println("Diferentes.");
		}*/
	}

}

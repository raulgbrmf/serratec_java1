package conta_bancaria;

public class Program {

	public static void main(String[] args) {

		Data data1 = new Data(22, 12, 2020);
		Data data2 = new Data(20, 5, 2010);
		Conta conta1 = new Conta(1, "9882982-2", "Rafael", 1000, data1);
		Conta conta2 = new Conta(2, "09339-3", "Raul", 2000, data2);

		System.out.println(conta1.getTitular() + " Saldo Atual: R$" + conta1.getSaldo());// QUESTÃO 2

		System.out.println(conta1.getTitular() + " Rendimento Mensal: R$" + conta1.calculaRendimento());

		conta1.deposita(100);
		conta1.transfere(conta2, 100);

		conta2.saca(300);

		System.out.println(conta1.recuperaDadosImpressao());

		/*
		 * if(conta1 == conta2) { System.out.println("Iguais"); } // QUESTÃO 4 else {
		 * System.out.println("Diferentes."); }
		 */

		/*
		 * conta2 = conta1; if (conta1 == conta2) { System.out.println("Iguais"); }
		 * //QUESTÃO 5 else { System.out.println("Diferentes."); }
		 */
	}

}

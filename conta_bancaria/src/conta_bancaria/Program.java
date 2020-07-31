package conta_bancaria;

public class Program {

	public static void main(String[] args){

		Data data1 = new Data(31,8,2020);
		Data data2 = new Data(28,2,2019);

		Conta conta2 = new Conta(2, "09339-3", "Raul", 2000, data2);
		Conta conta1 = new Conta(1, "9882982-2", "Rafael", 1000,data1);
			

		System.out.println(conta2.recuperaDadosImpressao());
		System.out.println("=============================");
		System.out.println(conta1.recuperaDadosImpressao());

		System.out.println("Quantidades de contas " + Conta.getTotalDeContas());

	}

}

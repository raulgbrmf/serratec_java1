package conta_bancaria;

public class Program {

	public static void main(String[] args){

		Data data1 = new Data(31,8,2020);
		Data data2 = new Data(8,02,2019);

		ContaPoupanca cp1 = new ContaPoupanca(1,"08090-9","Rafael",100,data1,0.2);
		
		ContaCorrente cc1 = new ContaCorrente(1,"080980390-9","Raul",100,data2,6000);
		
		
		cc1.realizaEmprestimo(300);
		
			

		System.out.println(cp1.recuperaDadosImpressao());
		System.out.println("=============================");
		System.out.println(cc1.recuperaDadosImpressao());

		System.out.println("Quantidades de contas " + Conta.getTotalDeContas());

	}

}

package Projeto_Banco;

public class Main {
	public static void main(String[] args) {

		Conta conta1;
		Conta conta2;
		Cliente cliente1;
		Cliente cliente2;
		
		cliente1 = new Cliente();
		conta1 = new Conta();
		conta1.titular = cliente1.nome = "Fabiene";
		conta1.numero = 001;
		conta1.saldo = 1000.00;
		

		cliente2 = new Cliente();
		conta2 = new Conta();
		conta2.numero = 002;
		conta2.titular = cliente2.nome = "Thayná";
		conta2.saldo = 1500.00;

		System.out.printf("Saldo Atual de " + conta2.titular +": R$ %.2f%n", conta2.saldo);
		System.out.printf("Saldo Atual de " + conta1.titular +": R$ %.2f%n", conta1.saldo);
		
		conta1.transferePara(conta2, 120);
		System.out.println("\n" + conta1.titular + ": " + "\nTransferência realizada com sucesso !");
		System.out.printf("Saldo Atual de " + conta1.titular +": R$ %.2f%n", conta1.saldo);
		
		System.out.println("\n" + conta2.titular + ": " + "\nConsulta saldo atual: ");
		System.out.printf("R$ %.2f%n", conta2.saldo);
		
		if(conta1.saca(800) == false) {
		System.out.printf("\nSaldo insuficiente para realizar o saque" 
							+ "\nSeu saldo atual é de: R$ %.2f%n", conta1.saldo);
		} else {
			System.out.printf("\n" + conta1.titular + ": " + "\nSaque realizado com sucesso !" 
								+ "\nSeu saldo atual é de: R$ %.2f%n", conta1.saldo);
		}
		
		conta1.rendimentoMensal();
		System.out.printf("Saldo após rendimentos: R$ %.2f", conta1.saldo);
	}

}

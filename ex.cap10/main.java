package ex09;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		// cria contas
		Conta cc = new ContaCorrente("Hugo", 123456, 789, "corrente");
		Conta cp = new ContaPoupanca("Roberta", 45674, 9090, "poupança");
		
		System.out.println("Dados da primeira conta cadastrada: \n" + cc.recuperaDadosParaImpressao());
		System.out.println("\nDados da segunda conta cadastrada: \n" + cp.recuperaDadosParaImpressao());
		
		//deposita na conta corrente
		System.out.println("\nDigite o valor a depositar na conta corrente:");
		double valorADepositar = new Scanner(System.in).nextDouble();
		cc.depositar(valorADepositar);
		
		//saca da conta corrente, aplicando 10 centavos de tarifa
		System.out.println("\nDigite o valor a sacar:");
		double valorASacar = new Scanner(System.in).nextDouble();
		cc.sacar(valorASacar);
		
		System.out.println("\nSaldo em conta:\n" + cc.getSaldo());
		
		//transferencia da corrente para poupança
		System.out.println("\nDigite o valor da transferência para a poupança: ");
		double valorDepositoPoupanca = new Scanner(System.in).nextDouble();
		cc.transferir(cp, valorDepositoPoupanca);
		
		//saldo na conta poupança
		System.out.println("\nInfo da conta Poupança:\n");
		System.out.println(cp.recuperaDadosParaImpressao());
		
	
	}

}

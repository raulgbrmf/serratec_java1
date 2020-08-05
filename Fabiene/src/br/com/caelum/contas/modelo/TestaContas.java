package br.com.caelum.contas.modelo;

import java.util.Scanner;

public class TestaContas {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double valor;
		int tipoConta;
		int tipoOperacao;
		int controle = 0;
		double taxa=0.01;

		Conta c = new ContaCorrente();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();

		//Dados da Conta
		System.out.printf("Entre com o nome do titular da conta: ");
		c.titular = ler.nextLine();
		System.out.printf("Entre com a agência: ");
		c.agencia = ler.nextLine();
		System.out.printf("Entre com o numero da conta: ");
		c.numero = ler.nextInt();
		System.out.println("\n");

		//Seleciona tipo de Conta
		System.out.println("---- TIPOS DE CONTA ----");
		System.out.println("1 - Conta Corrente");
		System.out.println("2 - Conta Poupança\n");
		System.out.printf("Entre com o tipo de conta: ");
		tipoConta = ler.nextInt();

		while (controle == 0) {
			if (tipoConta == 1) {
				System.out.println("\n");
				//Seleciona tipo de Operação para Conta Corrente
				System.out.println("---- TIPO DE OPERAÇÃO ----");
				System.out.println("1 - Depósito");
				System.out.println("2 - Saque");
				System.out.println("3 - Atualização de Valores");
				System.out.println("4 - Sair\n");
				System.out.printf("Entre com o número da operação desejada: ");
				tipoOperacao = ler.nextInt();

				if (tipoOperacao == 1) {
					System.out.printf("\n" + c.titular + " Seu saldo atual é de: %.2f" , cc.getSaldo());
					System.out.printf("\nEntre com o valor a ser depositado: ");
					valor = ler.nextDouble();
					cc.deposita(valor);
					System.out.printf(c.titular + " Seu saldo atual é de: %.2f" , cc.getSaldo());
				} else if (tipoOperacao == 2) {
					System.out.printf("Entre com o valor a ser sacado: ");
					valor = ler.nextDouble();
					cc.saca(valor);
					System.out.printf(c.titular + " Seu saldo atual é de: %.2f" , cc.getSaldo());
				} else if (tipoOperacao == 3) {
					cc.atualiza(taxa);
					System.out.printf(c.titular + " Seu saldo atual é de: %.2f" , cc.getSaldo());
				} else if (tipoOperacao == 4) {
					System.out.println("Você saiu!");
					controle = 5;
				} else {
					System.out.println("Tipo inexistente de operação!!!");
				}

			} else if (tipoConta == 2) {
				//Seleciona tipo de Operação para Conta Poupança
				System.out.println("\n");
				System.out.println("---- TIPO DE OPERAÇÃO ----");
				System.out.println("1 - Depósito");
				System.out.println("2 - Saque");
				System.out.println("3 - Atualização de Valores");
				System.out.println("4 - Sair\n");
				System.out.printf("Entre com o número da operação desejada: ");
				tipoOperacao = ler.nextInt();

				if (tipoOperacao == 1) {
					System.out.printf("\n" + c.titular + " Seu saldo atual é de: %.2f" , cp.getSaldo());
					System.out.printf("\nEntre com o valor a ser depositado: ");
					valor = ler.nextDouble();
					cp.deposita(valor);
					System.out.printf(c.titular + " Seu saldo atual é de: %.2f" , cp.getSaldo());
				} else if (tipoOperacao == 2) {
					System.out.printf("Entre com o valor a ser sacado: ");
					valor = ler.nextDouble();
					cp.saca(valor);
					System.out.printf(c.titular + " Seu saldo atual é de: %.2f" , cp.getSaldo());
				} else if (tipoOperacao == 3) {
					cp.atualiza(taxa);
					System.out.printf(c.titular + " Seu saldo atual é de: %.2f" , cp.getSaldo());
				} else if (tipoOperacao == 4) {
					System.out.println("Você saiu!");
					controle = 5;
				} else {
					System.out.println("Tipo inexistente de operação!!!");
				}

			} else {
				System.out.println("Tipo inexistente de conta!!!");
				controle = 5;
			}
		}
		ler.close();
	}

}

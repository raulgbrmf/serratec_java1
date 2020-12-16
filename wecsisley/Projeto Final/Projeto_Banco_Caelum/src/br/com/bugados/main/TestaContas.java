package br.com.bugados.main;

import java.util.Scanner;

import br.com.bugados.conta.Conta;
import br.com.bugados.conta.ContaCorrente;
import br.com.bugados.conta.ContaPoupanca;

public class TestaContas {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Scanner leia = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		
		int tipoConta;
		int tipoOperacao;
		int controle = 0;
		double taxa = 0.01;

		ContaCorrente cc1 = new ContaCorrente();
		ContaCorrente cc2 = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();

		// Dados da Conta
		System.out.printf("Entre com o nome do titular da conta: ");
		String titular = ler.nextLine();
		cc1.setTitular(titular);
		System.out.printf("Entre com a agência: ");
		String agencia = ler.nextLine();
		int agenciaInt = Integer.parseInt(agencia);
		cc1.setAgencia(agenciaInt);
		System.out.printf("Entre com o numero da conta: ");
		int numero = ler.nextInt();
		System.out.println("\n");
		cc1.setNumero(numero);

		// Seleciona tipo de Conta
		System.out.println("|---- TIPOS DE CONTA ---|");
		System.out.println("|1 - Conta Corrente     |");
		System.out.println("|2 - Conta Poupança     |");
		System.out.println("|-----------------------|");
		System.out.printf("Entre com o tipo de conta: ");
		tipoConta = ler.nextInt();

		while (controle == 0) {
			if ((tipoConta == 1)||(tipoConta == 2)){
				System.out.println("\n");
				// Seleciona tipo de Operação para Conta Corrente
				System.out.println("|------- TIPO DE OPERAÇÃO -------|");
				System.out.println("|1 - Depósito                    |");
				System.out.println("|2 - Saque                       |");
				System.out.println("|3 - Atualização de Valores      |");
				System.out.println("|4 - Transferência               |");
				System.out.println("|5 - Consulta Saldo              |");
				System.out.println("|6 - Sair                        |");
				System.out.println("|--------------------------------|");
				System.out.printf("Entre com o número da operação desejada: ");
				tipoOperacao = ler.nextInt();

				if (tipoOperacao == 1) {
					System.out.printf("\n" + cc1.getTitular() + " Seu saldo atual é de: %.2f", cc2.getSaldo());
					System.out.printf("\nEntre com o valor a ser depositado: ");
					double valor = ler.nextDouble();
					cc2.deposita(valor);
					System.out.printf(cc1.getTitular() + " Seu saldo atual é de: %.2f", cc2.getSaldo());
				} else if (tipoOperacao == 2) {
					System.out.printf("Entre com o valor a ser sacado: ");
					double valor = ler.nextDouble();
					cc2.saca(valor);
					System.out.printf(cc1.getTitular() + " Seu saldo atual é de: %.2f", cc2.getSaldo());
				} else if (tipoOperacao == 3) {
					if (tipoConta == 1) {
						cc2.atualiza(taxa);
						System.out.printf(cc1.getTitular() + " Seu saldo atual é de: %.2f", cc2.getSaldo());
					} else if (tipoConta == 2){
						cp.atualiza(taxa);
						System.out.printf(cc1.getTitular() + " Seu saldo atual é de: %.2f", cp.getSaldo());
					}
				} else if (tipoOperacao == 4) {
					Conta cd = new ContaCorrente();
					System.out.println("\nEntre com os dados da conta de destino: ");
					System.out.printf("Entre com o nome do titular da conta: ");
					String titular2 = leia.nextLine();
					cd.setTitular(titular2);
					System.out.printf("Entre com a agência: ");
					String agencia2 = leia.nextLine();
					int agencia22 = Integer.parseInt(agencia2);
					cd.setAgencia(agencia22);
					System.out.printf("Entre com o numero da conta: ");
					int numero2 = leia.nextInt();
					cd.setNumero(numero2);

					System.out.printf("\nEntre com o valor da transferência: ");
					double valor = leia.nextDouble();
					cc2.transferePara(cd, valor);
					if (valor <= cc2.getSaldo()) {

						System.out.printf("\nO valor transferido da conta de " + cc1.getTitular() + " foi de %.2f ", valor);
						System.out.printf("\nO saldo atual de " + cc1.getTitular() + " é de %.2f ", cc2.getSaldo());
						System.out.printf("\nA conta de " + cd.getTitular() + " ficou com saldo de %.2f", cd.getSaldo());
					}

				}else if(tipoOperacao == 5) {
					cc2.consultaSaldo();
				}
				else if (tipoOperacao == 6) {
					System.out.println("Você saiu!");
					controle = 6;
				} else {
					System.out.println("Tipo inexistente de operação!!!");
				}

			} else {
				System.out.println("Tipo inexistente de conta!!!");
				controle = 6;
			}
		}
		ler.close();
		leia.close();
		scan.close();

	}

}

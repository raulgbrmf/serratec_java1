package br.com.bugados.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

import br.com.bugados.conta.Conta;
import br.com.bugados.conta.ContaCorrente;
import br.com.bugados.conta.ContaPoupanca;
import br.com.bugados.funcionario.Funcionario;
import br.com.bugados.usuario.Cliente;

public class MenuDeOpcoes {

	public static void menuCliente(int cpfLogin, Map<Integer, Conta> mapConta, Map<Integer, Cliente> mapCliente,
			Map<Integer, Funcionario> mapFuncionario) {
		boolean clienteCadastrado;
		int controle = 1;
		int contDeposita = 0;
		int contSaca = 0;
		int contTransfere = 0;

		Conta conta1 = mapConta.get(cpfLogin);

		while (controle == 1) {

			if (conta1.getTipo() == 1) {

				ContaCorrente conta = (br.com.bugados.conta.ContaCorrente) mapConta.get(cpfLogin);

				String entrada = JOptionPane.showInputDialog("------- TIPO DE OPERAÇÃO -------" + "\n\n 1 - Depósito"
						+ "\n 2 - Saque" + "\n 3 - Transferência" + "\n 4 - Consulta Saldo" + "\n 5 - Consulta tarifas"
						+ "\n 6 - Sair" + "\n                     BugadosBank\n");
				int saida = Integer.parseInt(entrada);

				if (saida == 1) {
					String entradaDeposito = JOptionPane.showInputDialog("Digite o valor que deseja depositar:");
					double valorDeposito = Double.parseDouble(entradaDeposito);
					conta.deposita(valorDeposito);
					conta.consultaSaldo();

					contDeposita = contDeposita + 1;
				} else if (saida == 2) {
					String entradaSaque = JOptionPane.showInputDialog("Digite o valor que deseja sacar:");
					double valorSaque = Double.parseDouble(entradaSaque);
					if (conta.saca(valorSaque)) {
						conta.consultaSaldo();
						contSaca = contSaca + 1;
					} else {
						conta.consultaSaldo();
					}
				} else if (saida == 3) {
					int cpfDestino = InteracaoUsuario.lerInteiros("Informe o cpf da conta destino: ");
					clienteCadastrado = mapCliente.containsKey(cpfDestino);
					if (clienteCadastrado) {
						Conta contaDestino = mapConta.get(cpfDestino);
						double valorTransferido = InteracaoUsuario.lerDoubles("Informe o valor à ser transferido: ");
						if (conta.transferePara(contaDestino, valorTransferido)) {
							System.out.printf("Valor transferido foi de: R$ %.2f%n", valorTransferido);
							System.out.print("Saldo atual de " + conta.getTitular());
							conta.consultaSaldo();

							contTransfere = contTransfere + 1;
						} else {
							conta.consultaSaldo();
						}
					}
				} else if (saida == 4) {
					System.out.print("Saldo atual de " + conta.getTitular() + ": ");
					conta.consultaSaldo();
				} else if (saida == 5) {
					System.out.print("Total gasto em " + contDeposita + " depósitos com taxa de R$ 0,10: ");
					System.out.printf("R$ %.2f%n", (contDeposita * 0.10));

					System.out.print("Total gasto em " + contSaca + " saques com taxa de R$ 0,10: ");
					System.out.printf("R$ %.2f%n", (contSaca * 0.10));

					System.out.print("Total gasto em " + contTransfere + " transferências com taxa de R$ 0,20: ");
					System.out.printf("R$ %.2f%n", (contTransfere * 0.20));
					System.out.printf("Total de tarifas cobradas: R$ %.2f%n", conta.consultaTotalTaxas());

				} else if (saida == 6) {
					controle = 2;
				}
			}

			if (conta1.getTipo() == 2) {

				ContaPoupanca conta = (br.com.bugados.conta.ContaPoupanca) mapConta.get(cpfLogin);

				String entrada = JOptionPane.showInputDialog("------- TIPO DE OPERAÇÃO -------" + "\n\n 1 - Depósito"
						+ "\n 2 - Saque" + "\n 3 - Simulação rendimento poupança" + "\n 4 - Transferência"
						+ "\n 5 - Consulta Saldo" + "\n 6 - Sair" + "\n                     BugadosBank\n");
				int saida = Integer.parseInt(entrada);
				if (saida == 1) {
					String entradaDeposito = JOptionPane.showInputDialog("Digite o valor que deseja depositar:");
					double valorDeposito = Double.parseDouble(entradaDeposito);
					conta.deposita(valorDeposito);
					conta.consultaSaldo();

					contDeposita = contDeposita + 1;
				} else if (saida == 2) {
					String entradaSaque = JOptionPane.showInputDialog("Digite o valor que deseja sacar:");
					double valorSaque = Double.parseDouble(entradaSaque);
					if (conta.saca(valorSaque)) {
						conta.consultaSaldo();
						contSaca = contSaca + 1;
					} else {
						conta.consultaSaldo();
					}
				} else if (saida == 3) {
					conta.poupancudos();
				} else if (saida == 4) {
					int cpfDestino = InteracaoUsuario.lerInteiros("Informe o cpf da conta destino: ");
					clienteCadastrado = mapCliente.containsKey(cpfDestino);
					if (clienteCadastrado) {
						Conta contaDestino = mapConta.get(cpfDestino);
						double valorTransferido = InteracaoUsuario.lerDoubles("Informe o valor à ser transferido: ");
						if (conta.transferePara(contaDestino, valorTransferido)) {
							System.out.printf("Valor transferido foi de: R$ %.2f%n", valorTransferido);
							System.out.print("Saldo atual de " + conta.getTitular());
							conta.consultaSaldo();

							contTransfere = contTransfere + 1;
						} else {
							conta.consultaSaldo();
						}
					}
				} else if (saida == 5) {
					System.out.print("Saldo atual de " + conta.getTitular() + ": ");
					conta.consultaSaldo();
				} else if (saida == 6) {
					controle = 2;
				}
			}
		}
		System.out.println("\n|--------------------------------|");
		System.out.println("|                                |");
		System.out.println("|          BugadosBank           |");
		System.out.println("|                                |");
		System.out.println("|--------------------------------|");
	}

	public static void menuGerente(int cpfLogin, Map<Integer, Conta> mapConta, Map<Integer, Cliente> mapCliente,
			Map<Integer, Funcionario> mapFuncionario) {
		boolean clienteCadastrado;
		int controle = 1;
		int contDeposita = 0;
		int contSaca = 0;
		int contTransfere = 0;

		Conta conta1 = mapConta.get(cpfLogin);

		while (controle == 1) {

			if (conta1.getTipo() == 1) {

				ContaCorrente conta = (br.com.bugados.conta.ContaCorrente) mapConta.get(cpfLogin);

				String entrada = JOptionPane.showInputDialog("------- TIPO DE OPERAÇÃO -------" + "\n\n 1 - Depósito"
						+ "\n 2 - Saque" + "\n 3 - Transferência" + "\n 4 - Consulta Saldo" + "\n 5 - Consulta tarifas"
						+ "\n 6 - Relatório Gerente" + "\n 7 - Sair" + "\n                     BugadosBank\n");
				int saida = Integer.parseInt(entrada);

				if (saida == 1) {
					String entradaDeposito = JOptionPane.showInputDialog("Digite o valor que deseja depositar:");
					double valorDeposito = Double.parseDouble(entradaDeposito);
					conta.deposita(valorDeposito);
					conta.consultaSaldo();

					contDeposita = contDeposita + 1;
				} else if (saida == 2) {
					String entradaSaque = JOptionPane.showInputDialog("Digite o valor que deseja sacar:");
					double valorSaque = Double.parseDouble(entradaSaque);
					if (conta.saca(valorSaque)) {
						conta.consultaSaldo();
						contSaca = contSaca + 1;
					} else {
						conta.consultaSaldo();
					}
				} else if (saida == 3) {
					int cpfDestino = InteracaoUsuario.lerInteiros("Informe o cpf da conta destino: ");
					clienteCadastrado = mapCliente.containsKey(cpfDestino);
					if (clienteCadastrado) {
						Conta contaDestino = mapConta.get(cpfDestino);
						double valorTransferido = InteracaoUsuario.lerDoubles("Informe o valor à ser transferido: ");
						if (conta.transferePara(contaDestino, valorTransferido)) {
							System.out.printf("Valor transferido foi de: R$ %.2f%n", valorTransferido);
							System.out.print("Saldo atual de " + conta.getTitular());
							conta.consultaSaldo();

							contTransfere = contTransfere + 1;
						} else {
							conta.consultaSaldo();
						}
					}
				} else if (saida == 4) {
					System.out.print("Saldo atual de " + conta.getTitular() + ": ");
					conta.consultaSaldo();
				} else if (saida == 5) {
					System.out.print("Total gasto em " + contDeposita + " depósitos com taxa de R$ 0,10: ");
					System.out.printf("R$ %.2f%n", (contDeposita * 0.10));

					System.out.print("Total gasto em " + contSaca + " saques com taxa de R$ 0,10: ");
					System.out.printf("R$ %.2f%n", (contSaca * 0.10));

					System.out.print("Total gasto em " + contTransfere + " transferências com taxa de R$ 0,20: ");
					System.out.printf("R$ %.2f%n", (contTransfere * 0.20));
					System.out.printf("Total de tarifas cobradas: R$ %.2f%n", conta.consultaTotalTaxas());

				} else if (saida == 6) {

					for (Conta c : mapConta.values()) {
						if (c.getAgencia() == conta.getAgencia()) {
							System.out.println(c);
						}
					}

					// Implementar relatório do Gerente
				} else if (saida == 7) {
					controle = 2;
				}
			}

			if (conta1.getTipo() == 2) {

				ContaPoupanca conta = (br.com.bugados.conta.ContaPoupanca) mapConta.get(cpfLogin);

				String entrada = JOptionPane.showInputDialog("------- TIPO DE OPERAÇÃO -------" + "\n\n 1 - Depósito"
						+ "\n 2 - Saque" + "\n 3 - Simulação rendimento poupança" + "\n 4 - Transferência"
						+ "\n 5 - Consulta Saldo" + "\n 6 - Relatório Gerente" + "\n 7 - Sair"
						+ "\n                     BugadosBank\n");
				int saida = Integer.parseInt(entrada);
				if (saida == 1) {
					String entradaDeposito = JOptionPane.showInputDialog("Digite o valor que deseja depositar:");
					double valorDeposito = Double.parseDouble(entradaDeposito);
					conta.deposita(valorDeposito);
					conta.consultaSaldo();

					contDeposita = contDeposita + 1;
				} else if (saida == 2) {
					String entradaSaque = JOptionPane.showInputDialog("Digite o valor que deseja sacar:");
					double valorSaque = Double.parseDouble(entradaSaque);
					if (conta.saca(valorSaque)) {
						conta.consultaSaldo();
						contSaca = contSaca + 1;
					} else {
						conta.consultaSaldo();
					}
				} else if (saida == 3) {
					conta.poupancudos();
				} else if (saida == 4) {
					int cpfDestino = InteracaoUsuario.lerInteiros("Informe o cpf da conta destino: ");
					clienteCadastrado = mapCliente.containsKey(cpfDestino);
					if (clienteCadastrado) {
						Conta contaDestino = mapConta.get(cpfDestino);
						double valorTransferido = InteracaoUsuario.lerDoubles("Informe o valor à ser transferido: ");
						if (conta.transferePara(contaDestino, valorTransferido)) {
							System.out.printf("Valor transferido foi de: R$ %.2f%n", valorTransferido);
							System.out.print("Saldo atual de " + conta.getTitular());
							conta.consultaSaldo();

							contTransfere = contTransfere + 1;
						} else {
							conta.consultaSaldo();
						}
					}
				} else if (saida == 5) {
					System.out.print("Saldo atual de " + conta.getTitular() + ": ");
					conta.consultaSaldo();
				} else if (saida == 6) {

					for (Conta c : mapConta.values()) {
						if (c.getAgencia() == conta.getAgencia()) {
							System.out.println(c);
						}
					}

					// Implementa relatório Gerente
				} else if (saida == 7) {
					controle = 2;
				}
			}
		}
		System.out.println("\n|--------------------------------|");
		System.out.println("|                                |");
		System.out.println("|          BugadosBank           |");
		System.out.println("|                                |");
		System.out.println("|--------------------------------|");
	}

	public static void menuDiretor(int cpfLogin, Map<Integer, Conta> mapConta, Map<Integer, Cliente> mapCliente,
			Map<Integer, Funcionario> mapFuncionario) {
		boolean clienteCadastrado;
		int controle = 1;
		int contDeposita = 0;
		int contSaca = 0;
		int contTransfere = 0;

		Conta conta1 = mapConta.get(cpfLogin);

		while (controle == 1) {

			if (conta1.getTipo() == 1) {

				ContaCorrente conta = (br.com.bugados.conta.ContaCorrente) mapConta.get(cpfLogin);

				String entrada = JOptionPane.showInputDialog("------- TIPO DE OPERAÇÃO -------" + "\n\n 1 - Depósito"
						+ "\n 2 - Saque" + "\n 3 - Transferência" + "\n 4 - Consulta Saldo" + "\n 5 - Consulta tarifas"
						+ "\n 6 - Relatório Gerente" + "\n 7 - Relatório Dirietor" + "\n 8 - Sair"
						+ "\n                     BugadosBank\n");
				int saida = Integer.parseInt(entrada);

				if (saida == 1) {
					String entradaDeposito = JOptionPane.showInputDialog("Digite o valor que deseja depositar:");
					double valorDeposito = Double.parseDouble(entradaDeposito);
					conta.deposita(valorDeposito);
					conta.consultaSaldo();

					contDeposita = contDeposita + 1;
				} else if (saida == 2) {
					String entradaSaque = JOptionPane.showInputDialog("Digite o valor que deseja sacar:");
					double valorSaque = Double.parseDouble(entradaSaque);
					if (conta.saca(valorSaque)) {
						conta.consultaSaldo();
						contSaca = contSaca + 1;
					} else {
						conta.consultaSaldo();
					}
				} else if (saida == 3) {
					int cpfDestino = InteracaoUsuario.lerInteiros("Informe o cpf da conta destino: ");
					clienteCadastrado = mapCliente.containsKey(cpfDestino);
					if (clienteCadastrado) {
						Conta contaDestino = mapConta.get(cpfDestino);
						double valorTransferido = InteracaoUsuario.lerDoubles("Informe o valor à ser transferido: ");
						if (conta.transferePara(contaDestino, valorTransferido)) {
							System.out.printf("Valor transferido foi de: R$ %.2f%n", valorTransferido);
							System.out.print("Saldo atual de " + conta.getTitular());
							conta.consultaSaldo();

							contTransfere = contTransfere + 1;
						} else {
							conta.consultaSaldo();
						}
					}
				} else if (saida == 4) {
					System.out.print("Saldo atual de " + conta.getTitular() + ": ");
					conta.consultaSaldo();
				} else if (saida == 5) {
					System.out.print("Total gasto em " + contDeposita + " depósitos com taxa de R$ 0,10: ");
					System.out.printf("R$ %.2f%n", (contDeposita * 0.10));

					System.out.print("Total gasto em " + contSaca + " saques com taxa de R$ 0,10: ");
					System.out.printf("R$ %.2f%n", (contSaca * 0.10));

					System.out.print("Total gasto em " + contTransfere + " transferências com taxa de R$ 0,20: ");
					System.out.printf("R$ %.2f%n", (contTransfere * 0.20));
					System.out.printf("Total de tarifas cobradas: R$ %.2f%n", conta.consultaTotalTaxas());

				} else if (saida == 6) {

					for (Conta c : mapConta.values()) {
						if (c.getAgencia() == conta.getAgencia()) {
							System.out.println(c);
						}
					}

				} else if (saida == 7) {

					List<Conta> listaContas = new ArrayList<Conta>(mapConta.values());
					listaContas.sort(Comparator.comparing(Conta::getTitular));
					System.out.println(listaContas);

				} else if (saida == 8) {
					controle = 2;
				}
			}

			if (conta1.getTipo() == 2) {

				ContaPoupanca conta = (br.com.bugados.conta.ContaPoupanca) mapConta.get(cpfLogin);

				String entrada = JOptionPane.showInputDialog("------- TIPO DE OPERAÇÃO -------" + "\n\n 1 - Depósito"
						+ "\n 2 - Saque" + "\n 3 - Simulação rendimento poupança" + "\n 4 - Transferência"
						+ "\n 5 - Consulta Saldo" + "\n 6 - Relatório Gerente" + "7 - Relatório Diretor" + "\n 8 - Sair"
						+ "\n                     BugadosBank\n");
				int saida = Integer.parseInt(entrada);
				if (saida == 1) {
					String entradaDeposito = JOptionPane.showInputDialog("Digite o valor que deseja depositar:");
					double valorDeposito = Double.parseDouble(entradaDeposito);
					conta.deposita(valorDeposito);
					conta.consultaSaldo();

					contDeposita = contDeposita + 1;
				} else if (saida == 2) {
					String entradaSaque = JOptionPane.showInputDialog("Digite o valor que deseja sacar:");
					double valorSaque = Double.parseDouble(entradaSaque);
					if (conta.saca(valorSaque)) {
						conta.consultaSaldo();
						contSaca = contSaca + 1;
					} else {
						conta.consultaSaldo();
					}
				} else if (saida == 3) {
					conta.poupancudos();
				} else if (saida == 4) {
					int cpfDestino = InteracaoUsuario.lerInteiros("Informe o cpf da conta destino: ");
					clienteCadastrado = mapCliente.containsKey(cpfDestino);
					if (clienteCadastrado) {
						Conta contaDestino = mapConta.get(cpfDestino);
						double valorTransferido = InteracaoUsuario.lerDoubles("Informe o valor à ser transferido: ");
						if (conta.transferePara(contaDestino, valorTransferido)) {
							System.out.printf("Valor transferido foi de: R$ %.2f%n", valorTransferido);
							System.out.print("Saldo atual de " + conta.getTitular());
							conta.consultaSaldo();

							contTransfere = contTransfere + 1;
						} else {
							conta.consultaSaldo();
						}
					}
				} else if (saida == 5) {
					System.out.print("Saldo atual de " + conta.getTitular() + ": ");
					conta.consultaSaldo();
				} else if (saida == 6) {

					for (Conta c : mapConta.values()) {
						if (c.getAgencia() == conta.getAgencia()) {
							System.out.println(c);
						}
					}

				} else if (saida == 7) {

					List<Conta> listaContas = new ArrayList<Conta>(mapConta.values());
					listaContas.sort(Comparator.comparing(Conta::getTitular));
					System.out.println(listaContas);

				} else if (saida == 8) {
					controle = 2;
				}
			}
		}
		System.out.println("\n|--------------------------------|");
		System.out.println("|                                |");
		System.out.println("|          BugadosBank           |");
		System.out.println("|                                |");
		System.out.println("|--------------------------------|");
	}

	public static void menuPresidente(int cpfLogin, Map<Integer, Conta> mapConta, Map<Integer, Cliente> mapCliente,
			Map<Integer, Funcionario> mapFuncionario) {
		boolean clienteCadastrado;
		int controle = 1;
		int contDeposita = 0;
		int contSaca = 0;
		int contTransfere = 0;

		Conta conta1 = mapConta.get(cpfLogin);

		while (controle == 1) {

			if (conta1.getTipo() == 1) {

				ContaCorrente conta = (br.com.bugados.conta.ContaCorrente) mapConta.get(cpfLogin);

				String entrada = JOptionPane.showInputDialog("------- TIPO DE OPERAÇÃO -------" + "\n\n 1 - Depósito"
						+ "\n 2 - Saque" + "\n 3 - Transferência" + "\n 4 - Consulta Saldo" + "\n 5 - Consulta tarifas"
						+ "\n 6 - Relatório Gerente" + "\n 7 - Relatório Diretor" + "\n 8 - Relatório Presidente"
						+ "\n 9 - Sair" + "\n                     BugadosBank\n");
				int saida = Integer.parseInt(entrada);

				if (saida == 1) {
					String entradaDeposito = JOptionPane.showInputDialog("Digite o valor que deseja depositar:");
					double valorDeposito = Double.parseDouble(entradaDeposito);
					conta.deposita(valorDeposito);
					conta.consultaSaldo();

					contDeposita = contDeposita + 1;
				} else if (saida == 2) {
					String entradaSaque = JOptionPane.showInputDialog("Digite o valor que deseja sacar:");
					double valorSaque = Double.parseDouble(entradaSaque);
					if (conta.saca(valorSaque)) {
						conta.consultaSaldo();
						contSaca = contSaca + 1;
					} else {
						conta.consultaSaldo();
					}
				} else if (saida == 3) {
					int cpfDestino = InteracaoUsuario.lerInteiros("Informe o cpf da conta destino: ");
					clienteCadastrado = mapCliente.containsKey(cpfDestino);
					if (clienteCadastrado) {
						Conta contaDestino = mapConta.get(cpfDestino);
						double valorTransferido = InteracaoUsuario.lerDoubles("Informe o valor à ser transferido: ");
						if (conta.transferePara(contaDestino, valorTransferido)) {
							System.out.printf("Valor transferido foi de: R$ %.2f%n", valorTransferido);
							System.out.print("Saldo atual de " + conta.getTitular());
							conta.consultaSaldo();

							contTransfere = contTransfere + 1;
						} else {
							conta.consultaSaldo();
						}
					}
				} else if (saida == 4) {
					System.out.print("Saldo atual de " + conta.getTitular() + ": ");
					conta.consultaSaldo();
				} else if (saida == 5) {
					System.out.print("Total gasto em " + contDeposita + " depósitos com taxa de R$ 0,10: ");
					System.out.printf("R$ %.2f%n", (contDeposita * 0.10));

					System.out.print("Total gasto em " + contSaca + " saques com taxa de R$ 0,10: ");
					System.out.printf("R$ %.2f%n", (contSaca * 0.10));

					System.out.print("Total gasto em " + contTransfere + " transferências com taxa de R$ 0,20: ");
					System.out.printf("R$ %.2f%n", (contTransfere * 0.20));
					System.out.printf("Total de tarifas cobradas: R$ %.2f%n", conta.consultaTotalTaxas());

				} else if (saida == 6) {

					for (Conta c : mapConta.values()) {
						if (c.getAgencia() == conta.getAgencia()) {
							System.out.println(c);
						}
					}

				} else if (saida == 7) {

					List<Conta> listaContas = new ArrayList<Conta>(mapConta.values());
					listaContas.sort(Comparator.comparing(Conta::getTitular));
					System.out.println(listaContas);

				} else if (saida == 8) {

					double total = 0;
					for (Conta c : mapConta.values()) {
						total = total + c.getSaldo();
					}

					System.out.printf("Capital total armazenado no banco: R$ %.2f", total);

				} else if (saida == 9) {
					controle = 2;
				}
			}

			if (conta1.getTipo() == 2) {

				ContaPoupanca conta = (br.com.bugados.conta.ContaPoupanca) mapConta.get(cpfLogin);

				String entrada = JOptionPane.showInputDialog("------- TIPO DE OPERAÇÃO -------" + "\n\n 1 - Depósito"
						+ "\n 2 - Saque" + "\n 3 - Simulação rendimento poupança" + "\n 4 - Transferência"
						+ "\n 5 - Consulta Saldo" + "\n 6 - Relatório Gerente" + "\n 7 - Relatório Diretor"
						+ "\n 8 - Relatório Presidente" + "\n 9 - Sair" + "\n                     BugadosBank\n");
				int saida = Integer.parseInt(entrada);
				if (saida == 1) {
					String entradaDeposito = JOptionPane.showInputDialog("Digite o valor que deseja depositar:");
					double valorDeposito = Double.parseDouble(entradaDeposito);
					conta.deposita(valorDeposito);
					conta.consultaSaldo();

					contDeposita = contDeposita + 1;
				} else if (saida == 2) {
					String entradaSaque = JOptionPane.showInputDialog("Digite o valor que deseja sacar:");
					double valorSaque = Double.parseDouble(entradaSaque);
					if (conta.saca(valorSaque)) {
						conta.consultaSaldo();
						contSaca = contSaca + 1;
					} else {
						conta.consultaSaldo();
					}
				} else if (saida == 3) {
					conta.poupancudos();
				} else if (saida == 4) {
					int cpfDestino = InteracaoUsuario.lerInteiros("Informe o cpf da conta destino: ");
					clienteCadastrado = mapCliente.containsKey(cpfDestino);
					if (clienteCadastrado) {
						Conta contaDestino = mapConta.get(cpfDestino);
						double valorTransferido = InteracaoUsuario.lerDoubles("Informe o valor à ser transferido: ");
						if (conta.transferePara(contaDestino, valorTransferido)) {
							System.out.printf("Valor transferido foi de: R$ %.2f%n", valorTransferido);
							System.out.print("Saldo atual de " + conta.getTitular());
							conta.consultaSaldo();

							contTransfere = contTransfere + 1;
						} else {
							conta.consultaSaldo();
						}
					}
				} else if (saida == 5) {
					System.out.print("Saldo atual de " + conta.getTitular() + ": ");
					conta.consultaSaldo();
				} else if (saida == 6) {

					for (Conta c : mapConta.values()) {
						if (c.getAgencia() == conta.getAgencia()) {
							System.out.println(c);
						}
					}

				} else if (saida == 7) {

					List<Conta> listaContas = new ArrayList<Conta>(mapConta.values());
					listaContas.sort(Comparator.comparing(Conta::getTitular));
					System.out.println(listaContas);

				} else if (saida == 8) {

					double total = 0;
					for (Conta c : mapConta.values()) {
						total = total + c.getSaldo();
					}

					System.out.printf("Capital total armazenado no banco: R$ %.2f", total);

				} else if (saida == 9) {
					controle = 2;
				}
			}
		}
		System.out.println("\n|--------------------------------|");
		System.out.println("|                                |");
		System.out.println("|          BugadosBank           |");
		System.out.println("|                                |");
		System.out.println("|--------------------------------|");
	}
}

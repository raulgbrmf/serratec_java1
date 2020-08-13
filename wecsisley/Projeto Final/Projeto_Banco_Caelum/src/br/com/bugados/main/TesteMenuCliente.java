package br.com.bugados.main;

import javax.swing.JOptionPane;

import br.com.bugados.conta.ContaCorrente;
import br.com.bugados.conta.ContaPoupanca;

public class TesteMenuCliente {
	public static void main(String[] args) {

		int controle = 1;
		int contDeposita = 0;
		int contSaca = 0;
		int contTransfere = 0;
		
		ContaCorrente novaContaC = new ContaCorrente();
		ContaCorrente novaContaC2 = new ContaCorrente();
		ContaPoupanca novaContaP = new ContaPoupanca();
		ContaPoupanca novaContaP2 = new ContaPoupanca();
		
		novaContaC.setTitular("Pedro");
		novaContaC2.setTitular("Ana");
		novaContaP.setTitular("João");
		novaContaP2.setTitular("Maria");
		
		
			while (controle == 1) {
				
				if(novaContaC.getTipo() == "Corrente") {
					String entrada = JOptionPane.showInputDialog("------- TIPO DE OPERAÇÃO -------"
							+"\n\n 1 - Depósito"
							+"\n 2 - Saque"
							+"\n 3 - Transferência"
							+"\n 4 - Consulta Saldo"
							+"\n 5 - Consulta tarifas"
							+"\n 6 - Sair"
							+"\n                     BugadosBank\n");
					int saida = Integer.parseInt(entrada);
				
				if(saida == 1) {
					String entradaDeposito = JOptionPane.showInputDialog("Digite o valor que deseja depositar:");
					double valorDeposito = Double.parseDouble(entradaDeposito);
					novaContaC.deposita(valorDeposito);
					novaContaC.consultaSaldo();
					contDeposita = contDeposita +1;
				}else if(saida == 2) {
					String entradaSaque = JOptionPane.showInputDialog("Digite o valor que deseja sacar:");
					double valorSaque = Double.parseDouble(entradaSaque);
					novaContaC.saca(valorSaque);
					novaContaC.consultaSaldo();
					contSaca = contSaca +1;
				}else if(saida == 3) {
					String entradaNome = JOptionPane.showInputDialog("Para qual conta deseja transferir: "
																		 +"\n1 - Para Ana");
					int saidaNome = Integer.parseInt(entradaNome);
					if(saidaNome == 1) {
						String entradaTransfere = JOptionPane.showInputDialog("Digite o valor que deseja transferir:");
						double valorTransfere = Double.parseDouble(entradaTransfere);
						novaContaC.transferePara(novaContaC2, valorTransfere);
						novaContaC.consultaSaldo();
						novaContaC2.consultaSaldo();
						contTransfere = contTransfere + 1;
					}
				}else if(saida == 4) {
					System.out.print("Saldo atual de " + novaContaC.getTitular() + ": ");
					novaContaC.consultaSaldo();
				}else if(saida == 5) {
					System.out.print("Total gasto em " + contDeposita + " depósitos com taxa de R$ 0,10: ");
					System.out.printf("R$ %.2f%n", (contDeposita * 0.10));
					
					System.out.print("Total gasto em " + contSaca + " saques com taxa de R$ 0,10: ");
					System.out.printf("R$ %.2f%n", (contSaca * 0.10));
					
					System.out.print("Total gasto em " + contTransfere + " transferências com taxa de R$ 0,20: "); 
					System.out.printf("R$ %.2f%n", (contTransfere * 0.20));
					System.out.printf("Total de tarifas cobradas: R$ %.2f%n", novaContaC.consultaTotalTaxas());
				}else if(saida == 6) {
					controle = 2;
				}
			}
			if(novaContaP.getTipo() != "Poupança") {
				String entrada = JOptionPane.showInputDialog("------- TIPO DE OPERAÇÃO -------"
						+"\n\n 1 - Depósito"
						+"\n 2 - Saque"
						+"\n 3 - Simulação rendimento poupança"
						+"\n 4 - Transferência"
						+"\n 5 - Consulta Saldo"
						+"\n 6 - Sair"
						+"\n                     BugadosBank\n");
				int saida = Integer.parseInt(entrada);
				if(saida == 1) {
					String entradaDeposito = JOptionPane.showInputDialog("Digite o valor que deseja depositar:");
					double valorDeposito = Double.parseDouble(entradaDeposito);
					novaContaP.deposita(valorDeposito);
					novaContaP.consultaSaldo();
				}else if(saida == 2) {
					String entradaSaque = JOptionPane.showInputDialog("Digite o valor que deseja sacar:");
					double valorSaque = Double.parseDouble(entradaSaque);
					novaContaP.saca(valorSaque);
					novaContaP.consultaSaldo();
				}else if(saida == 3) { 
					novaContaP.poupancudos();
				}else if(saida == 4) {
					String entradaNome = JOptionPane.showInputDialog("Para qual conta deseja transferir: "
																		 +"\n1 - Para Ana");
					int saidaNome = Integer.parseInt(entradaNome);
					if(saidaNome == 1) {
						String entradaTransfere = JOptionPane.showInputDialog("Digite o valor que deseja transferir:");
						double valorTransfere = Double.parseDouble(entradaTransfere);
						novaContaP.transferePara(novaContaC2, valorTransfere);
						novaContaP.consultaSaldo();
						novaContaC2.consultaSaldo();
					}
				}else if(saida == 5) {
					System.out.print("Saldo atual de " + novaContaP.getTitular() + ": ");
					novaContaP.consultaSaldo();
				}else if(saida == 6) {
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

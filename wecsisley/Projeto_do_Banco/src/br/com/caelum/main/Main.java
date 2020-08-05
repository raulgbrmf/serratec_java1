package br.com.caelum.main;

import javax.swing.JOptionPane;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.GeradorDeContas;

public class Main {
	public static void main(String[] args) {

		GeradorDeContas instanciaConta = new GeradorDeContas();
		Conta novaConta = instanciaConta.criaConta();
		novaConta.preencheConta();

		ContaCorrente newCont2 = new ContaCorrente();
		newCont2.setTitular("Pedro");

		ContaCorrente newCont3 = new ContaCorrente();
		newCont3.setTitular("Luiz");

		ContaCorrente newCont4 = new ContaCorrente();
		newCont4.setTitular("Manuel");

		int controle = 1;

		while (controle == 1) {
			String entranda = JOptionPane.showInputDialog("Digite:"
														+ "\n1 - Para depósito"
														+ "\n2 - Para Consultar tarifa"
														+ "\n3 - Para Transferência"
														+ "\n4 - Para Consultar Saldo"
														+ "\n0 - Para Sair");
			int saida = Integer.parseInt(entranda);
			
			if (saida == 0) {
				System.out.println("\nVocê saiu");
				controle = 2;
			} else if (saida == 1) {
				String valorDeposito = JOptionPane.showInputDialog("Digite um valor para depositar: ");
				int valorDepositado = Integer.parseInt(valorDeposito);
				novaConta.deposita(valorDepositado);
				novaConta.consultaSaldo();
			} else if (saida == 2) {
				if (novaConta.consultaTipo() == "Conta Corrente") {
					System.out.printf("Tarifa para conta Corrente: R$ %.2f%n", novaConta.consultaTarifas());
				}else {
					System.out.printf("Tarifa para conta Corrente: R$ %.2f%n", novaConta.consultaTarifas());
				}
			} else if (saida == 3) {
				String selecionaConta = JOptionPane.showInputDialog(
						"Informe para qual conta deseja transferir: " + "\n1 - Para " + newCont2.getTitular()
								+ "\n2 - Para " + newCont3.getTitular() + "\n3 - Para " + newCont4.getTitular());
				int contaSelecionada = Integer.parseInt(selecionaConta);
				if (contaSelecionada == 1) {
					String valorTransferencia = JOptionPane.showInputDialog("Digite um valor para transferência: ");
					int valorTransferido = Integer.parseInt(valorTransferencia);
					novaConta.transferePara(newCont2, valorTransferido);
				} else if (contaSelecionada == 2) {
					String valorTransferencia = JOptionPane.showInputDialog("Digite um valor para transferência: ");
					int valorTransferido = Integer.parseInt(valorTransferencia);
					novaConta.transferePara(newCont3, valorTransferido);
				} else if (contaSelecionada == 3) {
					String valorTransferencia = JOptionPane.showInputDialog("Digite um valor para transferência: ");
					int valorTransferido = Integer.parseInt(valorTransferencia);
					novaConta.transferePara(newCont4, valorTransferido);
				} 
			} else if(saida == 4) {
				novaConta.consultaSaldo();
			}else {
				System.out.println("Valor inválido");
			}
		}
		newCont2.consultaSaldo();
		newCont3.consultaSaldo();
		newCont4.consultaSaldo();
	}
}

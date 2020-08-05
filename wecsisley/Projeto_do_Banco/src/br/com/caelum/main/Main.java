package br.com.caelum.main;

import javax.swing.JOptionPane;

import br.com.caelum.contas.modelo.ContaCorrente;

public class Main {
	public static void main(String[] args) {

		ContaCorrente novaConta = new ContaCorrente();
		novaConta.preencheConta();
		int controle = 1;
		

		while (controle == 1) {

			String entranda = JOptionPane.showInputDialog("Digite:\n1 - Para depósito\n2 - Para Consulta taxa\n0 - Para sair");
			int saida = Integer.parseInt(entranda);

			if (saida == 1) {
				String valorDeposito = JOptionPane.showInputDialog("Digite um valor para depositar: ");
				int valorDepositado = Integer.parseInt(valorDeposito);
				novaConta.deposita(valorDepositado);
				novaConta.taxaCorrente();
				novaConta.consultaSaldo();
			} else if (saida == 0) {
				System.out.println("\nVocê saiu");
				controle = 2;
			}else if(saida == 2) {
				if(novaConta.getTipo() == "Conta Corrente") {
					novaConta.consultaTaxaCorrente();
				}else {
					novaConta.consultaTaxaPoupanca();
				}
			} else {
				System.out.println("Valor inválido");
			}
		}
	}
}

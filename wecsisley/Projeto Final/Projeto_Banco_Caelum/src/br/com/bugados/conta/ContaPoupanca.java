package br.com.bugados.conta;

import javax.swing.JOptionPane;

public class ContaPoupanca extends Conta {

	protected int tipo;
	protected final double TAXARENDIMENTO = 0.01575;
	
	public ContaPoupanca() {
		
	}
	
	public ContaPoupanca(int cpf, int numero, int agencia, double saldo, int tipoConta) {

	}

	public void poupancudos() {
		double rendimento;

		String entradaDias = JOptionPane.showInputDialog("Informe o número de dias: ");
		int numDias = Integer.parseInt(entradaDias);

		String entradaValor = JOptionPane.showInputDialog("Informe o valor: ");
		double valor = Double.parseDouble(entradaValor);

		rendimento = (this.TAXARENDIMENTO / 365 * numDias) * valor;

		System.out.printf("Valor investido: R$ %.2f%n", valor);
		System.out.printf("Valor do rendimento: R$ %.2f%n", rendimento);
		System.out.print("Valor total ao fim dos " + numDias + " dias:");
		System.out.printf(" R$ %.2f", (valor + rendimento));
	}

	public int getTipo() {
		return tipo;
	}

	@Override
	public void consultaTipo() {
		// TODO Auto-generated method stub
	}
}

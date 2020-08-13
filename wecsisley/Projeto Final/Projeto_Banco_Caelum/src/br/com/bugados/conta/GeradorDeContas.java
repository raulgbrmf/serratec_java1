package br.com.bugados.conta;

import javax.swing.JOptionPane;

public class GeradorDeContas extends Conta {

	public GeradorDeContas(String titular, int numero, int agencia, String tipo, int cpfTitular) {
		super();
		// TODO Auto-generated constructor stub
	}

	public Conta criaConta() {

		String entradaTeclado;
		int saidaTeclado;

		entradaTeclado = JOptionPane.showInputDialog("\nDigite:\n1 - Para nova conta \n" + "0 - Para encerrar");
		saidaTeclado = Integer.parseInt(entradaTeclado);

		if (saidaTeclado == 1) {
			entradaTeclado = JOptionPane
					.showInputDialog("Digite:\n1 - Para conta corrente\n" + "2 - Para conta poupança");
			saidaTeclado = Integer.parseInt(entradaTeclado);
			if (saidaTeclado == 1) {
				return new ContaCorrente();
			} else if (saidaTeclado == 2) {
				return new ContaPoupanca();
			} else {
				System.out.println("Valor inválido");
			}
		}
		if (saidaTeclado == 0) {
			System.out.println("Saiu");
		} else {
			System.out.println("Valor digitado inválido");
		}
		return null;
	}

	@Override
	public void consultaTipo() {
	}
}

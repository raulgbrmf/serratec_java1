package br.com.caelum.contas.modelo;

import javax.swing.JOptionPane;

public class ContaCorrente extends Conta {

	protected final String tipo = "Conta Corrente";

	public String getTipo() {
		return tipo;
	}

	//colocar overide
	public String consultaTipo() {
		return tipo;
	}
	
	public void preencheConta() {

		String entradaTitular = JOptionPane.showInputDialog("Informe o nome do títular: ");
		String entradaNuemro = JOptionPane.showInputDialog("Informe o numero para a conta: ");
		int saidaNumero = Integer.parseInt(entradaNuemro);
		String entradaAgencia = JOptionPane.showInputDialog("Informe o numero para a agencia: ");
		int saidaAgencia = Integer.parseInt(entradaAgencia);

		this.titular = entradaTitular;
		this.numero = saidaNumero;
		this.agencia = saidaAgencia;

		System.out.println("Titular: " + this.titular + "\nNumero da conta: " + this.numero + "\nNumero Agencia: "
				+ this.agencia + "\nTipo de conta: " + consultaTipo());
	}
}

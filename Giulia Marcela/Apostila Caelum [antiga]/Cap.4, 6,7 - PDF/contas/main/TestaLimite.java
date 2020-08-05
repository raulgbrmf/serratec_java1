package br.com.g2ac.contas.main;

import br.com.g2ac.contas.modelo.Conta;

public class TestaLimite {

	public static void main(String[] args) {

		Conta conta = new Conta();
		conta.getSaldo();
		conta.limite = 1000.0;
		conta.saque(50000);

	}
}

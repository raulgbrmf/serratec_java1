package br.com.g2ac.usuario.main;

import br.com.g2ac.contas.modelo.Conta;
import br.com.g2ac.contas.modelo.ContaCorrente;
import br.com.g2ac.contas.modelo.ContaPoupanca;

public class TestaSaque {

	public static void main(String[] args) {

		Conta corrente = new ContaCorrente();
		Conta poupanca = new ContaPoupanca();

		try {
			corrente.saque(200);
			System.out.println("consegui sacar da corrente!");
			poupanca.saque(50);
			System.out.println("consegui sacar da poupanca!");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}

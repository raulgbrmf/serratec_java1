package br.com.g2ac.usuario.main;

import br.com.g2ac.contas.modelo.ContaCorrente;
import br.com.g2ac.contas.modelo.ContaPoupanca;

public class TesteContas {

	public static void main(String[] args) {

		/*
		 * Exercise 1 - Cap.9 [Teste do Capitulo] 
		 * Conta conta = new ContaCorrente();
		 * Criando uma referência conta do tipo Conta e um objeto ContaCorrente.
		 **/

		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();

		cc.deposita(1000);
		cp.deposita(1000);
		cc.atualiza(0.01);
		cp.atualiza(0.01);

		System.out.println("Conta Corrente: " + cc.getSaldo());
		System.out.println("Conta Poupança: " + cp.getSaldo());

	}
}

package br.com.g2ac.usuario.main;

import br.com.g2ac.contas.modelo.Conta;
import br.com.g2ac.contas.modelo.ContaCorrente;

public class TestaArrays {

	public static void main(String[] args) {

		Conta[] contas = new Conta[10];

		for (int counter = 0; counter < contas.length; counter++) {
			Conta conta = new ContaCorrente();
			contas[counter] = conta;
			conta.deposita(counter * 100 + 1);
		}

		double media = 0;
		for (Conta quantidade : contas) {
			media += quantidade.getSaldo();
			System.out.println("Saldo conta: " + quantidade.getSaldo());
		}

		System.out.println("A média dos saldos de todas as contas é igual a: " + media/contas.length);
	}
}

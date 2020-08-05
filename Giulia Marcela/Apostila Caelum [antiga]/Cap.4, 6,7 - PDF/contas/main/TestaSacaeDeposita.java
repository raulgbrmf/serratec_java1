package br.com.g2ac.contas.main;

import br.com.g2ac.contas.modelo.Conta;

public class TestaSacaeDeposita {

	public static void main(String[] args) {
		Conta conta = new Conta();

		conta.titular.nome = "Bruce Banner";
		conta.setSaldo(1000);

		conta.saque(200);

		conta.deposita(500);

		System.out.println("Nome: " + conta.titular.nome + "\nSaldo atual: " + conta.getSaldo());

	}
}

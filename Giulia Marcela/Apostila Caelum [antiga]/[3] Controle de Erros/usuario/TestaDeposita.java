package br.com.g2ac.usuario.main;

import br.com.g2ac.contas.modelo.Conta;
import br.com.g2ac.contas.modelo.ContaPoupanca;

public class TestaDeposita {

	public static void main(String[] args) {

		Conta poupanca = new ContaPoupanca();

		try {
			poupanca.deposita(-900);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
	}
}

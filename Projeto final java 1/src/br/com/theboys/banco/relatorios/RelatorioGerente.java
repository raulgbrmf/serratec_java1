package br.com.theboys.banco.relatorios;

import java.util.List;

import br.com.theboys.banco.contas.Conta;

public class RelatorioGerente {
	public static void relatorioGerente(List<Conta> contas, Conta conta) {
		int numeroDeContasGerente = 0;
		for (Conta c : contas) {
			if (conta.getAgencia().equals(c.getAgencia())) {
				numeroDeContasGerente++;
				System.out.println("Agência: " + c.getAgencia() + " Cpf: "
						+ c.getCpf() + " Titular: " + c.getTitular()
						+ " Saldo: " + c.getSaldo());

			}
		}

		System.out
				.println("Número de contas Gerente: " + numeroDeContasGerente);
	}
}

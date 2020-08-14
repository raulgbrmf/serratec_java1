package br.com.theboys.banco.relatorios;

import java.util.List;

import br.com.theboys.banco.contas.Conta;

public class RelatorioPresidente {
	public static void relatorioPresidente(List<Conta> contas, Conta conta) {
		double capitalArmazenado = 0;
		for (Conta c : contas) {
			capitalArmazenado += c.getSaldo();
		}
		System.out.println("Valor total do capital armazenado no banco: "
				+ capitalArmazenado);
	}
}

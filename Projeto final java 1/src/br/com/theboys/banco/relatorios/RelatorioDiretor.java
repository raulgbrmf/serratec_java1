package br.com.theboys.banco.relatorios;

import java.util.Collections;
import java.util.List;

import br.com.theboys.banco.contas.Conta;

public class RelatorioDiretor {
	public static void relatorioDiretor(List<Conta> contas, Conta conta) {
		Collections.sort(contas);
		for (Conta c : contas) {
			System.out.println("Titular: " + c.getTitular() + " Cpf: "
					+ c.getCpf() + " Agência: " + c.getAgencia());

		}
	}
}

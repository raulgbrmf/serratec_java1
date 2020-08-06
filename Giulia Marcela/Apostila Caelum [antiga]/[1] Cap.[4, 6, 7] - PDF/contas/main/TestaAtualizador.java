package br.com.g2ac.contas.main;

import br.com.g2ac.contas.modelo.Conta;
import br.com.g2ac.contas.modelo.ContaCorrente;
import br.com.g2ac.contas.modelo.ContaPoupanca;
import br.com.g2ac.usuario.AtualizadorDeContas;

public class TestaAtualizador {

	public static void main(String[] args) {

		Conta c = new Conta();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();

		c.deposita(1000.0);
		cc.deposita(1000.0);
		cp.deposita(1000.0);

		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

		adc.roda(c);
		adc.roda(cc);
		adc.roda(cp);

		System.out.println("\nSaldo Total: " + adc.getSaldoTotal());

	}
}

package br.com.bugados.main;

import br.com.bugados.conta.Conta;
import br.com.bugados.conta.ContaCorrente;
import br.com.bugados.conta.ContaPoupanca;
import br.com.bugados.impostos.Selic;

public class TestaAtualizadorDeContas {
	public static void main(String[] args) {

		//Conta c = new Conta();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();

		Selic adc = new Selic(0.01);

		//c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);

		//adc.roda(c);
		adc.roda(cc);
		adc.roda(cp);

		System.out.println("Saldo Total: " + adc.getSaldoTotal());
	}
}

package br.com.g2ac.contas.main;

import br.com.g2ac.contas.modelo.Cliente;
import br.com.g2ac.contas.modelo.Conta;
import br.com.g2ac.contas.modelo.ContaCorrente;
import br.com.g2ac.contas.modelo.ContaPoupanca;

public class TesteContas {

	public static void main(String[] args) {

		Conta conta = new Conta ();
		Cliente cliente = new Cliente();
		conta.setTitular(cliente); 
		
		//Exercise 4 - Cap.7 
		Conta c = new Conta();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);
		c.atualiza(0.01);
		cc.atualiza(0.01);
		cp.atualiza(0.01);
		
		System.out.println("Conta: " + c.getSaldo());
		System.out.println("Conta Corrente: " + cc.getSaldo());
		System.out.println("Conta Poupança: " + cp.getSaldo());
		
	}
}

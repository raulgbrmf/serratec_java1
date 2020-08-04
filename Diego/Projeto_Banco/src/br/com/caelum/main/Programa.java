package br.com.caelum.main;

import br.com.caelum.contas.tipo.Conta;
import br.com.caelum.contas.util.Data;

public class Programa {
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.setSaldo(100);

		System.out.println(conta1.getTitular() + ", seu saldo atual é: R$" + conta1.getSaldo());

		if (conta1.sacar(200))
			System.out.println("Consegui sacar");
		else
			System.out.println("Nao consegui sacar");

		conta1.depositar(500);

		System.out.println(conta1.getSaldo());

		Conta conta2 = new Conta();
		conta2.setSaldo(3000);

		System.out.println(conta2.getSaldo());

		if (conta1 == conta2) {
			System.out.println("Contas iguais");
		}

		Conta conta3 = new Conta();
		conta3.setTitular("Joao");
		conta3.setSaldo(100);
		System.out.println("bem vindo cliente: " + conta3.getTitular());
		System.out.println("saldo atual: R$" + conta3.getSaldo());
		System.out.printf("rendimento mensal: R$%.2f", conta1.calculaRendimentoMensal());
		System.out.println(conta3);
		
		Conta conta4 = new Conta();
		Data d1 = new Data(10,04,2020);
		conta3.setTitular("Joao");
		conta3.setSaldo(100);
		conta3.setAbertura(d1);
		System.out.println(conta3.recuperaDadosParaImpressao());
	}
}

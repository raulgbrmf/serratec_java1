package br.com.caelum.main;

import br.com.caelum.contas.modelo.Conta;

import br.com.caelum.javafx.api.main.SistemaBancario;

import br.com.caelum.contas.util.Data;

public class Programa {
	public static void main(String[] args) {
		
		 SistemaBancario.mostraTela(false);
		
		Conta conta1 = new Conta();
		conta1.setTitular("Joao");
		conta1.depositar(100);
		System.out.println("bem vindo cliente: " + conta1.getTitular());
		System.out.println("saldo atual: R$" + conta1.getSaldo());
		System.out.printf("rendimento mensal: R$%.2f", conta1.getRendimentoMensal());
		System.out.println(conta1);
		
		

	

		
	}
}

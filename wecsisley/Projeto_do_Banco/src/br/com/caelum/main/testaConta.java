package br.com.caelum.main;

import br.com.caelum.contas.modelo.Conta;

public class testaConta {
	public static void main(String[] args) {
		
		Conta novaConta = new Conta();
		
		novaConta.criaConta();
		novaConta.preencheConta();
	
		System.out.println(novaConta.consultaTipo());
	}
}

package br.com.caelum.contas.main;

import br.com.caelum.contas.*; 

public class TesteDoBanco {

	public static void main(String[] args) {
		Banco meuBanco = new Banco();
		
		meuBanco.nome = "Banco do Brasil";
		System.out.println(meuBanco.nome);
	}

}

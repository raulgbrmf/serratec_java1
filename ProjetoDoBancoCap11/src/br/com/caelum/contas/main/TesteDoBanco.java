package br.com.caelum.contas.main;

import br.com.caelum.contas.*;
import br.com.caelum.contas.modelo.Conta;

public class TesteDoBanco {

	public static void main(String[] args) {
		Banco meuBanco = new Banco();
		
		Conta c1 = new Conta();
		
		meuBanco.nome = "Banco do Brasil";
		System.out.println(meuBanco.nome);
	}

}

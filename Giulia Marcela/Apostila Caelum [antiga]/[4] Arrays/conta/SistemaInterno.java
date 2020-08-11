package br.com.g2ac.conta;

import br.com.g2ac.interfaces.Autenticavel;

public class SistemaInterno {

	public void login(Autenticavel a) {
		int senha = 0000;
		boolean ok = a.autentica(senha);
		System.out.println(ok);
	}
}

package br.com.g2ac.banco.usuario;

public class SistemaInterno {

	void login(Autenticavel a) {
		int senha = 2;
		boolean ok = a.autentica(senha);
		System.out.println(ok);
	}
}

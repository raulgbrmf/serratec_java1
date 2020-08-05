package br.com.caelum.sistema;

import br.com.caelum.usuario.Autenticavel;

public class SistemaInterno {
	
	public void login(Autenticavel a, int senha) {
		a.autentica(senha);
	}
}

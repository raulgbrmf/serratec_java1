package br.com.caelum.usuario;

public class SistemaInterno {
	
	public void entrar(Autenticavel a, int senha) {
		if(a.autentica(senha)) {
			System.out.println("Usu�rio logou");
		}
		else {
			System.out.println("Senha incorreta");
		}
	}
	
	

}

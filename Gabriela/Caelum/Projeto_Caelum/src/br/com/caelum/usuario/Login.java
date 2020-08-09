package br.com.caelum.usuario;

public class Login {
	
	public void entrar(Autenticavel a, int senha) {
		
		if (a.autentica(senha)){
			
			System.out.println("Logou!");
			
			
		}
		else {
			System.out.println("Não logou!");
		}
		
		
	}

}

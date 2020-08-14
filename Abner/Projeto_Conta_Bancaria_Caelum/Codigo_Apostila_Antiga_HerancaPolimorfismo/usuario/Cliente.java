package usuario;

import interfaces.Autenticavel;

public class Cliente implements Autenticavel {
	
	private String nome;
	private int senha = 000;
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}	
}

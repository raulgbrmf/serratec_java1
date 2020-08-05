package usuario;

import interfaces.Autenticavel;

public class Diretor extends Funcionario implements Autenticavel {
	
	private int senha = 111;
	
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

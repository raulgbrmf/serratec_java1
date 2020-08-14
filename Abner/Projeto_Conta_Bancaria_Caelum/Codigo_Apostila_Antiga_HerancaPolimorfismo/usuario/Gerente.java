package usuario;

import interfaces.Autenticavel;

public class Gerente extends Funcionario implements Autenticavel {
	
	private int senha = 222;	

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}	

	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public double getBonificacao() {
		return super.getBonificacao() + 1000;
	}

}

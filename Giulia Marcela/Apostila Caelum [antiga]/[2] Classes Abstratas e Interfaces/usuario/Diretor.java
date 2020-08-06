package br.com.g2ac.usuario;

import br.com.g2ac.interfaces.Autenticavel;

public class Diretor extends Funcionario implements Autenticavel {
	private int senha = 3;

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}

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

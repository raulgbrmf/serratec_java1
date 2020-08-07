package br.com.g2ac.banco.usuario;

public class Diretor extends Funcionario implements Autenticavel {
	private int senha = 2;

	public boolean autentica(int senha) {
		if (this.senha != senha) {
			System.out.println("Acesso negado.");
			return false;
		} else {
			System.out.println("Acesso liberado.");
			return true;
		}
	}
}

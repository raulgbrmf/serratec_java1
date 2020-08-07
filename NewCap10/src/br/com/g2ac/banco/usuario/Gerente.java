package br.com.g2ac.banco.usuario;

public class Gerente extends Funcionario implements Autenticavel {

	private int senha = 3;

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

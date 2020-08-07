package br.com.g2ac.banco.usuario;

public class Cliente implements Autenticavel {
	String nome;
	String sobrenome;
	String CPF;
	private int senha = 1;

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
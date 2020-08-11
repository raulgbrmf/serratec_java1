package br.com.g2ac.usuario;

import br.com.g2ac.interfaces.Autenticavel;

public class Cliente implements Autenticavel {
	private String nome;
	private int senha = 1;
	// private String sobrenome;
	// private String cpf;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
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

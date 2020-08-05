package br.com.caelum.pessoa;

import br.com.caelum.util.Autenticavel;

public class Gerente extends FuncionarioAutenticavel implements Autenticavel {

	int senha;
	int numeroDeFuncionariosGerenciados;

	public Gerente(String nome) {
		super(nome);
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso permitido!");
			return true;
		} else {
			System.out.println("Acesso negado!");
			return false;
		}
	}

	@Override
	public double getBonificacao() {
		return getBonificacao() * 1.4 + 1000;
	}
}

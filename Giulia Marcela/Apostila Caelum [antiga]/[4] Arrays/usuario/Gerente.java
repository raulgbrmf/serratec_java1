package br.com.g2ac.usuario;

import br.com.g2ac.interfaces.Autenticavel;

public class Gerente extends Funcionario implements Autenticavel {
	private int senha = 2;

	public void setNome(String string) {
		this.nome = string;
	}

	public void setSenha(int i) {
		this.senha = i;
	}

	@Override
	public double getBonificacao() {
		return this.salario * 0.15;
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

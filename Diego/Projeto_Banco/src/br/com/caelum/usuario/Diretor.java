package br.com.caelum.usuario;

public class Diretor extends Funcionario implements Autenticavel {

	private int senha;

	@Override
	protected double getBonificacao() {
		return this.salario * 1.4 + 800;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso Negado!");
		}
		return false;
	}
}

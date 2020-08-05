package br.com.caelum.usuario;

public class Gerente extends Funcionario implements Autenticavel {
	private int senha;
	private int numeroDeFuncionariosGerenciados;

	protected double getBonificacao() {
		return this.salario * 1.4 + 1000;
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

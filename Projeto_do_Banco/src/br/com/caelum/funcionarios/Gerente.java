package br.com.caelum.funcionarios;

import br.com.caelum.contas.modelo.Funcionario;
import br.com.caelum.interfaces.Autenticavel;

public class Gerente extends Funcionario implements Autenticavel {
	int senha;

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	int numeroDeFuncionariosGerenciados;

	@Override
	public double getBonificacao() {
		return 0;
	}

	@Override
	public boolean autentica(int senha) {

		if (this.senha == senha) {
			return true;
		}
		return false;
	}

}

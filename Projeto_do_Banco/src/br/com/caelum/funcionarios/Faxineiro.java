package br.com.caelum.funcionarios;

import br.com.caelum.contas.modelo.Funcionario;

public class Faxineiro extends Funcionario {

	
	private int senha;
	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}

}

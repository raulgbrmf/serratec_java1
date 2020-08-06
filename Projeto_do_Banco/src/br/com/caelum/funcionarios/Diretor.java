package br.com.caelum.funcionarios;

import br.com.caelum.contas.modelo.Funcionario;
import br.com.caelum.interfaces.Autenticavel;

public class Diretor extends Funcionario implements Autenticavel  {

	private int senha;
	
	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}
		return false;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}


}

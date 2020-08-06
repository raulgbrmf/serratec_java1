package br.com.caelum.contas.modelo;

import br.com.caelum.interfaces.Autenticavel;

public class Cliente implements Autenticavel{
	
	 private int senha;

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

package br.com.caelum.usuario;

public class Diretor extends Gerente implements Autenticavel {

	public Diretor (){
		
	}

	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}
		else {
			return false;
	}
	}
}

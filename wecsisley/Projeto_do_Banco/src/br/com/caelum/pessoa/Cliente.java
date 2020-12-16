package br.com.caelum.pessoa;

import br.com.caelum.util.Autenticavel;

public class Cliente implements Autenticavel{
	
	public String nome;
	public String sobreNome;
	public String cpf;
	int senha;
	
	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			System.out.println("Acesso permitido !");
			return true;
		} else {
			System.out.println("Acesso negado !");
			return false;
		}
	}

}

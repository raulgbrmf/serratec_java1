package banco.administrativo;

import banco.administrativo.abstracoes.Pessoa;
import banco.administrativo.interfaces.Autenticavel;

public class Cliente implements Autenticavel {

	private Pessoa pessoa;
	
	
	public Cliente(Pessoa pessoa) {
		super();
		this.pessoa = pessoa;
	}


	@Override
	public boolean autentica(int senha) {
	
		return false;
	}


	public Pessoa getPessoa() {
		return pessoa;
	}


	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}

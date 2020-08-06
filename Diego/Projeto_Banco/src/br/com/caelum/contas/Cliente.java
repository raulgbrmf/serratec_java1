package br.com.caelum.contas;

import br.com.caelum.contas.util.Util;
import br.com.caelum.usuario.Autenticavel;

public class Cliente implements Autenticavel {
	private String nome;
	private int senha;
	private String endereco;
	private String cpf;
	private int idade;

	public void mudaCPF(String cpf) {

		if (this.idade <= 60)
			Util.validaCPF(cpf);

		this.cpf = cpf;
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

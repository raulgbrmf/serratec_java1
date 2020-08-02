package banco.administrativo.abstracoes;

import banco.administrativo.Endereco;

public abstract class Pessoa {
	protected String nome;
	private Endereco endereco;
	
	public Pessoa(String nome, Endereco endereco) {
		this.nome = nome;
		this.endereco = endereco;
		
	}
	
	public String imprimeDados() {
		return "Nome: " + nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}

package br.com.raul.usuario;

public class Cliente extends Usuario {

	public int senha;
	public long cpf;
	
	public Cliente(int senha, long cpf) {
		this.senha = senha;
		this.cpf = cpf;
		this.tipo = "Cliente";
	}
	
}

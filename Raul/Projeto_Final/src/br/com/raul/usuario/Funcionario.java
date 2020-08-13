package br.com.raul.usuario;

public abstract class Funcionario extends Usuario {

	public int senha;
	public long cpf;
	public String cargo;
	
	public Funcionario(int senha, long cpf) {
		this.senha = senha;
		this.cpf = cpf;
		this.tipo = "Funcionario";
	}
	
}

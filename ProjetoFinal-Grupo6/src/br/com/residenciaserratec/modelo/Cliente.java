package br.com.residenciaserratec.modelo;

public class Cliente {
	private int senha;
	private long cpf;
	private String nome;

	public Cliente(int senha, long cpf, String nome) {
		this.senha = senha;
		this.cpf = cpf;
		this.nome = nome;
	}

	
	
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", nome=" + nome + "]";
	}

}

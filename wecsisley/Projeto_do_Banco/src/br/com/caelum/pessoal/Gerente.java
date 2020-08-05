package br.com.caelum.pessoal;

public class Gerente extends Funcionario {

	public Gerente(String nome) {
		super(nome);
	}

	int senha;
	int numeroDeFuncionariosGerenciados;

	public boolean autentica(int senha) {
		if(this.senha == senha) {
			System.out.println("Acesso permitido!");
			return true;
		}else {
			System.out.println("Acesso negado!");
			return false;
		}
	}
	
	public double getBonificacao() {
		return super.getBonificacao() + 1000;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
}

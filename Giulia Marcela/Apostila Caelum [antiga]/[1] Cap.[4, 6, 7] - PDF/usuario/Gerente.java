package br.com.g2ac.usuario;

public class Gerente extends Funcionario {
	int senha;

	public void setNome(String string) {
		this.nome = string;	
	}

	public void setSenha(int i) {
		this.senha = i;
	}
	
	@Override 
	public double getBonificacao() {
		return this.salario * 0.15;
	}
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}

}

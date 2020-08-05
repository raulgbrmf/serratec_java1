package br.com.caelum.usuario;

public class Gerente extends Funcionario{  //GERENTE E SUBCLASSE DE FUNCIONARIO OU CLASSE FILHA
	
	private int senha;
	private int numeroDeFuncionariosGerenciados;
	
	
	public boolean autentica(int senha) {
		
		if (this.senha == senha) {
			
			System.out.println("Acesso permitido!!!");
			return true;
			
		}
		else {
			System.out.println("Acesso Negado!!!");
			return false;
		}
		
	}


	public int getSenha() {
		return senha;
	}


	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	@Override  // esse metodo e a reescrita do metodo da classe mae 
	public double getBonificacao() {
		//return this.salario * 0.15; //gerente 0.15 de bonus
		//return this.salario * 0.10 + 1000; //exemplo do cap 9.3 
		return super.getBonificacao() + 1000; //exemplo: chamando a getBonificacao do Funcionario usando "super"  - assim sempre vai herdar a getBonificacao atualizada da classe mae
	}


	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}


	public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}
	
	

}

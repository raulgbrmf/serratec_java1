package br.com.caelum.usuario;
public class Gerente extends Funcionario implements Autenticavel  {

	private int senha;
	int numeroDeFuncionariosGerenciados;
	
	public Gerente(String nome, double salario){
		super(nome, salario);       
		
	}	
	
	public Gerente() {
		super();
	}
	
	
	public double getBonificacao() {
		return this.salario * 1.4 + 1000;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}



	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}
			return false;
	}
	
	
}

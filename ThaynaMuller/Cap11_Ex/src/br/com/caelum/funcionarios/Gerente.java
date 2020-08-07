package br.com.caelum.funcionarios;
import br.com.caelum.controle.Autenticavel;

public class Gerente extends Funcionario implements Autenticavel {
	
	protected int senha;
	protected int numeroDeFuncionariosGerenciados;
	
	public boolean autentica(int senha ) {
		if(this.senha == senha) {
			System.out.println("Bem vindo " +Funcionario.nome);
			return true;
		}
		
		else {
			System.out.println("Acesso negado");
			return false;
		}
			
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	
}

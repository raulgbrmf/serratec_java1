package br.com.caelum.usuario;

public class Gerente extends Funcionario{
	//private String nome;
	//private String cpf;
	//private double salario;
		//por usar o extends comentei os atributos acima
	//private int senha;				*comentei pois foi pedido para nao inserir private
	//private int numeroDeFuncionariosGerenciados;  *comentei pois foi pedido para nao inserir private
	int senha;
	int numeroDeFuncionarioGerenciados;
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso Negado!");
			return false;
		}	
	}
	
	public int getSenha() {   // GERALMENTE não leva referencias dentro dos parenteses
		return this.senha;
	}
	public void setSenha( int senha) {
		this.senha = senha;
	}
	
	public double getBonificacao() {
		//return this.salario *0.15   //gerente 0.15 de bonus
		//return this.salario * 0.10 + 1000;   //exemplo Cap9.3
		//return super.getBonificacao() + 1000;  //exemplo:chamando getbonificacao
		return this.salario * 0.15;
	}
	
}

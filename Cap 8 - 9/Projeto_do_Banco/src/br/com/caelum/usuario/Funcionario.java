package br.com.caelum.usuario;

public class Funcionario {  //FUNCIONARIO E A SUPERCLASSE DE GERENTE OU CLASSE MAE
	
	protected String nome;
	protected String cpf;
	protected double salario;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getBonificacao() {
		
		return this.salario * 0.10; //funcionarios normais 0.10  de bonus
	}
	

}

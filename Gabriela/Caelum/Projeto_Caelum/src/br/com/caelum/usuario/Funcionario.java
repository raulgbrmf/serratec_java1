package br.com.caelum.usuario;


public abstract class Funcionario {

	protected String nome;
	private String cpf;
	protected double salario = 1000;
	
	Funcionario(String nome){
		
		this.nome = nome;
	}
	
	Funcionario(){
		
	}
	 abstract double getBonificacao(); /*{
		
		return this.salario = this.salario * 0.1;
	}*/

	public double getSalario() {
		return salario;
	}
	
}

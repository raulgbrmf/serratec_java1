package br.com.caelum.usuario;

public abstract class Funcionario {

	protected String nome;
	protected String cpf;
	protected double salario;
	
	
	Funcionario(){
	}
	
	Funcionario(String nome, double salario){
		this.nome = nome;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getSalario() {
		return salario;
	}
	

	public abstract double getBonificacao();
		
	
}

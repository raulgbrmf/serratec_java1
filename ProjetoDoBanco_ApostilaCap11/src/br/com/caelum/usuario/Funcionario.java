package br.com.caelum.usuario;

public class Funcionario {
	protected String nome ;
	protected String cpf ;
	protected double salario ;
	
	protected String nome() {
		return this.nome;
	}
	protected String cpf() {
		return this.cpf;
	}
	protected double salario() {
		return this.salario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getBonificacao() {
		return this.salario * 0.10;
	}	
	
}

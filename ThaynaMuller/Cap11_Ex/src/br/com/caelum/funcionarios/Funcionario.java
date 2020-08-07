package br.com.caelum.funcionarios;

public class Funcionario {
	
	protected static String nome;
	protected String cpf;
	protected double salario;
	
	public void setnome(String nome) {
		Funcionario.nome = nome;
		
	}
	
	public void setCPF(String CPF) {
		this.cpf = CPF;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

	
	public double getBonificacao() {
		return this.salario * 0.1;
		
	}
}




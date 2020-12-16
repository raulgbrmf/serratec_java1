package java3;

import java.util.Scanner;

public class funcionario {

	String nome;	
	double salario;
	double bonificacao;	
	
	funcionario(String nome) {
		this.nome = nome;
		this.salario = 1045.00;
	}
	
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
		return bonificacao;
	}
	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}

}

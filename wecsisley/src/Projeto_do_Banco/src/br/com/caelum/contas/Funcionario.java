package br.com.caelum.contas;

public class Funcionario {

	public String nome;
	public String cpf;
	final double salario = 1000;

	public Funcionario(String nome) {
		this.nome = nome;
	}

	public double getBonificacao() {
		return this.salario * 1.1 - this.salario;
	}

	public void imprimeSalario() {
		System.out.print("Salario " + this.nome + ": ");
		System.out.printf("%.2f%n", (this.salario + getBonificacao()));
	}

	public void consultaBonificacao() {
		System.out.printf("Bonificação " + this.nome + ": %.2f%n", this.getBonificacao());
	}
}

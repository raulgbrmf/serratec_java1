package br.com.g2ac.banco.usuario;

public class Funcionario {
	String nome;
	String departamento;
	double salario;
	String admissao;
	String rg;
	boolean ativo = true;

	void bonifica(double aumento) {
		// o que fazer aqui dentro?
	}

	void demite() {

		if (this.ativo == true) {
			this.ativo = false;
			System.out.println("Funcionário não ativo.");

		}
	}

}

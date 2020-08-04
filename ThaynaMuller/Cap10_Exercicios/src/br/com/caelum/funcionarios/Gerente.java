package br.com.caelum.funcionarios;

public class Gerente extends Funcionario {
	
	public double getBonificacao() {
		return this.salario*1.4*1000;
	}

}

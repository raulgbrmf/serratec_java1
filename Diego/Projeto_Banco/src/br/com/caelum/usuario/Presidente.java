package br.com.caelum.usuario;

public class Presidente extends Funcionario {

	@Override
	protected double getBonificacao() {
		return this.salario * 1.4 + 2000;
	}

}

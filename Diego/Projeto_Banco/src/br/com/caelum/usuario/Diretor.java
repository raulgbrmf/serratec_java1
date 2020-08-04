package br.com.caelum.usuario;

public class Diretor extends Gerente {
	@Override
	protected double getBonificacao() {
		return this.salario * 1.4 + 800;
	}
}

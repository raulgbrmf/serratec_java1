package br.com.caelum.usuario;

public class SubGerente extends Gerente {

	public SubGerente(String nome, double salario) {
		super(nome, salario);
	}
	
	public double getBonificacao() {
		return this.salario * 1.4;
	}
}

package br.com.caelum.contas;

public class Gerente extends Funcionario {

	int senha;
	int numeroDeFuncionariosGerenciados;

	public Gerente(String nome) {
		super(nome);
	}

	public double getBonificacao() {
		return super.getBonificacao() + 1000;
	}
}

package Projeto_Banco;

public class Gerente extends Funcionario {

	int senha;
	int numeroDeFuncionariosGerenciados;

	Gerente(String nome) {
		super(nome);
	}

	public double getBonificacao() {
		return super.getBonificacao() + 1000;
	}
}

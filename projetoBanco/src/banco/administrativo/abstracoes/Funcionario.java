package banco.administrativo.abstracoes;

import banco.administrativo.Endereco;
import banco.administrativo.PessoaFisica;
import banco.administrativo.interfaces.Autenticavel;

public abstract class Funcionario extends PessoaFisica implements Autenticavel {

	private double salario;

	public Funcionario(String nome, Endereco endereco, String cpf) {
		super(nome, endereco, cpf);
	}

	@Override
	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		return false;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public abstract double getBonificacao();

}

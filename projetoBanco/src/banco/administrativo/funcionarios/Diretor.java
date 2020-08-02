package banco.administrativo.funcionarios;

import banco.administrativo.Endereco;
import banco.administrativo.abstracoes.Funcionario;

public class Diretor extends Funcionario {

	public Diretor(String nome, Endereco endereco, String cpf) {
		super(nome, endereco, cpf);
	}


	@Override
	public boolean autentica(int senha) {
		return false;
	}


	@Override
	public double getBonificacao() {
		return 0;
	}

}

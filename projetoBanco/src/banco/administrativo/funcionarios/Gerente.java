package banco.administrativo.funcionarios;

import banco.administrativo.Endereco;
import banco.administrativo.abstracoes.Funcionario;

public class Gerente extends Funcionario {

	public Gerente(String nome, Endereco endereco, String cpf) {
		super(nome, endereco, cpf);

	}

	@Override
	public double getBonificacao() {
	
		return 0;
	}

}

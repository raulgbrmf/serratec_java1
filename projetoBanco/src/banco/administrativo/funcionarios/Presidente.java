package banco.administrativo.funcionarios;

import banco.administrativo.Endereco;
import banco.administrativo.abstracoes.Funcionario;

public class Presidente extends Funcionario {

	public Presidente(String nome, Endereco endereco, String cpf) {
		super(nome, endereco, cpf);
		
	}

	@Override
	public double getBonificacao() {
		return 0;
	}

}

package br.com.residenciaserratec.modelo;

import java.util.HashMap;


public class Diretor extends Funcionario {

	@Override
	public String toString() {
		return "Diretor [cpf=" + cpf + ", senha=" + senha + ", cargo=" + cargo + "]";
	}

	public Diretor(long cpf, int senha) {
		super(cpf, senha);
		this.cargo = "Diretor";

	}

	
	public int numeroDeContas(HashMap<Long, Conta> contas) {
		return contas.size();
	}

}

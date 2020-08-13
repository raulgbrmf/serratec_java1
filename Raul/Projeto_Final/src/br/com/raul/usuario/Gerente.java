package br.com.raul.usuario;

public class Gerente extends Funcionario {

	public int numAgencia;
	
	public Gerente(int senha, long cpf, int numAgencia) {
		super(senha, cpf);
		this.numAgencia = numAgencia;
		this.cargo = "Gerente";
	}

}

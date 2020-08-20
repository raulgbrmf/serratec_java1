package br.com.jabutis.usuarios;

public class Diretor extends Funcionario {
	
	public Diretor(int senha, long cpf, String cargo) {
		super(senha, cpf);
		
		this.cargo = "Diretor";
		
	}

}

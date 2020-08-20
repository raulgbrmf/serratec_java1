package br.com.jabutis.usuarios;

public class Presidente extends Funcionario{
	
	public Presidente(int senha, long cpf, String cargo) {
		super(senha, cpf);
		
		this.cargo = "Presidente";
		
	}

}

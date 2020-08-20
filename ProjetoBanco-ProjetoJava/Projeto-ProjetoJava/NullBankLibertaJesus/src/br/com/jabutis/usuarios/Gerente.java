package br.com.jabutis.usuarios;

public class Gerente extends Funcionario {
	
	public int numAgencia;
	
	public Gerente(int senha, long cpf, String cargo, int numAgencia) {
		super(senha, cpf, numAgencia);
		
		this.numAgencia = numAgencia;
		this.cargo = "Gerente";
		
	}

	public int getNumAgencia() {
		return numAgencia;
	}
	
	
	

}

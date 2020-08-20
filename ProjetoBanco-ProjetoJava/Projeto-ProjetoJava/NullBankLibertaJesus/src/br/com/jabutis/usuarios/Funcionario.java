package br.com.jabutis.usuarios;

public abstract class Funcionario extends Usuario{
	
	public String nome;
	public int senha;
	public long cpf;
	public String cargo;
	public int numAgencia;
	
	Funcionario(int senha, long cpf, int numAgencia){
		
		this.senha = senha;
		this.cpf = cpf;
		this.numAgencia = numAgencia;
		
	}
	
	
	Funcionario(int senha, long cpf) {
		
		this.senha = senha;
		this.cpf = cpf;
		this.tipo = "Funcionario";
		
	}

	public int getNumAgencia() {
		return numAgencia;
	}
	
	
	
	
	

}

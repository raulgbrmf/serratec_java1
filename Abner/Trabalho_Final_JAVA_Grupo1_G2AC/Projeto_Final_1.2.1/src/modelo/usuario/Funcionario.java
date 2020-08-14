package modelo.usuario;

public abstract class Funcionario extends Usuario {		
	
	protected String cargo;
	
	public Funcionario(String nome, String cpf, String senha) {
		super(nome, cpf, senha);		
	}	
	
	public String getCargo() {
		return cargo;
	}
}

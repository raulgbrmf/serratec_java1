
public class Funcionario implements Autenticavel {

	private String nome;
	private String cpf;
	private int senha;
	
	
	
	public int getSenha() {
		return senha;
	}



	public void setSenha(int senha) {
		this.senha = senha;
	}



	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}
		else {
			return false;
		}
	}
}

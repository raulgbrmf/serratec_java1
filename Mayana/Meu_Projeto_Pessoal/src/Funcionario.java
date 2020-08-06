
public class Funcionario implements Autenticavel {
	
	private String nome;
	private String cpf;
	private int senha;
	
	
	public boolean autentica(int senha) {
		if(this.senha ==senha) {
			return true;
		}
		else{
			return false;
		}
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public int getSenha() {
		return senha;
	}


	public void setSenha(int senha) {
		this.senha = senha;
	}
	

}

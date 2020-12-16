
public class Cliente implements Autenticavel{
	
	protected String nome_completo;
	protected String cpf;
	protected String telefone;
	protected String email;
	protected Endereco endereco;
	protected int senha; 
	
	
		
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public String getNome_completo() {
		return nome_completo;
	}

	public void setNome_completo(String nome_completo) {
		this.nome_completo = nome_completo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Cliente(String nome_completo, String cpf, String telefone, String email) {
		super();
		this.nome_completo = nome_completo;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		//this.endereco = string;
	}
	
	public Cliente() {	
		super();
	}
	
	public String imprimeCliente() {
		return "\nNome: " + this.nome_completo + "\nCPF:" + this.cpf + "\nTelefone: " + this.telefone +
				"\nEmail: " + this.email + "\nEndereço: " + this.endereco.imprimeEndereco();
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
		
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}
		else {
			return false;
		}
		
	}

	
	
	

	
	
	
	
}

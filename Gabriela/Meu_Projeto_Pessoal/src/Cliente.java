
public class Cliente implements Autenticavel {
	
	protected String nome_completo;
	protected String cpf;
	protected String telefone;
	protected String email;
	protected String endereco; //---------------> tive que mudar para string, para que no construtor de cliente ele aceitasse minha funcao imprimeEndereco
	protected int senha;
	
	
	public Cliente() {
		
	}
	
	public Cliente(String nome_completo, String cpf, String telefone, String email, String endereco) {
		//super();
		this.nome_completo = nome_completo;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
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

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	
	/*public String getNome_completo() {
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
	public Endereco getEndereço() {
		return endereco;
	}
	public void setEndereço(Endereco endereço) {
		this.endereco = endereço;
	}*/

	
	
}

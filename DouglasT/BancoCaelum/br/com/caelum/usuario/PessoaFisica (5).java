package br.com.caelum.usuario;

public class PessoaFisica {

	private String cpf;
	
	public boolean validaCPF(){
		if(cpf != "") {
			return true;
		}else {
			return false;
		}
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
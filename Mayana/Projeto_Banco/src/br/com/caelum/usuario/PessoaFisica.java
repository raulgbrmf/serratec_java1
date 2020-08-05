package br.com.caelum.usuario;

public class PessoaFisica extends Cliente {
	
	private String cpf;
	
	
	public PessoaFisica(){
		
	}
	
	public PessoaFisica(String cpf){
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public boolean validaCpf() {
		if(cpf != "0") {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}

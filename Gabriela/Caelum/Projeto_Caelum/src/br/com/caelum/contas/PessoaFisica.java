package br.com.caelum.contas;

public class PessoaFisica {
	
	private String cpf;
	
	
	public PessoaFisica(String cpf){
		
		
		validaCpf(cpf);
		
			
		}
		
	
	public boolean validaCpf(String cpf) {
		if(cpf != "0") {
			return true;
		}
		return false;
	}


	public String getCpf() {
		return cpf;
	}
	
	
}

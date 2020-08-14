public class Pessoa_Fisica {
	
	private String cpf;	
	
	public Pessoa_Fisica(String cpf){
		if(verificaDigito(cpf)){
			this.cpf = cpf;
		}else {
			System.out.println("CPF Invalido! Deve digitar somente numeros... Quantidade de digitos deve ser igual a 11");
		}
	}	
	
	public String getCpf() {
		return this.cpf;
	}
	
	public boolean verificaDigito(String cpf) {
		
		int digitos = cpf.length();
		if(diferenteZero(cpf)) {			
			if(digitos == 11) {
				return true;
			}
		}		
		return false;
	}
	
	public boolean diferenteZero(String cpf) {		
		long numero = Long.parseLong(cpf);
		if(numero != 0) {
			return true;
		}		
		return false;
	}
}

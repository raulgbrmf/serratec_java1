package br.com.caelum.exceptions;

public class ValorInvalidoException extends Exception {
	
	
		
	public ValorInvalidoException(double valor) throws ValorInvalidoException {
	}
	
	public String getMessage() {
		return "Não foi possivel realizar o deposito , set um valor maior que zero. ";
	}
	
}

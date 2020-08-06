package br.com.caelum.contas.modelo.exceptions;

public class DepositoNegativoException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public DepositoNegativoException(String message) {
		super(message);

	}
}

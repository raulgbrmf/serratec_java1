package br.com.caelum.exception;

public class SaldoInsuficienteException extends RuntimeException {
	
	public SaldoInsuficienteException(String mensagem) {
		super(mensagem);
	}
	
	public SaldoInsuficienteException(double valor) {
		 super("Saldo insuficiente para sacar o valor de: " + valor);
	}

}

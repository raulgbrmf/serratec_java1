package br.com.jabutis.contas;

public class SaldoInsuficienteException extends RuntimeException {
	
	public SaldoInsuficienteException() {
		super("Saldo insuficiente.");
	}
}

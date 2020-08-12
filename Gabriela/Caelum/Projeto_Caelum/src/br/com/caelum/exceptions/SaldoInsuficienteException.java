package br.com.caelum.exceptions;

public class SaldoInsuficienteException extends RuntimeException {

	public SaldoInsuficienteException(double valor) {
		super("Saldo insuficiente para sacar o valor de: " + valor);
	}
	
	//Se minha classe passar a ser filha da Exception, eu sou obrigada a tratar o erro.
}

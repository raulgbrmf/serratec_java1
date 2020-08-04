package br.com.caelum.contas.modelo;

public class SaldoInsuficienteException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public SaldoInsuficienteException(double valor) {
		super("Saldo insuficiente para sacar o valor de: " + valor);
	}

}

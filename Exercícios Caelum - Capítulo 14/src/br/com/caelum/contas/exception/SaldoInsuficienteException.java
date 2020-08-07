package br.com.caelum.contas.exception;

public class SaldoInsuficienteException extends RuntimeException{
//public class SaldoInsuficienteException extends Exception{
	
	private static final long serialVersionUID = 1L;/*Classe Exception implementa clase Serializable
	adicionei isso porque o alerta do eclipse me deu OCD XD*/

	public SaldoInsuficienteException(double valor) {
		super("Saldo insuficiente para sacar o valor de: "+valor);
	}
}

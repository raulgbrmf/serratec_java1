package br.com.caelum.contas.modelo;

/* 
 * Resumidamente as exceções Checked (Exception) são aquelas no qual você é 
 * obrigado a tratá-la, seja com um bloco try-catch ou mesmo com um throws 
 * (relançando a mesma para outro local). Por outro lado, quando você tem 
 * exceções do tipo Unchecked (RuntimeException) não é obrigatório o tratamento 
 * da mesma, você pode tratar apenas se quiser, se sentir que é necessário para 
 * o bom funcionamento da sua aplicação.
*/

/*
 * Checked exceptions são utilizadas para erros recuperáveis enquanto que 
 * Unchecked exceptions são utilizadas para erros irrecuperáveis. Significa 
 * dizer que quando você sabe que seu erro pode ser tratado, você utiliza 
 * Checked Exceptions, caso contrário utilize Unchecked Exceptions.
*/

public class SaldoInsuficienteException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public SaldoInsuficienteException(double valor) {
		super("Saldo insuficiente para sacar o valor de: " + valor);
	}

}

package exception;

public class ValorInvalidoException extends Exception {
	
	
	public ValorInvalidoException(double valor) {
		super("Não pode depositar valor negativo: " + valor);
	}
}

package exception;

public class ValorInvalidoException extends Exception {
	
	
	public ValorInvalidoException(double valor) {
		super("N�o pode depositar valor negativo: " + valor);
	}
}

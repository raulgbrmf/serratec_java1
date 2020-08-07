// Exercício - 5.

public class ValorInvalidoException extends Exception { // Exercício - 8. Ocorreu um erro.

	public ValorInvalidoException(double valor){
		super ("Não posso retirar valor negativo: " + valor); // Exercício - 7.
	}
	
	// Exercício - 7.
	
	/*public String getMessage() {  
		return "Não posso retirar valor negativo: " + valor;
	}*/

}

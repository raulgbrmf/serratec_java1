package br.com.g2ac.usuario.main;

//Criado no Exercício 5
public class ValorInvalidoException extends Exception {

	public ValorInvalidoException(double valor){
		super("Valor Inválido: " + valor);
	}
}

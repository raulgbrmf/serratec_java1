package br.com.bugados.exceptions;

public class DepositoIndevido extends RuntimeException{
	
	
	public DepositoIndevido (String mensagem) {
		super(mensagem);
	}

}

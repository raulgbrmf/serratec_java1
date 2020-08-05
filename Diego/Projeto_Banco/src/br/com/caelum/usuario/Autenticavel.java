package br.com.caelum.usuario;

public interface Autenticavel {
	
	public static final int senha = 0;
	boolean autentica(int senha);
}

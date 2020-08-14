package br.com.theboys.banco.util;

public class LoginException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public LoginException() {
		System.out.println("##############################");
		System.out.println("## Login ou senha inválido! ##");
		System.out.println("##############################");
	}

}

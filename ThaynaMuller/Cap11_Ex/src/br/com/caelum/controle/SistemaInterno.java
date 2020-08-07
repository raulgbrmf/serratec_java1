package br.com.caelum.controle;

import java.util.Scanner;

public class SistemaInterno {

	Scanner s1 = new Scanner(System.in);

	void login(Autenticavel alguem) {
		int senha = s1.nextInt();
		boolean status = alguem.autentica(senha);
		if (status == true) {
			System.out.println("SISTEMA ACESSADO COM SUCESSO");
		}

		else {
			System.out.println("ACESSO NEGADO");
		}
	}
}

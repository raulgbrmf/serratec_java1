package br.com.caelum.usuario.main;

import br.com.caelum.usuario.Diretor;
import br.com.caelum.usuario.Gerente;
import br.com.caelum.usuario.Login;

public class TestaLogin {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		Diretor d1 = new Diretor();
		
		g1.setSenha(52);
		d1.setSenha(123);
		
		Login login = new Login();
		
		login.entrar(g1,g1.getSenha());
		login.entrar(g1, 25789);

	}

}

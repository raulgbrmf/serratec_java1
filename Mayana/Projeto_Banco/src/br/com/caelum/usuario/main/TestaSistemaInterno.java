package br.com.caelum.usuario.main;

import br.com.caelum.usuario.Diretor;
import br.com.caelum.usuario.Gerente;
import br.com.caelum.usuario.SistemaInterno;

public class TestaSistemaInterno {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		Diretor d1 = new Diretor();
		
		g1.setSenha(123);
		d1.setSenha(333);
		
		SistemaInterno login = new SistemaInterno();
		login.entrar(g1, g1.getSenha());
		login.entrar(g1, 8888);
		
		
	}
}

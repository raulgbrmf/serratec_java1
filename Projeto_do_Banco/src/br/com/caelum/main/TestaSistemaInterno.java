package br.com.caelum.main;

import br.com.caelum.contas.SistemaInterno;
import br.com.caelum.contas.modelo.Cliente;
import br.com.caelum.funcionarios.Faxineiro;
import br.com.caelum.funcionarios.Gerente;

public class TestaSistemaInterno {

	public static void main(String[] args) {
		SistemaInterno sys = new SistemaInterno();

		Gerente g1 = new Gerente();
		Cliente c1 = new Cliente();
		Faxineiro f1 = new Faxineiro();

		c1.setSenha(1234);
		g1.setSenha(1909);
		f1.setSenha(190909);

		sys.login(c1, c1.getSenha());
		sys.login(g1, g1.getSenha());

	}

}

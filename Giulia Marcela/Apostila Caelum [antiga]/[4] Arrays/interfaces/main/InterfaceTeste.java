package br.com.g2ac.interfaces.main;

import br.com.g2ac.conta.SistemaInterno;
import br.com.g2ac.interfaces.Autenticavel;
import br.com.g2ac.usuario.Cliente;
import br.com.g2ac.usuario.Diretor;
import br.com.g2ac.usuario.Gerente;

public class InterfaceTeste {

	public static void main(String[] args) {

		SistemaInterno systemIn = new SistemaInterno();
		Autenticavel diretor = new Diretor();
		Autenticavel gerente = new Gerente();
		Autenticavel cliente = new Cliente();

		systemIn.login(cliente);
		systemIn.login(gerente);
		systemIn.login(diretor);
	}
}

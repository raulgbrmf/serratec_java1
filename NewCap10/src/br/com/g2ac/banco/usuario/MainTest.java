package br.com.g2ac.banco.usuario;

public class MainTest {

	public static void main(String[] args) {
		SistemaInterno si = new SistemaInterno();
		Autenticavel diretor = new Diretor();
		Autenticavel gerente = new Gerente();
		Autenticavel cliente = new Cliente();

		si.login(diretor);
		si.login(gerente);
		si.login(cliente);
	}
}

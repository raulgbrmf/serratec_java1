package br.com.caelum.usuario.main;

import br.com.caelum.javafx.api.main.SistemaBancario;
import br.com.caelum.javafx.api.main.TelaDeContas;

public class TestaContas {
	public static void main(String[] args) {
		SistemaBancario.mostraTela(false);
		TelaDeContas.main(args);
	}
}
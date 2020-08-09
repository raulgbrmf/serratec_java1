package br.com.caelum.contas;

import br.com.caelum.javafx.api.util.Evento;
import br.com.caelum.contas.modelo.Conta;

public class ManipuladorDeContas {

	private Conta conta;

	public void criaConta(Evento evento) {
		conta = new Conta();
		this.conta.setAgencia("1234");
		this.conta.setNumero(56789);
		this.conta.setTitular("Batman");

	}

}

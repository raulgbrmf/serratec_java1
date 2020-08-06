package br.com.caelum.contas;

import br.com.caelum.contas.modelo.*;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {

	private Conta conta;

	public void criaConta(Evento evento) {

		String tipo = evento.getSelecionadoNoRadio("tipo");

		if (tipo.equalsIgnoreCase("conta corrente")) {
			this.conta = new ContaCorrente();
		} else if (tipo.equalsIgnoreCase("conta poupança")) {
			this.conta = new ContaPoupanca();
		}

		conta.setAgencia(evento.getString("agencia"));
		conta.setNumero(evento.getInt("numero"));
		conta.setTitular(evento.getString("titular"));
		conta.depositar(200);
	}

	public void deposita(Evento evento) {
		this.conta.depositar(evento.getDouble("valorOperacao"));
	}


	public void saca(Evento evento) throws Exception {
		 double valor = evento.getDouble("valorOperacao");
		 this.conta.sacar(valor);
	}
	
	public void transfere(Evento evento) throws Exception {
		Conta destino = (Conta)evento.getSelecionadoNoCombo("destino");
		conta.tranferir(destino, evento.getDouble("valorTrasferencia"));
    }
}

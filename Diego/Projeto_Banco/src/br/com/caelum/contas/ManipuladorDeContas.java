package br.com.caelum.contas;

import br.com.caelum.contas.modelo.*;
import br.com.caelum.exception.SaldoInsuficienteException;
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
		try {
			this.conta.depositar(evento.getDouble("valorOperacao"));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

	}

	public void saca(Evento evento) {
		double valor = evento.getDouble("valorOperacao");

		try {
			this.conta.sacar(valor);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}

	}

	public void transfere(Evento evento) {
		Conta destino = (Conta) evento.getSelecionadoNoCombo("destino");
		conta.tranferir(destino, evento.getDouble("valorTransferencia"));
	}
}

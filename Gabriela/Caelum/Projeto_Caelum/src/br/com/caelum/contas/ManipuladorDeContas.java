package br.com.caelum.contas;

import br.com.caelum.contas.modelo.*;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {

	private Conta conta;
	/*
	 * public void criaConta(Evento evento) { conta = new Conta();
	 * this.conta.setAgencia("1234"); this.conta.setNumero(56789);
	 * this.conta.setTitular("Batman");
	 * 
	 * }
	 */

	public void criaConta(Evento evento) {
		String tipo = evento.getSelecionadoNoRadio("tipo");
		if (tipo.equals("Conta Corrente")) {
			this.conta = new ContaCorrente();
		} else if (tipo.equals("Conta Poupança")) {
			this.conta = new ContaPoupanca();
		}
		this.conta.setAgencia(evento.getString("agencia"));
		this.conta.setNumero(evento.getInt("numero"));
		this.conta.setTitular(evento.getString("titular"));
	}

	public void saca(Evento evento) {
		double valor = evento.getDouble("valorOperacao");
		this.conta.saca(valor);
	}

	public void deposita(Evento evento) {
		double valorDigitado = evento.getDouble("valorOperacao");
		this.conta.deposita(valorDigitado);
	}
	
	public void transfere(Evento evento){
		Conta destino = (Conta) evento.getSelecionadoNoCombo("destino");
		conta.transfere(evento.getDouble("valorTransferencia"), destino);
	}
}

/*
 * public void deposita(Evento evento) { double valorDigitado =
 * evento.getDouble("valor"); this.conta.deposita(valorDigitado); }
 * 
 * public void saca(Evento evento) { double valorDigitado =
 * evento.getDouble("valor"); this.conta.saca(valorDigitado); }
 */

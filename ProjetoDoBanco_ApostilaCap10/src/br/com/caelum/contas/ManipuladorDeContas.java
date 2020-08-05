package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {

	//Conta c1 = new Conta("Ingrid", "123", 100, 12);
	//Conta conta = new Conta();
	
	private Conta conta;
	
	public void criaConta(Evento evento) {
		/*
		this.c1.setAgencia("123");
		this.c1.setNumero(56789);
		this.c1.setTitular("Batman");
		this.c1.setSaldo(100);
		*/
		
		/*this.conta.setAgencia(evento.getString("agencia"));
		this.conta.setNumero(evento.getInt("numero"));
		this.conta.setTitular(evento.getString("titular"));*/
	
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
	
	public void deposita(Evento evento) {
		double valorDigitado = evento.getDouble("valorOperacao");
		this.conta.deposita(valorDigitado);
	}

	public void saca(Evento evento) {
		double valorDigitado = evento.getDouble("valorOperacao");
		/*if(this.conta.getTipo().equals("Conta Corrente")) {
			this.conta.saca(valor + 0.10);
		} else {*/
		this.conta.saca(valorDigitado);
	}
	
	public void transfere(Evento evento) {
	Conta destino = (Conta) evento.getSelecionadoNoCombo("destino");
	conta.transfere(evento.getDouble("valorTransferencia"), destino);
	}
	
	/*Conta c = new Conta();
	ContaCorrente cc = new ContaCorrente();
	ContaPoupanca cp = new ContaPoupanca();*/
	
	/*Conta c = new Conta();
	Conta cc = new ContaCorrente();
	Conta cp = new ContaPoupanca();*/
	
}


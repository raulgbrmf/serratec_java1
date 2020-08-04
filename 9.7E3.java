package br.com.caelum.contas;

import br.com.caelum.contas.main.ContaCorrente;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {
	
	Conta c1 = new Conta();
	
	
	public void criaConta(Evento evento) {
		  String tipo = evento.getSelecionadoNoRadio("tipo");
		  if (tipo.equals("Conta Corrente")) {
		      this.c1 = new ContaCorrente();
		  } else if (tipo.equals("Conta Poupança")) {
		      this.c1 = new ContaPoupanca();
		  }
		  this.c1.setAgencia(evento.getString("agencia"));
		  this.c1.setNumero(evento.getInt("numero"));
		  this.c1.setTitular(evento.getString("titular"));
		}
}
	
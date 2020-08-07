package br.com.caelum.contas;
import br.com.caelum.contas.modelo.*;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {

	private Conta conta;
	
	public void criaConta(Evento evento){
		String	tipo = evento.getSelecionadoNoRadio("tipo");
		if (tipo.equals("Conta Corrente")){
			this.conta = new ContaCorrente();
		}
		else if(tipo.equals("Conta Poupança"))	{
			this.conta = new ContaPoupanca();
		}
	
		this.conta.setAgencia(evento.getString("agencia"));
		this.conta.setNumero(evento.getInt("numero"));
		this.conta.setTitular(evento.getString("titular"));
	}
	
	public Conta getConta() {
		return this.conta;
	}
	
	public void deposita(Evento	evento){
		double valorDigitado = evento.getDouble("valorOperacao");
		this.conta.deposita(valorDigitado);
	}
	public void saca(Evento evento) {
		double valorDigitado = evento.getDouble("valorOperacao");
			this.conta.saca(valorDigitado);
		}
	public void transfere(Evento evento){
		Conta destino =	(Conta) evento.getSelecionadoNoCombo("destino");
		conta.transfere(evento.getDouble("valorTransferencia"),	destino);
	}

}


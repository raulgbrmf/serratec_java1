package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {

	//Conta c1 = new Conta("Carla", "123", 100, 12);
	   
	private Conta c1;
	
	public void criaConta(Evento evento) {
		
		String tipo = evento.getSelecionadoNoRadio("tipo");
		if (tipo.equals("Conta Corrente"))
		{
			this.c1 = new ContaCorrente();
			
		}else if (tipo.equals ("Conta Poupança"))
		{
			this.c1 = new ContaPoupanca();
		}
		this.c1.setAgencia(evento.getString("agencia"));
		this.c1.setNumero(evento.getInt("numero"));
		this.c1.setTitular(evento.getString("titular"));
			
		
		/*this.c1.setAgencia("123");
		this.c1.setNumero(56789);
		this.c1.setTitular("Batman");
		this.c1.setSaldo(100);*/
		
	}

	public void deposita(Evento evento) {
		double valorDigitado = evento.getDouble("valorOperacao");
		this.c1.deposita(valorDigitado);
	}

	/*public void saca(Evento evento) {
		double valorDigitado = evento.getDouble("valorOperacao");
		if (this.c1.getTipo().equals("Conta Corrente"))
		{
			this.c1.saca( valorDigitado + 0.10);
			
		} else {
			
			this.c1.saca(valorDigitado);
		}*/
	
		
	
	public void saca (Evento evento)
	{
		double valorDigitado = evento.getDouble ("valorOperacao");
		this.c1.saca(valorDigitado);
		
	}
		
		//this.c1.saca(valorDigitado);
	
	
	public void transfere (Evento evento)
	{
		Conta destino = (Conta) evento.getSelecionadoNoCombo("destino");
		c1.transfere(evento.getDouble("valorTransferencia"), destino);
	}
	

	
	//Exercício 10

    // Conta c = new Conta ();
    //ContaCorrente cc = new ContaCorrente ();
    //ContaPoupanca cp = new ContaPoupanca ();
    
	//Conta c = new Conta ();
   // Conta cc = new ContaCorrente ();
    //Conta cp = new ContaPoupanca ();
	
}

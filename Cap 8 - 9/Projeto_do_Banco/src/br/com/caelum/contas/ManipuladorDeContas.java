package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {

	//Conta c1 = new Conta("Ramon", "12345", 2000, 10);  //usando construtor.
	Conta conta = new Conta();
	
	/*public void criaConta(Evento evento) {  //Metodo criaConta. NUMERO 2 PAGINA 130 CAP 8
		
		this.c1.setAgencia("566");
		this.c1.setNumero(56789);
		this.c1.setTitular("Ramon");
		this.c1.setSaldo(3000);
		
	}*/
	
		public void criaConta(Evento evento) { 
			
		String tipo = evento.getSelecionadoNoRadio("tipo"); //metodo que esta dentro do evento.
		if (tipo.equals("Conta Corrente")) {
			this.conta = new ContaCorrente();
		} else if ( tipo.equals("Conta Poupanca")) {
			this.conta = new ContaPoupanca();
		}
			
		this.conta.setAgencia(evento.getString("agencia"));
		this.conta.setNumero(evento.getInt("numero"));
		this.conta.setTitular(evento.getString("titular"));
	}


	public void deposita(Evento evento) {   //NUMERO 3 - PAG 130 - CAP 8
		double valorDigitado = evento.getDouble("valorOperacao");
		this.conta.deposita(valorDigitado);
	}

	public void saca(Evento evento) {
		double valor = evento.getDouble("valorOperacao"); // NUMERO 4  - PAG 130 - CAP 8
		this.conta.saca(valor);
		
		
		//if (this.c1.getTipo().equals("Conta Corrente")) {
			//this.c1.saca(valor + 0.10); // numero 6 - pag 146 - cap 9
		//} else {
			//this.c1.saca(valor);
		//}
	}
	
	public void transfere(Evento evento) {  // numero 9 - pag 148 - cap 9
		
		Conta destino = (Conta) evento.getSelecionadoNoCombo("destino");
		conta.transfere(evento.getDouble("valorTransferencia"), destino);
	}
	
	
	

}

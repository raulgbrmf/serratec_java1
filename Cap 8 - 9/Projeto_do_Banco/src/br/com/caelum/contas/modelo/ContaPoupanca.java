package br.com.caelum.contas.modelo;

public class ContaPoupanca extends Conta { //NUMERO 3 : CONTA POUPANCA PEDE PARA SER ABSTRACT
	
	public String getTipo() {
		
		return super.getTipo() + "Poupanca";

	}

}

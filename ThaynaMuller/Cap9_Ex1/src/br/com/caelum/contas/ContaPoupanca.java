package br.com.caelum.contas;
//Exercicio 3:

public class ContaPoupanca extends Conta{
	
	
	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}
	
	
	public void atualiza(double taxa) {  //Exercicio 8:
		super.atualiza(3*taxa);
		
		
	     
	}

	
	

}

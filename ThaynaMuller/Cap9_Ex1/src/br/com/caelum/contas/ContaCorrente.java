package br.com.caelum.contas;
//Exercicio 3:

public class ContaCorrente extends Conta {
	
	
	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}

	
	public void atualiza(double taxa) {   //Exercicio 8:
		super.atualiza(2*taxa);
		
	}
	
	
}

package br.com.caelum.contas;

public class ContaCorrente extends Conta {
	
	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}

	
	public void atualiza(double taxa) {   //Exercicio 8:
		this.saldo += this.saldo*(2*taxa);
		
	}
	

}

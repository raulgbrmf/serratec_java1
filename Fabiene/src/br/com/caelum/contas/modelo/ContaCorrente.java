package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta {
	
	void atualiza (double taxa) {
		this.saldo += this.saldo * taxa *2;
	}
	
	
}

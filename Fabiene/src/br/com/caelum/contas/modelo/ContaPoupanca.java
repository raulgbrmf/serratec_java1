package br.com.caelum.contas.modelo;

public class ContaPoupanca extends Conta {

	@Override
	void atualiza(double taxaSelic) {
		// TODO Auto-generated method stub
		super.atualiza(taxaSelic*3);
		
	}
	
}

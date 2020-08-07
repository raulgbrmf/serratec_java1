package br.com.caelum.contas.modelo;

import br.com.caelum.contas.exception.SaldoInsuficienteException;

public class ContaPoupanca extends Conta {

	/*public String getTipo() {
		
		return "Conta Poupança";
		
	}*/
	
	public String getTipo() {
		
		return super.getTipo()+" Poupança";
	}
	
	public void saca(double valor){
		if(valor<0)
			throw new IllegalArgumentException("Você tentou sacar um valor negativo");
		if(this.saldo < valor)
			throw new SaldoInsuficienteException(valor);
		
		else{
			double novoSaldo = this.saldo - valor;
			this.saldo = novoSaldo;
			}
	}
}

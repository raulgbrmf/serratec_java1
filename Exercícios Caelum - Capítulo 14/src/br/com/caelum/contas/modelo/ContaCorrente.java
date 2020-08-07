package br.com.caelum.contas.modelo;

import br.com.caelum.contas.exception.SaldoInsuficienteException;

public class ContaCorrente extends Conta{

	/*public String getTipo() {
		
		return "Conta Corrente";
		
	}*/
	
	public String getTipo() {
		
		return super.getTipo()+" Corrente";
	}
	
	@Override
	public void saca(double valor){
		if(valor<0)
			throw new IllegalArgumentException("Você tentou sacar um valor negativo");
		if(this.saldo < valor)
			throw new SaldoInsuficienteException(valor);
		
		else{
			double novoSaldo = this.saldo - (valor+0.10);
			this.saldo = novoSaldo;
			}
	}
	
	public double getValorImposto() {
		return this.getSaldo()*0.01;
	}
}

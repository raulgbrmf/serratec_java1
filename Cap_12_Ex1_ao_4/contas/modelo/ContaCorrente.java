package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel {

	public String getTipo()
	{
		return "Conta Corrente";
	}

	/*@Override
	public void saca (double valorDigitado)
	{
		this.saldo -= (valorDigitado + 0.10);
	}*/
	
	//Exercício 12.11.4
	/*@Override
	public void saca (double valorDigitado) {
		if (valorDigitado < 0) {
			throw new IllegalArgumentException("Você tentou sacar um valor negativo."); 
		} else {
		   this.saldo -= (valorDigitado + 0.10);
		}
	}*/
	
	
	//Exercício 12.11.6
	
	@Override
	public void saca (double valorDigitado) {
		if (valorDigitado < 0) {
			throw new IllegalArgumentException("Você tentou sacar um valor negativo."); 
		} 
		if ( this.saldo < valorDigitado) {
		   throw new SaldoInsuficienteException();
			
		}this.saldo -= (valorDigitado + 0.10);
	}	
	
	

	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return this.getSaldo() *0.01;
	}


}



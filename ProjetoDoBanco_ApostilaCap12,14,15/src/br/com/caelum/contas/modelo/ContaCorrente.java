package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel {
	
	/*public String getTipo() {
		return "Conta Corrente";*/
	//@Override
	public void saca(double valorDigitado) {
		this.saldo -= (valorDigitado + 0.10);
	}
	
	public String getTipo() {
		return "ContaCorrente";
	}
	
	public double getValorImposto() {
		return this.getSaldo() *0.01;
	}
}

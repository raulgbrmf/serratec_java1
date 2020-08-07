package br.com.caelum.contas.modelo;

public class ContaPoupanca extends Conta {

	/*public String getTipo() {
		
		return "Conta Poupança";
		
	}*/
	
	public String getTipo() {
		
		return super.getTipo()+" Poupança";
	}
	
	public double getValorImposto() {
		return this.getSaldo()*0.01;
	}
}

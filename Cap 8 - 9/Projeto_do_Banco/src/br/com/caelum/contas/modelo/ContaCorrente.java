package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta {  // numero 4 - pag 146 - cap 9
	
	public String getTipo() {
		return super.getTipo() + "Corrente";
	}
	
	
	public void saca(double valor) {
		
		this.saldo -= (valor + 0.10);
	}
	

}

package br.com.caelum.contas.modelo;

public class ContaPoupanca extends Conta {


	@Override
	public void saca(double valor) {
		this.saldo -= (valor + 0.10);

	}
	
	public ContaPoupanca(double saldo, int numero, String agencia, String titular) {
		super(saldo, numero, agencia, titular);
		this.tipo = "Conta Poupança";
	}

	
	public ContaPoupanca(String tipo) {
		tipo = this.tipo;
	}
	
	public ContaPoupanca() {
		
	}
	
	public String getTipo() {
		return "Conta Poupança";
	}
	
	
	
	
	
}

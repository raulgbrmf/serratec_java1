package br.com.bugados.conta;

public class ContaCorrente extends Conta {
	
	protected final String tipo = "Corrente";
	protected double taxas;
	
	public void atualiza(double taxaSelic) {
		super.atualiza(taxaSelic*2);
	}

	public double calculaTributos() {
		return this.saldo * 0.01;
	}
	
	@Override
	public void transferePara(Conta destino, double valor) {
		if (this.saldo >= (valor + 0.20)) {
			destino.saldo = destino.saldo + valor;
			this.saldo = this.saldo - (valor + 0.20);
			this.taxas = this.taxas + 0.20; 
		} else {
			System.out.println("Não há saldo suficiente para transferir esse valor!!!");
		}
	}
	
	@Override
	public void deposita(double valor) {
		this.saldo += (valor - 0.10);
		this.taxas = this.taxas + 0.10;
	}
	
	@Override
	public void saca(double valor) {
		if (this.saldo < (valor + 0.10)) {
			System.out.println("Saldo insuficiente!!!");
		} else {
			this.saldo = this.saldo - (valor + 0.10);
			this.taxas = this.taxas + 0.10;
		}
	}
	
	public double consultaTotalTaxas() {
		return this.taxas;
	}

	public String getTipo() {
		return tipo;
	}

	@Override
	public void consultaTipo() {
		// TODO Auto-generated method stub
	}
}

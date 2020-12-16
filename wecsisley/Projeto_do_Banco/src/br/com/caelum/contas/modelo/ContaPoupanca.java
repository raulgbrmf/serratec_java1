package br.com.caelum.contas.modelo;

public class ContaPoupanca extends Conta{

	protected final String tipo = "Conta poupança";
	protected double TarifaPoupanca = TARIFAS + 0.0;

	@Override
	public String consultaTipo() {
		return tipo;
	}
	@Override
	public double consultaTarifas() {
		return TarifaPoupanca;
	}
	@Override
	public double cobraTarifas() {
		this.saldo = this.saldo - TarifaPoupanca;
		return this.saldo;
	}
	
	@Override
	public void saca(double	valor) {
		if (this.saldo < valor) {
			System.out.printf("\nSaldo insuficiente para realizar o saque" 
								+ "\nSeu saldo atual é de: R$ %.2f%n",this.saldo + ".");
		} else {
			System.out.printf("\n" + this.titular + " - " + "Valor do saque: R$ %.2f%n", (valor));
			this.saldo = this.saldo - valor - TarifaPoupanca;
		}
	}
}

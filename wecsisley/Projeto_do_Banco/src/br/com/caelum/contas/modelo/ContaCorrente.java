package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel {

	protected final String tipo = "Conta Corrente";
	protected double TarifaCorrente = TARIFAS + 0.10;
	protected final double SEGURODEVIDA = 42;
	
	@Override
	public String consultaTipo() {
		return tipo;
	}

	@Override
	public double consultaTarifas() {
		return TarifaCorrente;
	}

	@Override
	public double cobraTarifas() {
		this.saldo = this.saldo - TarifaCorrente;
		return this.saldo;
	}

	@Override
	public void saca(double valor) {
		if (this.saldo < valor) {
			System.out.printf("\nSaldo insuficiente para realizar o saque" + "\nSeu saldo atual é de: R$ %.2f%n",
					this.saldo + ".");
		} else {
			System.out.printf("\n" + this.titular + " - " + "Valor do saque: R$ %.2f%n", (valor));
			this.saldo = this.saldo - valor - TarifaCorrente;
		}
	}

	@Override
	public double getValorImposto() {
		return this.getSaldo() * 0.01;
	}
}

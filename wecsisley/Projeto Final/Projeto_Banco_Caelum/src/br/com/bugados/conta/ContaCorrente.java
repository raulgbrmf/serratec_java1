package br.com.bugados.conta;

public class ContaCorrente extends Conta {

	protected int tipo;
	protected double taxas;

	public ContaCorrente() {

	}

	public ContaCorrente(int cpf, int numero, int agencia, double saldo, int tipo) {
		this.cpf = cpf;
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.tipo = tipo;
	}

	public void atualiza(double taxaSelic) {
		super.atualiza(taxaSelic * 2);
	}

	public double calculaTributos() {
		return this.saldo * 0.01;
	}

	@Override
	public boolean transferePara(Conta destino, double valor) {
		if (this.saldo >= (valor + 0.20)) {
			destino.saldo = destino.saldo + valor;
			this.saldo = this.saldo - (valor + 0.20);
			this.taxas = this.taxas + 0.20;
			return true;
		} else {
			System.out.println("Não há saldo suficiente para transferir esse valor!!!");
			return false;
		}
	}

	@Override
	public void deposita(double valor) {
		this.saldo += (valor - 0.10);
		this.taxas = this.taxas + 0.10;
	}

	@Override
	public boolean saca(double valor) {
		if (this.saldo < (valor + 0.10)) {
			System.out.println("Saldo insuficiente!!!");
			return false;
		} else {
			this.saldo = this.saldo - (valor + 0.10);
			this.taxas = this.taxas + 0.10;
			return true;
		}
	}

	public double consultaTotalTaxas() {
		return this.taxas;
	}

	public int getTipo() {
		return tipo;
	}

	@Override
	public void consultaTipo() {
		// TODO Auto-generated method stub
	}
}

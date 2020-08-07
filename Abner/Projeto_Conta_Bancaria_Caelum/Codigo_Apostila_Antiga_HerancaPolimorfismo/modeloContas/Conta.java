package modeloContas;

import exception.ValorInvalidoException;
import usuario.Cliente;

public abstract class Conta {

	protected int numero;
	protected double limite;
	protected double saldo;
	protected Cliente titular = new Cliente();

	public Conta() {

	}

	public Conta(Cliente titular) {
		this.titular = titular;
	}

	public Conta(int numero, Cliente titular) {
		this(titular);
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	/*
	 * boolean transfere(Conta destino, double valor) { boolean retirou =
	 * this.saca(valor); if (retirou == false) { return false; } else {
	 * destino.deposita(valor); return true; } }
	 */

	public void deposita(double valor) throws ValorInvalidoException{
		if (valor < 0) {
			throw new ValorInvalidoException(valor);
		} else {
			this.saldo += valor * 0.9962;
		}
	}	

	public void saca(double valor) {
		if (this.saldo < valor) {
			throw new IllegalArgumentException("Saldo Insuficiente, tente um valor menor");
		} else {
			this.saldo -= valor;
		}
	}

	/*
	 * public boolean saca(double valor) { if (this.saldo < valor) { return false; }
	 * else { this.saldo = this.saldo - valor; return true; } }
	 */

	public abstract void atualiza(double taxa);
}

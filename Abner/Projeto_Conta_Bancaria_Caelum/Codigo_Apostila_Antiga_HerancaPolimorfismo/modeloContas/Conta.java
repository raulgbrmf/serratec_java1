package modeloContas;

import exception.ValorInvalidoException;
import usuario.Cliente;

public abstract class Conta {

	protected int numero;
	protected String agencia;
	protected double limite;
	protected double saldo;
	protected String titular;
	//protected Cliente titular = new Cliente();

	public Conta() {

	}

	/*public Conta(Cliente titular) {
		this.titular = titular;
	}*/

	/*public Conta(int numero, Cliente titular) {
		this(titular);
		this.numero = numero;
	}*/
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setAgencia(String ag) {
		this.agencia = ag;
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
	
	@Override
	public String toString() {		
		return " Titular: " + this.titular + " Numero: " + this.numero + " Agencia: " + this.agencia + " Saldo: " + this.saldo;
	}
}

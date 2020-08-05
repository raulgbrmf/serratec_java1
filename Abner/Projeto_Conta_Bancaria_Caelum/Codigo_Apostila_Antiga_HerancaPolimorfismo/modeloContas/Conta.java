package modeloContas;

import usuario.Cliente;

public class Conta {
	
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

	boolean transfere(Conta destino, double valor) {
		boolean retirou = this.saca(valor);
		if (retirou == false) {
			return false;
		} else {
			destino.deposita(valor);
			return true;
		}
	}

	public void deposita(double quantidade) {
		this.saldo += quantidade;
	}

	public boolean saca(double valor) {
		if (this.saldo < valor) {
			return false;
		} else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}

	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;
	}

}

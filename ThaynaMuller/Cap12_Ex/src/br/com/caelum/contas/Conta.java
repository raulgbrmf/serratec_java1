package br.com.caelum.contas;
import br.com.caelum.exceptions.ValorInvalidoException;

public class Conta {

	protected double saldo;
	protected double limite = 1000;

	public double getSaldo() {
		return this.saldo;
	}

	public void deposita(double valor) throws ValorInvalidoException {
		if(valor < 0) {
			throw new ValorInvalidoException(valor);
		}else {
			this.saldo += valor * 0.9962;
		}
	}

	public void saca(double valor) {
		if (this.saldo < valor) {
			throw new RuntimeException("Limite excedido");
		} else {
		this.saldo -= valor;
	}
}

	public double getLimite() {
		return this.limite;
	}
}


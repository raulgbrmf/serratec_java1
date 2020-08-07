package br.com.caelum.contas.modelo;

import br.com.caelum.exception.SaldoInsuficienteException;

public class ContaCorrente extends Conta implements Tributavel {

	private String tipo;

	public String getTipo() {
		return super.getTipo() + "Corrente ";
	}

	public void sacar(double valor) {
		
		if (valor <= 0 || this.saldo < valor) {
			throw new SaldoInsuficienteException(valor);
		}

		this.saldo -= (valor + 0.10);
	}

	@Override
	public double getValorImposto() {
		return this.getSaldo() * 0.1;
	}

}

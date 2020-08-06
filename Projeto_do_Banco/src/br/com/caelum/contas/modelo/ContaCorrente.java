package br.com.caelum.contas.modelo;

import br.com.caelum.contas.modelo.exceptions.SaldoInsuficienteException;
import br.com.caelum.contas.modelo.exceptions.ValorNegativoException;
import br.com.caelum.interfaces.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {

	@Override
	public String getTipo() {
		return "Conta Corrente";
	}

	@Override
	public void saca(double valor) {

		if (valor <= 0) {
			throw new ValorNegativoException("Entre um valor maior que zero");
		}
		
		if (this.saldo >= valor) {
			this.saldo -= (valor + 0.10);
			
		} else {
			throw new SaldoInsuficienteException("Saldo insuficiente! tente um valor menor");
		}
	}

	@Override
	public double getValorImposto() {
		return 0;
	}

	
}

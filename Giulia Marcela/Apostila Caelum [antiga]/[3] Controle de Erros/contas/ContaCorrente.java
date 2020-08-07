package br.com.g2ac.contas.modelo;

import br.com.g2ac.interfaces.Tributavel;
import br.com.g2ac.usuario.main.ValorInvalidoException;

public class ContaCorrente extends Conta implements Tributavel {

	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}
	/*
	 * @Override public void atualiza(double taxa) { super.atualiza(taxa * 2); }
	 */

	public void deposita(double valor) throws ValorInvalidoException {
		if (valor < 0) {
			throw new ValorInvalidoException(valor);//Modificado no Exercício 6
		} else {
			this.saldo += valor * 0.9962;
		}
	}

	public double calculaTributos() {
		return this.saldo * 0.01;
	}
}

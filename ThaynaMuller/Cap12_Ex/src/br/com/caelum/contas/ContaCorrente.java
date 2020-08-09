package br.com.caelum.contas;
import br.com.caelum.exceptions.*;

public class ContaCorrente extends Conta{

	public void deposita(double valor) throws ValorInvalidoException {
		super.deposita(valor);
	}

	public void atualiza(double taxa) {
		this.saldo += this.saldo * (2 * taxa);

	}

	public double calculaTributos() {
		return this.saldo * 0.01;
	}


}

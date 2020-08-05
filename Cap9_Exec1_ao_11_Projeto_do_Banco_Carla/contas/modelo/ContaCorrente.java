package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta {

	public String getTipo()
	{
		return super.getTipo() + "Corrente";
	}

	@Override
	public void saca (double valorDigitado)
	{
		this.saldo -= (valorDigitado + 0.10);
	}


}



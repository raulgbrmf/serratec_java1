package br.com.caelum.contas.modelo;

public interface Conta {
	public double getSaldo();
	public void saca(double valor);
	public void deposita(double valor);
	public void atualiza(double taxaSelic);
}


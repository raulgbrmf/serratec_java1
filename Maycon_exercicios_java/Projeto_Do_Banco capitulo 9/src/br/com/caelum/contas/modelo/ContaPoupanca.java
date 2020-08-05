package br.com.caelum.contas.modelo;

public class ContaPoupanca extends Conta {
	public String getTipo() {
		return super.getTipo() + "Poupança";
	}
}

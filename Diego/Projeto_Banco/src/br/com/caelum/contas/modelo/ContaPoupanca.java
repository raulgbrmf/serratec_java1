package br.com.caelum.contas.modelo;

public class ContaPoupanca extends Conta implements Tributavel {

	private String tipo;

	public String getTipo() {
		return super.getTipo() + " Poupanca";
	}
	

	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return 0;
	}

}

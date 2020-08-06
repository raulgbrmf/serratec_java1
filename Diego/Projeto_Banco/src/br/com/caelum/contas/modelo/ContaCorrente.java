package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel {

	private String tipo;

	public String getTipo() {
		return super.getTipo() + "Corrente ";
	}

	public void sacar(double valor) {
		this.saldo -= (valor + 0.10);
	}

	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return 0;
	}

}

package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel {

	public String getTipo() {
		return "Conta Corrente";
	}

	//public void saca(double valor) {
		//this.saldo -= (valor + 0.10);
	//}

	public double getValorImposto() {

		return this.getSaldo() * 0.01;

	}

	@Override
	public void saca(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você	tentou	sacar	um	valor	negativo");
		}
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException(valor);
		}
		this.saldo -= (valor + 0.10);
	}

	

}

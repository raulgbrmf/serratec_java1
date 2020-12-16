package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel {

	@Override
	public void saca(double valor) {
		if (valor < 0) {
		throw new IllegalArgumentException("Voc� tentou sacar um valor negativo");
		}
		if (this.saldo < valor) {
		throw new SaldoInsuficienteException(valor);
		}
		this.saldo -= (valor + 0.10);
		}

	
	public ContaCorrente(double saldo, int numero, String agencia, String titular) {
		super(saldo, numero, agencia, titular);
		this.tipo = "Conta Corrente";
	}


	public ContaCorrente(String tipo) {
		tipo = this.tipo;
	}

	public ContaCorrente() {

	}

	public String getTipo() {
		return "Conta Corrente";
	}

	@Override
	public double getValorImpostos() {
		return this.getSaldo() * 0.01;
	}	


}

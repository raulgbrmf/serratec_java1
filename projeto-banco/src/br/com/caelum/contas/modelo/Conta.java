package br.com.caelum.contas.modelo;

public abstract class Conta implements Comparable<Conta> {

	private String titular;
	private int numero;
	private String agencia;
	protected double saldo;

	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException(
					"Você tentou depositar" + " um valor negativo!");
		} else {
			this.saldo += valor;
		}
	}

	/* Validando valor negativo e saldo */
	public void saca(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException(
					"Você tentou sacar um valor negativo!");
		}
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException(valor);
		} else {
			this.saldo -= valor;
		}
	}

	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}

	@Override
	public String toString() {
		return "Titular: " + titular + "\tAgência: " + agencia
				+ "\tNº da conta: " + numero;
	}

	/*
	 * exercício 3 - Método abstrato é o método de uma classe abstrata que não
	 * possui implementação. Na classe abstrata, é definido o método abstrato
	 * com palavra reservada abstract e sua assinatura. A implementação do mesmo
	 * é feita na classe filha, através de sobrescrita de método.
	 */

	public abstract String getTipo();

	/*
	 * exercício 7 - Sim, podemos chamar um método abstrato de dentro de um
	 * outro método da própria classe. Implementação "TesteDaConta".
	 */
	public String recuperaDadosParaImpressao() {
		String dados = "Titular: " + this.titular;
		dados += "\nNúmero:	" + this.numero;
		dados += "\nAgência: " + this.agencia;
		dados += "\nSaldo: R$ " + this.saldo;
		dados += "\nTipo: " + this.getTipo();
		return dados;
	}

	public int compareTo(Conta outraConta) {
		return this.titular.compareTo(outraConta.titular);
	}
}

package br.com.caelum.contas.modelo;

public abstract class Conta {
	protected double saldo;
	private String titular, agencia;
	private int numero;
	private Data dataAbertura;
	private static int numeroConta = 0;

	public Conta() {

		Conta.numeroConta = Conta.numeroConta + 1;

	}

	public void setTitular(String titular) {
		this.titular = titular;

	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setDataAbertura(Data dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public String getTipo() {
		return "Conta";
	}

	public int getNumeroConta() {
		return Conta.numeroConta;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void saca(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou sacar um valor negativo");
		}
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException(valor);
		}
		this.saldo -= (valor);
	}

	public String getTitular() {
		return this.titular;
	}

	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou	depositar um valor negativo");
		} else {
			this.saldo += valor;
		}
	}

	public int getNumero() {
		return this.numero;
	}

	public String getAgencia() {
		return this.agencia;
	}

	double getRendimento() {
		double rendimento;
		rendimento = saldo * 0.1;
		return rendimento;

	}

	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}

	public String recuperaDadosParaImpressao() {
		return "conta [saldo=" + saldo + ", titular=" + titular + ", agencia=" + agencia + ", dataAbertura="
				+ dataAbertura.formatada() + ", numero=" + numero + "]";
	}

	public String toString() {
		return "Conta [saldo=" + saldo + ", titular=" + titular + ", agencia=" + agencia + ", numero=" + numero + "]";
	}

}

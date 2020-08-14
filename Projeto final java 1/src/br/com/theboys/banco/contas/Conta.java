package br.com.theboys.banco.contas;

public abstract class Conta implements Comparable<Conta> {

	protected String cpf, agencia;
	protected double saldo;
	private String titular;
	private int numero;
	protected int quantidadeSaque = 0;
	protected int quantidadeDeposito = 0;
	protected int quantidadeTranferencia = 0;

	public abstract void saca(double valor);

	public abstract void deposita(double valor);

	public abstract void transfere(double valor, Conta destinatario);

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
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

	public double getSaldo() {
		return saldo;
	}

	public int getQuantidadeSaque() {
		return quantidadeSaque;
	}

	public int getQuantidadeDeposito() {
		return quantidadeDeposito;
	}

	public int getQuantidadeTranferencia() {
		return quantidadeTranferencia;
	}

	public abstract String getTipo();

	public void inicializaSaldo(double valor) {
		this.saldo += valor;
	}

	@Override
	public String toString() {
		return "Conta [cpf=" + cpf + ", agencia=" + agencia + ", saldo=" + saldo
				+ ", titular=" + titular + ", numero=" + numero + "]";
	}

	@Override
	public int compareTo(Conta c) {
		return this.getTitular().compareTo(c.getTitular());
	}

}

package br.com.residenciaserratec.modelo;

public abstract class Conta {

	protected String tipo;
	protected double saldo = 0;
	protected int agencia;
	protected long cpfTitular;
	protected static double saldoTotal = 0;

	public Conta(int agencia, long cpfTitular, double saldo) {
		this.tipo = "Conta";
		this.agencia = agencia;
		this.cpfTitular = cpfTitular;
		this.saldo = saldo;
		saldoTotal += saldo;
	}

	public abstract void saque(double valor);

	public abstract void deposito(double valor);

	public abstract void transfere(Conta conta, double valor);

	public static double getSaldoTotal() {
		return saldoTotal;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getTipo() {
		return tipo;
	}

	public long getCpfTitular() {
		return cpfTitular;
	}

	@Override
	public String toString() {
		return "Conta [tipo=" + tipo + ", saldo=" + saldo + ", agencia=" + agencia + ", cpfTitular=" + cpfTitular + "]";
	}

	public abstract double getTributacao();

	

	
}

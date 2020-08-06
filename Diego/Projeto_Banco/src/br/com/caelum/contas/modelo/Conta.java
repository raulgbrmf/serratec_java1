package br.com.caelum.contas.modelo;

import br.com.caelum.contas.util.Data;

public class Conta {
	private int numero;
	protected double saldo;
	private String agencia;

	private String titular;
	private Data abertura;
	private double limite;
	private static int totalDeContas;

	// RENDIMENTO IMAGINARIO
	final private double SELIC = 0.850;
	final private double TBF = 0.1646;
	final private double A = 1.005;
	final private double B = 0.932;
	final private double REDUTOR = (A + B) * TBF;
	final private double TR = 10 * (((1 + TBF) / REDUTOR) - 1);

	public Conta() {
		Conta.totalDeContas += 1;
	}

	public Conta(String titular) {
		this.titular = titular;
	}

	public void sacar(double quantia) throws Exception {
		if (quantia <= 0 || this.saldo < quantia) {
			throw new Exception("Operacao indevida");
		}

		this.saldo -= quantia;

	}

	public void depositar(double quantia) {
		if (quantia > 0)
			this.saldo += quantia;
	}

	public boolean tranferir(Conta conta, double quantia) throws Exception {
		this.sacar(quantia);
		this.depositar(quantia);
		return true;
	}

	public double getRendimentoMensal() {
		return this.saldo * (SELIC + TR) / 100;
	}

	public String recuperaDadosParaImpressao() {
		StringBuilder dados = new StringBuilder();

		dados.append("\nTitular: " + this.titular);
		dados.append("\nNumero: " + this.numero);
		dados.append("\nSaldo: " + this.saldo);
		dados.append("\nData de abertura: " + this.abertura.formataData());
		dados.append("\nRendimento: " + this.getRendimentoMensal());

		return dados.toString();
	}

	public static int getTotalDeContas() {
		return Conta.totalDeContas;
	}

	public String getTipo() {
		return "Conta";
	}

	@Override
	public String toString() {

		return this.titular ;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return this.saldo + this.limite;
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

	public Data getAbertura() {
		return this.abertura;
	}

	public void setAbertura(Data data) {
		this.abertura = data;
	}

}

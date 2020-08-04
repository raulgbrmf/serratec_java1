package br.com.caelum.contas.tipo;

import br.com.caelum.contas.util.Data;
import br.com.caelum.contas.Cliente;

public class Conta {
	private int numero;
	private double saldo;
	private String titular;
	private Data abertura;

	// RENDIMENTO IMAGINARIO
	final private double SELIC = 0.850;
	final private double TBF = 0.1646;
	final private double A = 1.005;
	final private double B = 0.932;
	final private double REDUTOR = (A + B) * TBF;
	final private double TR = 10 * (((1 + TBF) / REDUTOR) - 1);

	public boolean sacar(double quantia) {
		if (this.saldo < quantia) {
			return false;
		}

		this.saldo -= quantia;
		return true;
	}

	public void depositar(double quantia) {
		this.saldo += quantia;
	}

	public boolean tranferir(Conta conta, double quantia) {
		if (!this.sacar(quantia))
			return false;

		this.depositar(quantia);
		return true;
	}

	public double calculaRendimentoMensal() {
		return this.saldo * (SELIC + TR) / 100;
	}

	public String recuperaDadosParaImpressao() {
		StringBuilder dados = new StringBuilder();
		
		dados.append("\nTitular: " + this.titular);
		dados.append("\nNumero: " + this.numero);
		dados.append("\nSaldo: " + this.saldo);
		dados.append("\nData de abertura: " + this.abertura.formataData());
		dados.append("\nRendimento: " + this.calculaRendimentoMensal());
		
		return dados.toString();
	}

	@Override
	public String toString() {

		return "\nnumero : " + this.numero + ", titular : " + this.titular + ", saldo : " + this.saldo
				+ ", data de abertura : " + this.abertura + ", rendimento : " + this.calculaRendimentoMensal();
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

	public void setSaldo(double saldo) {
		this.saldo = saldo;
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

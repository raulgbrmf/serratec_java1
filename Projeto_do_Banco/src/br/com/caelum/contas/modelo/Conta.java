package br.com.caelum.contas.modelo;

import br.com.caelum.banco.util.Data;
import br.com.caelum.contas.modelo.exceptions.DepositoNegativoException;
import br.com.caelum.contas.modelo.exceptions.SaldoInsuficienteException;
import br.com.caelum.contas.modelo.exceptions.ValorNegativoException;

public abstract class Conta {

	private int numero;
	private String agencia;
	private String titular;
	protected double saldo;

	protected String tipo;
	private static int totalDeContas;

	private Data data_abertura;

	public Conta() {

	}

	public void saca(double valor) {

		if (valor <= 0) {
			throw new ValorNegativoException("Entre um valor maior que zero");
		}

		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;

		} else {
			throw new SaldoInsuficienteException("Saldo insuficiente!");
		}

	}

	public void transfere(double valor, Conta destino) {

		this.saca(valor);
		destino.deposita(valor);

	}

	public void deposita(double quantia) {
		if (quantia > 0) {
			this.saldo = this.saldo + quantia;
		} else {
			throw new DepositoNegativoException("Não é possivel depositar um valor negativo!");
		}
	}

	public static int getTotalDeContas() {
		return totalDeContas;
	}

	public Data getData_abertura() {
		return data_abertura;
	}

	public void setData_abertura(Data data_abertura) throws Exception {

		if (data_abertura.isValid()) {

			this.data_abertura = data_abertura;
		} else {
			throw new IllegalArgumentException(
					"Data " + data_abertura.imprimeData() + " inválida para a conta do titular " + this.titular);
		}
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String recuperaDadosImpressao() {
		return "Dados do Titular\n" + this.titular + "\nTipo da conta: " + this.tipo + "\nAgência: " + this.agencia
				+ "\nNúmero da Conta: " + this.numero + "\nSaldo Atual: R$" + this.saldo + "\nRendimento Mensal: R$"
				+ calculaRendimento() + "\nData de Abertura: " + this.data_abertura.imprimeData();
	}

	double calculaRendimento() {
		return this.saldo * 0.1;
	}

	public int getNumero() {
		return numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getTipo() {
		return "Conta";
	};

	@Override
	public String toString() {
		return titular + " - " + " Agencia: " + agencia + " Numero: " + numero;

	}

	public boolean equals(Object object) {

		if (object == null) {

			return false;

		}

		Conta outraConta = (Conta) object;

		if (this.numero == outraConta.numero &&

				this.agencia.equals(outraConta.agencia)) {

			return true;

		}

		return false;

	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

}

package banco.conta;

import banco.administrativo.abstracoes.Pessoa;
import banco.utils.Data;

public abstract class Conta {

	private int numero;
	private String agencia;
	private Pessoa titular;
	private double saldo;
	protected String tipo;
	private static int totalDeContas;

	private Data data_abertura;

	public Conta(int numero, String agencia, Pessoa titular, double saldo, Data data_abertura) {
		this.numero = numero;
		this.agencia = agencia;
		this.titular = titular;
		this.saldo = saldo;

		try {
			this.setData_abertura(data_abertura);
		} catch (Exception e) {
			e.printStackTrace();
		}

		totalDeContas += 1;
	}

	Conta() {

	}

	boolean saca(double valor) {

		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}

	}

	boolean transfere(Conta destino, double valor) {

		if (this.saca(valor)) {
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}

	}

	boolean deposita(double quantia) {
		if (quantia > 0) {
			this.saldo = this.saldo + quantia;
			return true;

		} else {
			return false;
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
			throw new Exception(
					"Data " + data_abertura.imprimeData() + " invalida para a conta do titular " + this.titular);
		}
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public void setTitular(Pessoa titular) {
		this.titular = titular;
	}

	public String recuperaDadosImpressao() {
		return "Dados do Titular\n" + this.titular.imprimeDados() + "\nTipo da conta: " + this.tipo + "\nAgência: "
				+ this.agencia + "\nNúmero da Conta: " + this.numero + "\nSaldo Atual: R$" + this.saldo
				+ "\nRendimento Mensal: R$" + calculaRendimento() + "\nData de Abertura: "
				+ this.data_abertura.imprimeData();
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

	public Pessoa getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public abstract String getTipo();
	

}

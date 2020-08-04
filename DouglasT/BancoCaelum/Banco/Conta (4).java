package Banco;

public class Conta {

	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	Data dataAbertura;

	boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}

	}

	void deposita(double valor) {
		this.saldo = this.saldo + valor; // ---- Exercicios cap.4 num 1 e 2*/
	}

	boolean transfere(Conta destino, double valor) {
		if (this.saca(valor)) {
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}

	public double getRendimento() {           //---- Exercicios cap.5 num 2.1
		return this.saldo * 0.1;	
	}
	

	String recuperaDadosParaImpressao() {// ---Exercicios cap.4 num 3

		return "Titular: " + this.titular + "\nAngeica: " + this.agencia + "\nNº Conta: " + this.numero
				+ "\nData Abertura de Conta: " + this.dataAbertura.imprimeData() + "\nSaldo Atual: " + this.saldo;
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

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}

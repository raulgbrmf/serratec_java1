package conta_bancaria;

public class Conta {

	private int numero;
	private String agencia;
	private String titular;
	private double saldo;

	Data data_abertura;

	public Conta(int numero, String agencia, String titular, double saldo, Data data_abertura) {
		this.numero = numero;
		this.agencia = agencia;
		this.titular = titular;
		this.saldo = saldo;
		this.data_abertura = data_abertura;
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

	void deposita(double quantia) {
		this.saldo = this.saldo + quantia;
	}

	String recuperaDadosImpressao() {
		return "Nome do Titular: " + this.titular + "\nAgência: " + this.agencia + "\nNúmero da Conta: " + this.numero
				+ "\nSaldo Atual: R$" + this.saldo + "\nRendimento Mensal: R$" + calculaRendimento()
				+ "\nData de Abertura: " + this.data_abertura.imprimeData();
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

}

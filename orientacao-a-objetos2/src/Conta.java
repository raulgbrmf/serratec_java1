
public class Conta {

	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	private Data dataDeAbertura;

	public Conta(double saldo) {
		this.saldo = saldo;
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

	public Data getDataDeAbertura() {
		return dataDeAbertura;
	}

	public void setDataDeAbertura(Data dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	}

	public void saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
		} else {
			System.out.println("Saldo insuficiente!");
		}

	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public double calculaRendimento() {
		return this.saldo * 0.1;
	}

	public void transfere(Conta contaDestino, double valor) {
		double saldoAtual = .0;
		if (this.saldo >= valor) {
			saldoAtual = this.saldo;
			this.saca(valor);
			System.out.println("\n-----Conta origem-----");
			System.out
					.println("\nTitular: " + this.titular + "\nSaldo em conta: "
							+ saldoAtual + "\nValor transferido: " + valor
							+ "\nSaldo atual: " + this.saldo);
			saldoAtual = contaDestino.saldo;
			contaDestino.deposita(valor);
			System.out.println("\n-----Conta destino-----");
			System.out.println("\nTitular: " + contaDestino.titular
					+ "\nSaldo em conta: " + saldoAtual + "\nValor Recebido: "
					+ valor + "\nSaldo atual: " + contaDestino.saldo);
		} else {
			System.out.println("\nSaldo insuficiente!");
		}
	}

	@Override
	public String toString() {
		String dados = "\nTitular: " + this.titular;
		dados += "\nNúmero: " + this.numero;
		dados += "\nAgencia: " + this.agencia;
		dados += "\nSaldo: " + this.saldo;
		dados += "\nData de Abertura: " + this.dataDeAbertura.formatada();
		dados += "\nRendimento mensal: " + this.calculaRendimento();

		return dados;
	}

}

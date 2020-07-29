public class Conta {

	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	private Data dataAbertura;

	public Conta() {

	}

	public Conta(String titular, int numero, String agencia, double saldo, Data dataAbertura) {
		this.titular = titular;
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.dataAbertura = dataAbertura;
	}	

	public String getTitular() {
		return titular;
	}

	public int getNumero() {
		return numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public Data getDataAbertura() {
		return dataAbertura;
	}	

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}	

	private boolean verificaSaldo(double valor) {

		if (this.saldo >= valor)
			return true;
		return false;
	}

	public void saca(double valor) {

		if (verificaSaldo(valor))
			this.saldo += -valor;
		System.out.print("Saldo insuficiente!\n");

	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public double calculaRendimento() {

		return this.saldo * 0.1;
	}

	public String recuperaDadosImpressao() {
		return "Dados de extrado: " + "\nTitular: " + this.titular + "\nNumero c/c: " + this.numero + "\nAgencia: "
				+ this.agencia + "\nSaldo: R$ " + this.saldo + "\nRendimento Mensal: R$ " + calculaRendimento()
				+ "\nCliente desde: " + this.dataAbertura.retornaData();
	}
}

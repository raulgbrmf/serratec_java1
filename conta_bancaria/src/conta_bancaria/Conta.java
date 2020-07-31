package conta_bancaria;

public class Conta {

	private int numero;
	private String agencia;
	private String titular;
	private double saldo;
	private static Double taxa = 0.1;
	private static int totalDeContas;

	private Data data_abertura;

	public Conta(int numero, String agencia, String titular, double saldo,Data data_abertura) {
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

	public static Double getTaxa() {
		return taxa;
	}

	public static int getTotalDeContas() {
		return totalDeContas;
	}

	public static void setTaxa(Double taxa) {
		Conta.taxa = taxa;
	}

	public Data getData_abertura() {
		return data_abertura;
	}

	public void setData_abertura(Data data_abertura) throws Exception {
		
		if (data_abertura.isValid()) {
			
			this.data_abertura = data_abertura;
		}
		else {
			throw new Exception("Data "+ data_abertura.imprimeData()+ " invalida para a conta do titular "+ this.titular);
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

	String recuperaDadosImpressao() {
		return "Nome do Titular: " + this.titular + "\nAgência: " + this.agencia + "\nNúmero da Conta: " + this.numero
				+ "\nSaldo Atual: R$" + this.saldo + "\nRendimento Mensal: R$" + calculaRendimento()
				+ "\nData de Abertura: " + this.data_abertura.imprimeData();
	}

	double calculaRendimento() {
		return this.saldo * taxa;
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


public class funcoes_exercicios52 {

	private double saldo;
	private String titular, agencia;
	private int numero;
	private data dataAbertura;
	private static int numeroConta = 0;

	public funcoes_exercicios52(String titular) {
		setTitular(titular);

		funcoes_exercicios52.numeroConta = funcoes_exercicios52.numeroConta + 1;

	}

	void setTitular(String titular) {
		this.titular = titular;

	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setDataAbertura(data dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public int getNumeroConta() {
		return funcoes_exercicios52.numeroConta;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void saca(double valor) {

		if (valor < saldo) {
			saldo = saldo - valor;
		} else {
			System.out.print("operação abortada");
		}

	}

	public String getTitular() {
		return this.titular;
	}

	void deposita(double valor) {
		saldo = valor + saldo;

	}

	double getRendimento() {
		double rendimento;
		rendimento = saldo * 0.1;
		return rendimento;

	}

	public String recuperaDadosParaImpressao() {
		return "conta [saldo=" + saldo + ", titular=" + titular + ", agencia=" + agencia + ", dataAbertura="
				+ dataAbertura.formatada() + ", numero=" + numero + "]";
	}
}

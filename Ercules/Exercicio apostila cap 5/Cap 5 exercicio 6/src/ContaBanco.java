
public class ContaBanco {

	private String nome, agencia;
	private int conta;
	private double saldo;
	private static int idConta;
	Data dataAbertura;

	ContaBanco(String nome, int conta, String agencia, Data dataAbertura) {

		this.nome = nome;
		this.conta = conta;
		this.agencia = agencia;
		this.dataAbertura = dataAbertura;
		this.saldo = 0;
		ContaBanco.idConta++;
	}

	public int getIdConta() {
		return idConta;
	}

	public String getNome() {
		return nome;
	}

	public String getAgencia() {
		return agencia;
	}

	public int getConta() {
		return conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void getDataAbertura() {
		this.dataAbertura.getData();
	}

	public int getDiaAbertura() {
		return this.dataAbertura.getDia();
	}

	public int getMesAbertura() {
		return this.dataAbertura.getMes();
	}

	public int getAnoAbertura() {
		return this.dataAbertura.getAno();
	}

	public void sacar(double valor) {
		if (valor <= this.saldo && valor > 0) {
			this.saldo -= valor;
		} else {
			System.out.println("Você não pode fazer essa operação.");
		}
	}

	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		} else {
			System.out.println("Você não pode fazer essa operação.");
		}
	}
}

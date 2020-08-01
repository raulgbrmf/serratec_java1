
public class ContaBanco {

	private String nome, agencia;
	private int conta;
	private double saldo;
	Data dataAbertura = new Data();
	
	ContaBanco(){
		System.out.println();
	}

	ContaBanco(String nome, int conta, String agencia, Data dataAbertura) {

		this.nome = nome;
		this.conta = conta;
		this.agencia = agencia;
		this.dataAbertura = dataAbertura;
		this.saldo = 0;
	}

	ContaBanco(int conta, String agencia, Data dataAbertura) {

		this.conta = conta;
		this.agencia = agencia;
		this.dataAbertura = dataAbertura;
		this.saldo = 0;
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

	public String getDataAbertura() {
		return this.dataAbertura.getData();
	}

	public String getDiaAbertura() {
		return this.dataAbertura.getDia();
	}

	public String getMesAbertura() {
		return this.dataAbertura.getMes();
	}

	public String getAnoAbertura() {
		return this.dataAbertura.getAno();
	}

	public void sacar(double valor) {
		if(valor <= this.saldo && valor > 0) {
			this.saldo -= valor;
		}else {
			System.out.println("Você não pode fazer essa operação.");
		}
	}

	public void depositar(double valor) {
		if(valor > 0) {
			this.saldo += valor;
		}else {
			System.out.println("Você não pode fazer essa operação.");
		}
	}
}

package conta_bancaria;

public class ContaCorrente extends Conta {

	private double limiteEmprestimo;
	
	public ContaCorrente() {
		super();
	}

	public ContaCorrente(int numero, String agencia, String titular, double saldo, Data data_abertura,
			double limiteEmprestimo) {
		super(numero, agencia, titular, saldo, data_abertura);
		this.setLimiteEmprestimo(limiteEmprestimo);

	}

	public boolean realizaEmprestimo(double valor) {

		if (this.limiteEmprestimo >= valor) {
			limiteEmprestimo = limiteEmprestimo - valor;
			this.deposita(valor);
			return true;
		} else {
			return false;
		}
	}

	public double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}

}

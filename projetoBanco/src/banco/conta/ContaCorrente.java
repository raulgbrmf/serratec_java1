package banco.conta;

import banco.administrativo.abstracoes.Pessoa;
import banco.utils.Data;

public class ContaCorrente extends Conta {

	private double limiteEmprestimo;

	public ContaCorrente() {
		super();
	}

	public ContaCorrente(int numero, String agencia, Pessoa titular, double saldo, Data data_abertura,
			double limiteEmprestimo) {

		super(numero, agencia, titular, saldo, data_abertura);
		this.tipo = "Corrente";
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

	@Override
	public String getTipo() {
		return this.tipo;
	}
}

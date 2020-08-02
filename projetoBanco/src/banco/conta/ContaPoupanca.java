package banco.conta;

import banco.administrativo.abstracoes.Pessoa;
import banco.utils.Data;

public class ContaPoupanca extends Conta {

	private double taxa;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(int numero, String agencia, Pessoa titular, double saldo, Data data_abertura,double taxa) {
		super(numero, agencia, titular, saldo, data_abertura);
		this.tipo = "Poupança";
		this.setTaxa(taxa);
	}

	@Override
	double calculaRendimento() {
		return getSaldo() * taxa;
	}
	
	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	@Override
	public String getTipo() {
		return this.tipo;
	}

}

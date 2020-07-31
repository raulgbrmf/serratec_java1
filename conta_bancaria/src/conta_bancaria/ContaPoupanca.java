package conta_bancaria;

public class ContaPoupanca extends Conta {

	private double taxa;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(int numero, String agencia, String titular, double saldo, Data data_abertura,double taxa) {
		super(numero, agencia, titular, saldo, data_abertura);
		
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

}

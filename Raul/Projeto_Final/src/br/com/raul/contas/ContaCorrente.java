package br.com.raul.contas;

public class ContaCorrente extends Conta{

	public static final String tipo = new String("ContaCorrente");
	
	public ContaCorrente(long cpfTitular, double saldo, int numAgencia) {
		super(cpfTitular, saldo, numAgencia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void saca(double valor) {
		this.saldo = this.saldo - valor;
		System.out.println("Saque realizado com sucesso");
	}
	
}

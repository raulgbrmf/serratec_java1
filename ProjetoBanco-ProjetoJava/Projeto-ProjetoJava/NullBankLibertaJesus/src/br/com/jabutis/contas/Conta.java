package br.com.jabutis.contas;


public abstract class Conta extends SeguroDeVida{
	
	protected String titular;
	protected long cpf;
	protected double saldo;
	protected int idAgencia;
	protected int numConta;
	public String tipo;
	
	
	
	Conta(String titular, long cpf, double saldo, int idAgencia, int numConta) {
		super();
		this.titular = titular;
		this.cpf = cpf;
		this.saldo = saldo;
		this.idAgencia = idAgencia;
		this.numConta = numConta;
	}

	public void saca(double valorDigitado) { 
		if (this.saldo >= valorDigitado) {
			this.saldo = this.saldo - valorDigitado;
			
		} else {
			System.out.println("Saldo insuficiente.");
		}

	}
	
	
	public void deposita(double valorDigitado) {
		this.saldo = this.saldo + valorDigitado;
	}
	
	
	public void transfere(Conta destino, double valorDigitado) {
		if (this.saldo >= valorDigitado) {
			
			this.saca(valorDigitado);
			destino.deposita(valorDigitado);
			
		} else {
			System.out.println("Nao ha saldo o suficiente para a transferencia.");
		}

	}	
	

	public String getTipo() {
		return tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getIdAgencia() {
		return idAgencia;
	}

	public void setIdAgencia(int idAgencia) {
		this.idAgencia = idAgencia;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public long getCpf() {
		return cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public void descontoSeguro(double taxaSeguro) {
		this.saldo = saldo - taxaSeguro;
	}
	
	
	
	
	

	


}

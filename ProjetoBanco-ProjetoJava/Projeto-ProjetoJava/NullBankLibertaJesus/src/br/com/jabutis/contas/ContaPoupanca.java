package br.com.jabutis.contas;

public class ContaPoupanca extends Conta {
	
	public String tipo;
	
	public ContaPoupanca(String titular, long cpf, double saldo, int idAgencia, int numConta, String tipo) {
		super(titular, cpf, saldo, idAgencia, numConta);
		
		this.tipo = "CP";
		
	}

	public String getTipo() {
		return tipo;
	}
	
	
	@Override
	public void saca(double valorDigitado) {
		
		if(valorDigitado < 0) {
			throw new IllegalArgumentException("Você tentou sacar um valor negativo.");
		}
		if(this.saldo<valorDigitado) {
			throw new SaldoInsuficienteException();
		} 
		if (this.saldo >= valorDigitado) {
			this.saldo = this.saldo - valorDigitado;
		}
		
	}
	
	@Override
	public void deposita(double valorDigitado) {
		if(valorDigitado < 0) {
			throw new IllegalArgumentException("Você tentou depositar um valor negativo.");
		}
		if(valorDigitado > 0) {
			this.saldo = this.saldo + valorDigitado;
		}
	}
	
	@Override
	public void transfere(Conta destino, double valorDigitado) {
		if( destino == null) {
			throw new NullPointerException("Conta inexistente.");
		}
		if (valorDigitado < 0) {
			throw new IllegalArgumentException("Você tentou transferir um valor negativo.");
		}
		if(this.saldo < valorDigitado) {
			throw new SaldoInsuficienteException();
		}
		if (this.saldo >= valorDigitado) {
			
			this.saca(valorDigitado);
			destino.deposita(valorDigitado);
		}

	}
	
	
	
	
}

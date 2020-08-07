package br.com.caelum.contas.modelo;
import br.com.caelum.contas.data.Data;

public class Conta {
	private int numero;
	protected String Titular;
	protected String agencia;
	protected double saldo;
	protected Data dataDeAbertura;
	public static int identificador=0;
	
	public Conta(){	
		identificador += +1;
	}
	public Conta (int numero, String titular, String agencia){
		this.numero = numero;
		this.Titular = titular;
		this.agencia = agencia;
		identificador += +1;
	}
	
	public	String	getTipo() {
		return "Conta";
}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setTitular(String outroNome) {
		this.Titular = outroNome;
	}
	
	public String getTitular() {
		return Titular;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}	
	
	public String getAgencia() {
		return agencia;
	}
	
	public double getRendimento() {
		this.saldo = this.saldo*0.1;
		return this.saldo;
	}
	
	public double getSaldo() {
		return this.saldo;
	}

	public void deposita(double novoSaldo) {
		if(novoSaldo < 0) {
			System.out.println("Valor inválido para depósito, utilize a função saca neste caso.");
		}
		else if(novoSaldo == 0) {
			System.out.println("Valor nulo depositado, nenhuma mudança foi realizada.");
		}
		else {
		this.saldo = this.saldo + novoSaldo;
		}
	}
	
	public void saca(double novoSaldo) {
		if(novoSaldo > this.saldo) {
			System.out.println("O saque é maior do que o saldo disponível, nenhuma alteração foi realizada.");
		}
		else if(novoSaldo == 0) {
			System.out.println("Não é possível sacar um valor nulo, nenhuma alteração foi realizada.");
		}
		else {
		this.saldo = this.saldo - novoSaldo;
		}
	}
	
	public static int getIdentificador() {
		 return identificador;
	 }

	public String getDataDeAbertura() {
		return this.dataDeAbertura.dataFormatada();
	}

	public String recuperaDados() {
		 String dados = "Titular: " +this.Titular;
		 dados += "\nNúmero: " + this.numero;
		 dados += "\nAgência: " + this.agencia;
		 dados += "\nSaldo atual: " + this.saldo;
		 dados += "\nData: " + this.dataDeAbertura.dataFormatada();
	
	return dados;
	}
	
	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}
}




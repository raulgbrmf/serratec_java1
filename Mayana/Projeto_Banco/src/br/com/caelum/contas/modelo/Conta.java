package br.com.caelum.contas.modelo;

import br.com.caelum.usuario.PessoaFisica;
import br.com.caelum.util.Data;

public abstract class Conta {

	private int numero;
	private String agencia;
	private String titular;
	protected double saldo;
	private Data data_abertura;
	private static int totalDeContas;
	private PessoaFisica pessoa;
	protected String tipo;
	
	
	

	// construtores;

	public Conta(double saldo, int numero, String agencia, String titular) {
		this.saldo = saldo;
		this.numero = numero;
		this.agencia = agencia;
		this.titular = titular;
		this.totalDeContas = this.totalDeContas + 1;

	}
	
	public Conta() {
		
	}
	

	public void saca(double valor) {
			this.saldo -= valor;		
	}

	public void transfere( double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}

	
	public boolean deposita(double quantia){
		if (quantia > 0) {
			this.saldo = this.saldo + quantia;
			return true;
		}else {
			return false;
		}
	}

	public String recuperaDadosImpressao() {
		return "Nome do Titular: " + this.titular + "\nAgência: " + this.agencia + "\nNúmero da Conta: " + this.numero
				+ "\nSaldo Atual: R$" + this.saldo + "\nRendimento Mensal: R$" + calculaRendimento()
				+ "\nData de Abertura: " + this.data_abertura.imprimeData() + "\nCPF: " + this.pessoa.getCpf() 
				+ "\nTipo de Conta: " + this.getTipo();
	}

	public double calculaRendimento() {
		return this.saldo * 0.1;
	}

	public double getSaldo() {
		return this.saldo;

	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getAgencia() {
		return this.agencia;
	}

	public String getTitular() {
		return this.titular;
	}

	public static int getTotalDeContas() {
		return totalDeContas;
	}

	public Data getData_abertura() {
		return data_abertura;
	}

	public void setData_abertura(Data data_abertura) {
		if(data_abertura.dataValida()) {
			this.data_abertura = data_abertura;			
		}
	}

	public PessoaFisica getPessoa() {
		return pessoa;
	}

	public void setPessoa(PessoaFisica pessoa) {
		if(pessoa.validaCpf()) {
			this.pessoa = pessoa;
		}
		
	}
	

	public abstract String getTipo();	

}
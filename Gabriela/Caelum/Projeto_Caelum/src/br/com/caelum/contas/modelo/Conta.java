package br.com.caelum.contas.modelo;

import br.com.caelum.util.Data;

public class Conta {

	private String titular;
	private static int totalContas;
	private  int identificador ; // ---------------> Capitulo 5 Questão 5
	private int numero;
	private String agencia; // -------------> Capitulo 5 Questão 1
	private double saldo;
	Data data_abertura;
	
	Data dataMinhaConta = new Data(15, 3 , 2020);
	Data dataSuaConta = new Data(21, 7, 2015);

	// Criando os construtores
	
	public Conta(){
		
		totalContas = totalContas + 1;
		this.identificador = totalContas;
		
	}
	
	public Conta(int numero, String titular, String agencia, double saldo, Data data_abertura) {

		this.numero = numero;
		this.titular = titular;
		this.agencia = agencia;
		this.saldo = saldo;
		this.data_abertura = data_abertura;
	}

	
	

	// Criando os getters e setters

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}
	
	
	
	public void setData_abertura(Data data_abertura) {
		if(data_abertura.validaData()) {
		this.data_abertura = data_abertura;
		}
	}




	public int getIdentificador() {
		return identificador;
	}
	
	public int gettotalContas() {
		return totalContas;
	}
	


	// Criando os métodos

	/*void saca(int valor) {

		this.saldo = this.saldo - valor;

	}*/
	
	
	/*String saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;  // COMO FAZ PRA RETORNAR UMA MENSAGEM DIZENDO QUE FOI OU NAO POSSIVEL REALIZAR O SAQUE (Se for boolean)???
			 return "Vê sacoocu : " + valor;
		} else {
			return "Saldo insuficiente para realizar saque com esse valor!";
		}

	}*/
	
	public boolean saca (double valor) {
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
	}

	/*void transfere(Conta destino, int valor) {
		this.saldo = this.saldo - valor;          ----------------> Não consegui chamar o método transfere na minha main.
		destino.saldo = destino.saldo + valor;
	}*/
	
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	 boolean transfere(Conta destino, double valor) {
		boolean retirou = this.saca(valor);
		if(retirou == false) {
			return false;
		}
		
		else {
			destino.deposita(valor);
			return true;
		}
		
	}

	double calculaRendimento() {
		return this.saldo = this.saldo * 0.1;
	}

	public String recuperaDadosParaImpressao(Data data) {
		boolean validacao = data.validaData();
		if (validacao == false) { //---------------------> perguntar se é pra deixar a msg de erro
			
			return "O número da conta é: " + this.numero + "\n" + "O titular da conta é: " + this.titular + "\n"
					+ "A agência é: " + this.agencia + "\n" + "A data de abertura da conta é: Data inválida"
					 + "\n" + "O saldo da conta é: " + this.saldo + "\n";
			
		}
		
		return "O número da conta é: " + this.numero + "\n" + "O titular da conta é: " + this.titular + "\n"
				+ "A agência é: " + this.agencia + "\n" + "A data de abertura da conta é: "
				+ this.data_abertura.imprimeData() + "\n" + "O saldo da conta é: " + this.saldo + "\n";
	}
}

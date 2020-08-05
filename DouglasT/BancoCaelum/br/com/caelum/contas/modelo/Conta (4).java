package br.com.caelum.contas.modelo;

import br.com.caelum.banco.util.Data;
import br.com.caelum.usuario.PessoaFisica;

public class Conta {

	private String titular;
	private int numero;
	private String agencia;
	protected double saldo;
	private Data dataAbertura;
	private PessoaFisica pessoa;
	public String tipo ;
	
	public String getTipo() {
		return "Conta";
	}

	public PessoaFisica getPessoa() {
		return pessoa;
	}

	public void setPessoa(PessoaFisica p1) {
		if(p1.validaCPF()) {
			this.pessoa = p1;
		}
	}

	public Conta (){
		
	}

	public Conta(String titular){
		this.titular = titular;
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}

	}

	public void deposita(double valor) {
		this.saldo = this.saldo + valor; // ---- Exercicios cap.4 num 1 e 2*/
	}

	public boolean transfere(double valor,Conta destino) {
		if (this.saca(valor)) {
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}

	public Data getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Data dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public double getRendimento() {           //---- Exercicios cap.5 num 2.1
		return this.saldo * 0.1;	
	}
	

	String recuperaDadosParaImpressao() {// ---Exercicios cap.4 num 3

		return "Titular: " + this.titular + "\nAngeica: " + this.agencia + "\nNº Conta: " + this.numero
				+ "\nData Abertura de Conta: " + this.dataAbertura.imprimeData() + "\nSaldo Atual: " + this.saldo;
	}

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

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}

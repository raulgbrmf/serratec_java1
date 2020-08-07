package br.com.caelum.contas;

import java.util.Random;
import java.util.Scanner;
import br.com.caelum.controle.Data;

public class AberturaDeContas extends Conta{
	

	protected static String titular;
	protected int numeroConta;	
	protected int agencia;
	protected static double saldo = 0;
	protected static double limite = 1000.00;
	protected static int senha;
	protected static int totalDeContas = 0;
	
	
	 Scanner s = new Scanner(System.in);
	 Random r = new Random();
	
		 
	 
	public void setTitular(String titular) {
		titular = s.toString();		
	}
	
	public static String getTitular() {
		return titular;
	}
	
	public void setAgencia(int agencia) {
		for(int i = 0 ; i <= 16 ; i++) {
			this.agencia = r.nextInt(10);
			System.out.println("Número da agencia: " +this.agencia);
		}
	}
	
	public void setNumeroConta(int numeroConta) {
		for(int i = 0 ; i <= 16 ; i++) {
			this.numeroConta = r.nextInt(10);
			System.out.println("Número da conta: " +this.numeroConta);
		}
	}
	
	public int getAgencia() {
		return this.agencia;		
	}
	
	public int getNumeroConta() {
		return this.numeroConta;
	}
	
	public void setSenha(int senha) {
		System.out.println("Defina uma senha com 6 digitos: [Ela deverá conter apenas números] ");
			senha = s.nextInt();
	}	
	
	public static int getSenha() {
		return senha;
	}
	
	public static double getLimite() {
		return limite;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
			
	public String recuperaDadosParaImpressao() {
		String dados = "Titular : " +titular;
		dados += "\nNumero da conta: " +this.numeroConta;
		dados += "\nNumero da agencia: " +this.agencia;
		dados += "\nSeu saldo: " +saldo;
		dados += "\nData de abertura da conta: " + Data.getData();

		return dados;
		
	
	}

}

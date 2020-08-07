package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaArrays {

	public static void main(String[] args) {
		
		Conta[] contas = new Conta[10];
		double soma=0;
		
		for(int i=0;i<contas.length;i++) {//Popula os saldos
			contas[i]=new ContaCorrente();
			contas[i].deposita(i*100);
		}
		
		for(int i=0;i<contas.length;i++)//Imprime os saldos
			System.out.println(contas[i].getSaldo());
		
		for(int i=0;i<contas.length;i++)//Faz a soma dos saldos
			soma+=contas[i].getSaldo();
		
		System.out.println("A média dos saldos é "+(soma/contas.length)+".");
	}

}

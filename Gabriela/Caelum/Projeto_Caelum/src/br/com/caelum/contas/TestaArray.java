package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;

public class TestaArray {

	public static void main(String[] args) {
		
		Conta[] contas = new Conta[10];
		
		for(int i= 0; i< contas.length; i ++) {
			
			Conta conta = new Conta();
			conta.deposita(i*100);
			
			contas[i]= conta;
			
			System.out.println(contas[i]);
			
			
			
		}
		double soma = 0;
		for (int i= 0; i < contas.length; i++) {
			soma = soma + contas[i].getSaldo();
		

		
		System.out.println("A soma total é: " + soma);
		System.out.println("A média é: " + soma / contas.length);
		}
	}

}

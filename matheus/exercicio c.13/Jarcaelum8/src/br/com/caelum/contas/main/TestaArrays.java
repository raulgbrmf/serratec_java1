package br.com.caelum.contas.main;

import java.util.Arrays;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaArrays {

	public static void main(String[] args) {
		Conta[] contas = new Conta[10];
		for (int i = 0; i < contas.length; i++) {
			Conta conta = new ContaCorrente();
			conta.deposita(i * 100.0);
			contas[i] = conta;
		}

		int media = 0, soma = 0;
		for (int i = 0; i < contas.length; i++) {

			System.out.println(contas[i].getSaldo());
			soma += contas[i].getSaldo();
		}
		media = soma / contas.length;
		System.out.println(media);

		
		String a = "socorram-me, subi no onibus em Marrocos";
		
		String[] separa = a.split(" ");

		for (int i = separa.length - 1; i >= 0; i--) {
			System.out.print(separa[i] + " ");

		}
		System.out.println(Arrays.toString(separa));

	}

}

package br.com.caelum.contas.modelo;

import java.util.Scanner;

public class Data {
	int dia;
	int mes;
	int ano;
	Scanner read = new Scanner(System.in);

	public Data() {

		while (dia == 31 & mes == 2 & ano == 2012) {
			System.out.print("escolha outro dia: ");
			dia = read.nextInt();

			System.out.print("escolha outro mes: ");
			mes = read.nextInt();

			System.out.print("escolha outro ano: ");
			ano = read.nextInt();
		}

	}

	public String formatada() {
		return dia + "/" + mes + "/" + ano;
	}

}

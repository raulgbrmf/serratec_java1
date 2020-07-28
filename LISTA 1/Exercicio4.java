package exercicios.lista1;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {

		int num, soma = 0;
		Scanner read = new Scanner(System.in);

		System.out.print("Número de entrada é :");

		num = read.nextInt();

		for (int i = 0; i < num * 2; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
				soma += i;
			}

		}
		System.out.println("A soma dos números ímpares naturais até " + num + " é :" + soma);

		read.close();

	}

}

package Exercicios_Lista_1;

import java.util.Scanner;

public class Exe3 {
	public static void main(String[] args) {

		int num, soma = 0;
		Scanner read = new Scanner(System.in);

		System.out.print("N�mero de entrada � :");

		num = read.nextInt();

		for (int i = 0; i < num; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
				soma += i;
			}

		}
		System.out.println("A soma dos n�meros �mpares naturais at� " + num + " � :" + soma);

		read.close();

	}
}

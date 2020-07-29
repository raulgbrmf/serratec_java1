package listaExercicioQuatro;

import java.util.Scanner;

public class TrianguloNumeros {

	public static void main(String[] args) {

		int i;
		int j;
		int numero;

		Scanner s1 = new Scanner(System.in);

		System.out.print("Digite um número: ");
		numero = s1.nextInt();

		for (i = 1; i <= numero; i++) {
			for (j = 1; j <= i; j++) {

				System.out.print(j);

			}

			System.out.println(" ");
		}
	}

}

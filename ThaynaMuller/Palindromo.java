package listaExercicioCinco;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		int numero;
		int mod;
		int resto;
		int inversao = 0;

		Scanner s1 = new Scanner(System.in);
		numero = s1.nextInt();

		for (mod = numero; numero != 0; numero = numero / 10) {
			resto = numero % 10;
			inversao = (inversao * 10 + resto);

		}
		if (mod == inversao) {
			System.out.println("O número " + mod + " é palíndromo");
		} else {
			System.out.println("O número " + mod + " não é palíndromo");
		}

		s1.close();
	}

}

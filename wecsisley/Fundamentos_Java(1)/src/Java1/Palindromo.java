package Java1;

import java.util.Scanner;

public class Palindromo {
	public static void main(String[] args) {

		int numero, aux, resto;
		int palindromo = 0;

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o número desejado: ");
		numero = entrada.nextInt();

		for (aux = numero; numero != 0; numero = numero / 10) {

			resto = numero % 10;
			palindromo = (palindromo + resto) * 10;
		}

		palindromo = palindromo / 10;

		if (aux == palindromo) {
			System.out.print(aux + " Número Palindromo");
		} else {
			System.out.print(aux + " Número não Palindromo");
		}
		
		entrada.close();
	}
}

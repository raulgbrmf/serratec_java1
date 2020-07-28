package lista01;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero = scanner.nextInt();
		
		scanner.close();
		
		for (int i = 1; i <= numero; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}

			System.out.println("");
		}

	}

}

package Cap3_Ex8;

import java.util.Scanner;

public class NumEncadeados {

	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int numero = s1.nextInt();

		for (int i = 1; i <= numero; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print(i * j + " ");
			}
			System.out.println(" ");
		}

		s1.close();
	}

}

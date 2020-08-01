package Cap3_Ex7;

import java.util.Scanner;

public class NovoX {

	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int X = s1.nextInt();

		for (int i = 0; i < X; i++) {
			while (X > 1) {

				if (X % 2 == 0) {

					X = X / 2;
					System.out.print(X + " - ");
				}

				else {

					X = 3 * X + 1;
					System.out.print(X + " - ");

				}

			}
		}

		s1.close();
	}
}

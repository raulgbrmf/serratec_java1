package Java1;

import java.util.Scanner;

public class TrianguloDeNumerosAvancado {
	public static void main(String[] args) {

		int contador = 1;

		Scanner entrada = new Scanner(System.in);
		System.out.print("informe o número de filas: ");
		int filas = entrada.nextInt();

		while (contador <= filas) {
			int coluna = 1;
			while (coluna <= contador) {
				System.out.print(coluna + coluna);
				coluna = coluna +1;
			}
			System.out.print(" ");
			contador = contador + 1;
			System.out.println();
		}
		entrada.close();
	}
}

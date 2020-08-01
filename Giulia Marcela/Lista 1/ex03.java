package listaJava;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {

		Scanner saida = new Scanner(System.in);
		System.out.print("Número de entrada: ");
		int numero = saida.nextInt();
		int resultado = 0;

		System.out.println("Os números ímpares são:");
		for (int i = 0; i <= numero * 2; i++) {
			if (i % 2 != 0) {
				resultado += i;
				System.out.println(i);
			}
		}

		System.out.print("A soma dos números ímpares naturais até " + numero + " é: " + resultado);

		saida.close();
	}
}

// 3 - Escreva um programa em Java para exibir os n termos do número natural ímpar e sua
// soma.

import java.util.Scanner;

public class Lista_1_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);	
		System.out.print("Digite um número: ");
		int num = scan.nextInt();
		System.out.print("Os números ímpares são: ");
		int r = 0;
			for (int i = 0; i <= num * 2; i++) {
				if (i % 2 == 1) {
					System.out.println(i);	
					r = r + i;
			}
		}System.out.print("A soma dos números ímpares naturais é: " + r);
		scan.close();
	}
}
// 4 - Escreva um programa que imprima o seguinte padrão de número em formato de
// triângulo dado um número n.

import java.util.Scanner;

public class Lista_1_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);	
		System.out.print("Digite um número: ");
		int num = scan.nextInt();
			for (int i = 1; i <= num; i++) {
				System.out.print("\n");
				for (int j = 1; j <= i; j++) {
					System.out.print(j);
				}scan.close();
			}
	}
}

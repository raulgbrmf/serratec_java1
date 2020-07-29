package Exercicios_Lista_1;

import java.util.Scanner;

public class Exe4 {
	public static void main(String[] args) {

		int num;
		Scanner read = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		num = read.nextInt();

		for (int i =1; i <=num; i++) {
			for (int j =1; j<=i; j++) {
				System.out.print(j);	
			}
			System.out.println();
		}
		
		read.close();

	}
}

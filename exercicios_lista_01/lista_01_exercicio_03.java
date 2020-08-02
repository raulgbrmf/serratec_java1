package exercicios_lista_01;

import java.util.Scanner;

public class lista_01_exercicio_03 {

	public static void main(String[] args) {

		int imp = -1;
		int soma = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Número de entrada : ");
		int num = scan.nextInt();
		
		System.out.println("Os números ímpares são : ");

		for (int i = 0; i < num; i++) {
			imp = imp + 2;
			System.out.println(imp);
			soma = soma + imp;
		}

		System.out.println("A soma dos números ímpares naturais até " + num + " é : " + soma);
		scan.close();
	}

}

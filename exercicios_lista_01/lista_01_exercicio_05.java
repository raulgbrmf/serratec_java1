package exercicios_lista_01;

import java.util.Scanner;

public class lista_01_exercicio_05 {

	public static void main(String[] args) {

		int soma = 0;
		int resp;
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();		
				
		for (resp = num; num != 0; num = num/10) {
			int mod = num % 10;
			soma = soma * 10 + mod;
		}
		
		
		if (resp == soma) {
			System.out.println(resp + " é número um palíndromo.");
		} else {
			System.out.println(resp + " não é número um palíndromo.");
		}
		
	}

}

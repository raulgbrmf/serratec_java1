package listaJava;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		
		Scanner saida = new Scanner(System.in);
		int numero = saida.nextInt();
		
		for(int contador = 1; contador <= numero; contador++) {
			for(int i = 1; i <= contador; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
		saida.close();
	}
}

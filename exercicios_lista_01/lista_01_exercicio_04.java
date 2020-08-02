package exercicios_lista_01;

import java.util.Scanner;

public class lista_01_exercicio_04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		for (int i = 1; i <= num; i++) {
			for ( int j = 1; j <= i; j++) {
				System.out.print(j + " ");
				
			}
			
			System.out.println(" ");
		}
				
		scan.close();
	}

}

package caelum;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		
		Scanner saida = new Scanner (System.in);
		int numero = saida.nextInt();
		
		for (int i = 1; i <= numero; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(j * i + " ");
			}
			System.out.println();
		}
		saida.close();
	}
}

package ExercíciosRaul;

import java.util.Scanner;

public class Exercicio4Raul {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num , cont, cont2;
		
		num = scan.nextInt();
		
		for(cont = 1; cont <= num; cont ++) {
			for(cont2 = 1; cont2 <= cont; cont2 ++) {
				System.out.print(cont2);
			}
			System.out.println(" ");
		}

	}

}

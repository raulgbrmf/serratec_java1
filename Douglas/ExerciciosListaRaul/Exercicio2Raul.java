package ExercíciosRaul;

import java.util.Scanner;

public class Exercicio2Raul {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Double cel,res;
		
		System.out.println("Digite o valor da temperatura em Celsius : ");
		cel = scan.nextDouble();
		
		res = cel * 1.8 + 32;
		
		System.out.print(cel+" graus Celsius , é o mesmo que "+res +" graus Fahrenheit.");
		
		scan.close();
	}
}
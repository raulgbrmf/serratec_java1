package ExercíciosRaul;

import java.util.Scanner;

public class Exercicio3Raul {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num, impar = 0, cont = 0, soma = 0;
		
		System.out.println("Número de entrada é : ");
		num = scan.nextInt();
		
		while(impar < num){
			if(cont % 2 != 0) {
				impar ++;
				System.out.println(cont+" ");
				soma = soma + cont;	
			}
			cont++;
		}
		System.out.println("A soma dos números ímpares naturais até "+num+" é : "+soma);
		scan.close();
	}
}
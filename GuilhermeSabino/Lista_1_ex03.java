package guilherme;

import java.util.Scanner;

public class Lista_1_ex03 {

	public static void main(String[] args) {
			
		Scanner userInput = new Scanner(System.in);
		System.out.print("Número de entrada é : ");
		int numDeTermos = userInput.nextInt();
		
		System.out.println("Os números ímpares são : ");

		int soma = 0;
		int impar = 1;
		for (int i = 0; i < numDeTermos; i++, impar += 2) {
			System.out.println(impar);
			soma += impar;			
		}
				
		System.out.println("A soma dos números ímpares naturais até " + 
		numDeTermos + " é : " + soma);
	}

}

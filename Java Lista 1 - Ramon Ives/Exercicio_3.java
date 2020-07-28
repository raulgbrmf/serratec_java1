//Escreva um programa em Java para exibir os n termos do número natural ímpar e sua soma. 
//Exemplo de entrada​: Número de entrada é : 5  
//Saída esperada: Os números ímpares são : 1 3 5 7 9 
//A soma dos números ímpares naturais até 5 é : 25

import java.util.Scanner;
public class Exercicio_3 {

	public static void main(String[] args)  {
		
		Scanner scanner = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite um numero: ");
		n = scanner.nextInt();
		
		System.out.println("Os números ímpares são: ");
		
		int contador = 0;
		int impar = 1;
		int soma = 0;
		
		while (contador < n) {
			
			System.out.println(" " + impar);
		
			impar = impar + 2;
			contador = contador + 1;
			soma = n * n; 		}
		 System.out.println("A soma dos números ímpares naturais até " + n + " é: " + soma);
		 
		 scanner.close();	
		}
	
}


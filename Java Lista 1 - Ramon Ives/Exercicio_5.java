//Escreva um programa que verifique se um número é um palíndromo ou não. 
//Exemplo de entrada​: 12321 
//Saída esperada: 12321 é um número palíndromo 

import java.util.Scanner;
public class Exercicio_5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num;
		int aux;
		int numreverso = 0;
		
		System.out.println("Digite um número: ");
		num = scanner.nextInt();
		scanner.close();
		
		aux = num;
		
		while (aux != 0) 
		{
			numreverso = numreverso * 10 + aux % 10;
			aux =  aux / 10;
			
		}
		
		if (numreverso == num) 
		{
			System.out.println(num + " " + " é um palíndromo");
		}
		else 
		{
			System.out.println(num + " " + " não é um palíndromo");
		}
		
	}

}

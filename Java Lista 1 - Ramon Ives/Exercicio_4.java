//Escreva um programa que imprima o seguinte padrão de número em formato de triângulo dado um número n. 
//Exemplo de entrada​: 4 
//Saída esperada: 
//1 
//12 
//123 
//1234

import java.util.Scanner;
public class Exercicio_4 {

	public static void main(String[] args) {
	 
		Scanner scanner = new Scanner(System.in);
	
		int num;
		int contador1;
		int contador2;
		
		System.out.print("Digite um número: ");
		num = scanner.nextInt();
		
		scanner.close();
		
		for (contador1 = 1; contador1 <= num; contador1++) 
		{
			for (contador2 = 1; contador2 <= contador1; contador2++) 
			{
				System.out.print(contador2);
			}
			System.out.print("\n");
		}

	}

}

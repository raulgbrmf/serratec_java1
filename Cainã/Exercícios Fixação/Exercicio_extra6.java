import java.util.Scanner;

/*Write a Java program and compute the sum of the digits of an integer. Go to the editor
Input Data:
Input an integer: 25
Expected Output

The sum of the digits is: 7*/


public class Exercicio_extra6 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int num = scan.nextInt(), aux = 0;
		
		while(num != 0)
		{
			aux = aux + (num % 10);
		}
		
		System.out.print(aux);
		scan.close();
	}
}

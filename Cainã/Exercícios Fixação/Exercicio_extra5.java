import java.util.Scanner;

/*Write a Java program to compare two numbers
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output

25 != 39                                                                          
25 < 39                                                                           
25 <= 39*/

public class Exercicio_extra5 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int num1 = scan.nextInt();
		System.out.print("Digite outro número inteiro: ");
		int num2 = scan.nextInt();
		
		if(num1 < num2)
		{
			System.out.println(num1 + " < " + num2);
		}
		else if(num1 > num2)
		{
			System.out.println(num1 + " > " + num2);
		}
		else
		{
			System.out.println(num1 + " = " + num2);
		}
	}
}

import java.util.Scanner;

//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

/*Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5*/

public class Exercicio_extra2 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		double num1 = scan.nextDouble();
		System.out.print("Digite o segundo número: ");
		double num2 = scan.nextDouble();
		
		double soma = num1 + num2;
		double sub = num1 - num2;
		double divisao = num1 / num2;
		double multi = num1 * num2;
		double sobra = num1 % num2;
		
		System.out.println();
		
		System.out.println(num1 + " + " + num2 + " = " + soma);
		System.out.println(num1 + " - " + num2 + " = " + sub);
		System.out.println(num1 + " / " + num2 + " = " + divisao);
		System.out.println(num1 + " * " + num2 + " = " + multi);
		System.out.println(num1 + " % " + num2 + " = " + sobra);
		
		scan.close();
	}
}

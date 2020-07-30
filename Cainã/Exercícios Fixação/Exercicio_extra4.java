import java.util.Scanner;

//Write a Java program to print the area and perimeter of a rectangle.
public class Exercicio_extra4 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a base do retângulo(em cm): ");
		double base = scan.nextDouble();
		System.out.print("Digite a altura do retângulo(em cm): ");
		double altura = scan.nextDouble();
		
		double area = base * altura;
		
		double perimetro = (base + altura) * 2;
		
		System.out.println("Area é " + base + " * " + altura + " = " + area);
		System.out.println("Perímetro é: " + "2 * (" + base + " + " + altura + ") = " + perimetro);
		
		scan.close();
	}
}

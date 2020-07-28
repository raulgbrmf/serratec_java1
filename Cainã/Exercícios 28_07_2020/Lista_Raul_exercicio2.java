import java.util.Scanner;

public class Lista_Raul_exercicio2 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor da temperatura em Celsius: ");
		double celsius = scan.nextDouble();
		double fahrenheit = (celsius * 9/5) + 32;
		
		System.out.print(celsius + " graus Celsius é o mesmo que " + fahrenheit + " graus Fahrenheit");
		scan.close();
	}
}

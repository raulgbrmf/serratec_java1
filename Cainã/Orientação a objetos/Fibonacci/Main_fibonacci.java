import java.util.Scanner;

public class Main_fibonacci 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Fibonacci_recursivo fibonacci = new Fibonacci_recursivo();
		
		System.out.print("Digite quantos números da sequência Fibonacci deseja ver: ");
		int num = scan.nextInt();
		
		for(int i = 1; i <= num; i++)
		{
			int resultado = fibonacci.calculaFibonacci(i);
			System.out.print(resultado + " ");
		}
		scan.close();
	}
}

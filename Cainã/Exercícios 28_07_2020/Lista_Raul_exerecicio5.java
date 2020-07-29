import java.util.Scanner;

public class Lista_Raul_exerecicio5 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int num, n, resto = 0;
		int numInv = 0;

		num = scan.nextInt();
		scan.close();

		for (n = num; num > 0; num = num / 10)
		{
			resto = num % 10;
			numInv = (numInv + resto) * 10;
		}
		numInv = numInv / 10;
		if (numInv == n)
		{
			System.out.print(n + " é um número palíndromo");
		}
		else
		{
			System.out.print(n + " não é um número palíndromo");
		}
	}
}

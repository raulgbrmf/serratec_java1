import java.util.Scanner;

public class Exercicio_extra3 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int resp = 1;
		
		while(resp == 1)
		{
			System.out.print("Digite o 1º número: ");
			double num1 = scan.nextDouble();
			System.out.print("Digite o 2º número: ");
			double num2 = scan.nextDouble();
			System.out.print("Digite o 3º número: ");
			double num3 = scan.nextDouble();
			System.out.println();
			
			double result = (num1 + num2 + num3) / 3;
			
			System.out.println("A média entre " + num1 + ", " + num2 + " e " + num3 + " é igual a " + result);
			System.out.println();
			
			System.out.print("Deseja continuar testando o programa? (Use '1' para 'sim' ou '2' para não) : ");
			resp = scan.nextInt();
			System.out.println();
		}
		
		scan.close();
		
		if(resp == 2)
		{
			System.out.print("Game Over");
		}
		else
		{
			System.out.print("ERRO!!! Reinicie o programa e use '1' para 'sim' ou '2' para não");
		}
	}
}

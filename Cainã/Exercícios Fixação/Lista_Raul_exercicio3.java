import java.util.Scanner;

public class Lista_Raul_exercicio3 
{
	public static void main(String[] args) 
	{
		int res = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Número de entrada: ");
		int num = scan.nextInt();
		
		System.out.println("Os números ímpares são: ");
		
		for(int i = 0; i <= num * 2; i++)
		{
			if(i % 2 != 0)
			{
				res = res + i;
				System.out.println(i);
			}
		}
		scan.close();
		
		System.out.print("A soma dos números ímpares naturais até o " + num + "º é: " + res);
	}

}

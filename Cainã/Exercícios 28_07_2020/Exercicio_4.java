
public class Exercicio_4 
{
	public static void main(String[] args) 
	{
		long fat = 1, n;
		for(n = 1; n <= 30; n++)
		{
			fat = fat * n;
			System.out.println("O fatorial de " + n + " é " + "(" + (n - 1) + "!) * "
			+ n + " = " + fat);
		}
	}
}

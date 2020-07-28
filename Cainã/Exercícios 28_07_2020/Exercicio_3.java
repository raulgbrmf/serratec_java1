// Imprima	todos	os	múltiplos	de	3,	entre	1	e	100.
public class Exercicio_3 
{

	public static void main(String[] args) 
	{
		int i = 1;
		while(i <= 100)
		{
			if(i % 3 == 0)
			{
				System.out.print(i + " ");
			}
			i++;
		}
	}

}

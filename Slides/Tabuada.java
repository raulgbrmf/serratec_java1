

import java.util.Scanner;
public class Tabuada 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int numero, resultado, contador;
		
		System.out.println("Informe um numero para ver sua tabuada:");
		numero = scanner.nextInt();
		
		for (contador = 1; contador <= 10; contador++)
		{
			resultado = numero * contador;
			System.out.println(numero +" x "+ contador + " = "+ resultado + "\n");
			scanner.close();

		}
	}

}

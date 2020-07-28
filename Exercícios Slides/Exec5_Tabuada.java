	import java.util.Scanner;
	
public class Exec5_Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int numero,resultado, contador;
		
		
		System.out.println ("Informe um número para ver sua tabuada: ");
		numero = scanner.nextInt();
		
		for ( contador = 1 ; contador <= 10; contador ++)
		{
				resultado = numero*contador;
				System.out.println ( numero + "X" + contador + "=" + resultado);
		}
		scanner.close();
	
	}

}

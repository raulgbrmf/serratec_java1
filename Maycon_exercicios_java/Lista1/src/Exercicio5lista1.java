import java.util.Scanner;

public class Exercicio5lista1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int numero, numero2, aux = 0;
			
			
			System.out.println("escreva um número: ");
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			numero = scan .nextInt();
			
			numero2 = numero;
			
			while ( numero2 != 0) {
				aux = aux*10 + numero2%10;
				numero2 = numero2/10;
			}
			
			if(aux == numero) {
			System.out.println("é um palindromo");
			
			
			}
			
			else {
			System.out.println("não é um palindromo");			}
			
	}

}

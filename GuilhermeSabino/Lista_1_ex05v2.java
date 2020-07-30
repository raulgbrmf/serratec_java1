package guilherme;
import java.util.Scanner;

public class Lista_1_ex05v2 {

	public static void main(String[] args) {
		
			int n, soma, aux, resto = 0;
			
			Scanner scan = new Scanner(System.in);
			
			n = scan.nextInt();
			
			soma = n;
			aux = n;
			
			while (n > 0) {
				resto = (resto * 10) + (n % 10);
				n = n / 10;
			}
			if (resto == soma) {
				
				System.out.println(aux + " é um número palíndromo");
			} 
			else {
				System.out.println(aux + " não é um número palíndromo");
			}

	}

}

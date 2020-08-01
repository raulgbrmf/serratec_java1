
import java.util.Scanner;
public class Exercicio_7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		int aux = 0;
		
		System.out.println("Informe um valor inteiro: ");
		num = scan.nextInt();
	
		while (num !=1 ) {
			
			if (num % 2 == 0 ) {
				
				aux = num / 2;
				
				System.out.print(aux + " -> ");
			}
			else if (num % 2 != 0) {
				
				aux = 3 * num + 1;
				
				System.out.print(aux + " -> ");
				
			}
			
			num = aux;
		}
		
scan.close();
	}

}

import java.util.Scanner;
import java.util.concurrent.TimeUnit; 
 
public class Exercicio4lista1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

			int numero, contador1, contador2;
			
			System.out.println("escreva um número: ");
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			numero = scan .nextInt();
			
			for(contador1 = 1; contador1 <= (numero); contador1++) {
				
				for(contador2 = 1; contador2 <= (contador1); contador2++) {
					System.out.print(contador2);
					TimeUnit.SECONDS.sleep(1);
															
				}
				System.out.print("\n");

			}
			
	}

}

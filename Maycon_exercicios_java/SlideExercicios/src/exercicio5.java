import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class exercicio5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int numero, resultado, contador;
		
		System.out.println("Escreva um número para a Taboada:");
		numero = scan .nextInt();
		for (contador = 1; contador <= 10; contador++) {
			
			TimeUnit.SECONDS.sleep(1);
			
			
			resultado = numero * contador;
			System.out.println(numero + "X" + contador +" = " + resultado + "\n");
			
		}

	}

}

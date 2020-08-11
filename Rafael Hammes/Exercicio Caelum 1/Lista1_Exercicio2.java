import java.util.Scanner;
public class Lista1_Exercicio2 {
		public static void main(String[]args) {
			
			
			Scanner scan = new Scanner(System.in);
			int c, f;
			
			System.out.println("Digite a Temperatura em Celsius: ");
			c = scan.nextInt();
			
			f = (c * 9/5) + 32;
			
			System.out.println("A temperatura em Fahrenheit é: " + f + "ºF.");
		}
}

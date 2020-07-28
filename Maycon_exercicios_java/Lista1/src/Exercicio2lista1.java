import java.util.Scanner;


public class Exercicio2lista1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double Celsius, fahrenheit;
		
		System.out.println("digite o valor da temperatura em Celsius: ");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		Celsius = scan .nextInt();
		
		
		
		fahrenheit = ( Celsius * 1.8) + 32;
		System.out.println(Celsius + " " + "graus celsius em fahrenheit é: " + fahrenheit);

		
		

	}

}

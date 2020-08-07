import java.util.Scanner;
public class Exercicio_2 {
	public static void main(String[] args) {
		
		int temperatura, convertido;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite a temperatura em Celsius: ");
		temperatura = scanner.nextInt();
		
		convertido = (temperatura * 9/5) + 32;
		System.out.print(temperatura + " graus Celsius equivalem a " + convertido + " graus Fahrenheit.");
		
		
		
		scanner.close();
	}

}

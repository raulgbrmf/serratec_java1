import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int celsius;
		float F;
		
		System.out.print("Digite o valor da temperatura em Celsius :");
		celsius = scan.nextInt();
		
		F = ((celsius / 5) * 9) + 32;
		
		System.out.print(celsius + " graus Celsius é o mesmo que " + F + " graus Fahrenheit");
		

	}

}

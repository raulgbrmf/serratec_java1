import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o valor da temperatura em Celsius: ");
		Double Celsius = scan.nextDouble();
		Double Result = Celsius * 1.8 + 32;
		System.out.print(Celsius + " graus Celsius é o mesmo que " + Result + " graus Fahrenheit.");
		scan.close();
	}
}

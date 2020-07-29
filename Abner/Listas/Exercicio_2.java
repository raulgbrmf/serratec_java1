import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double celsius = 0;
		System.out.print("Digite um valor em celsius: ");
		celsius = scan.nextDouble();
		scan.close();

		double resultado = celsius * 1.8 + 32;
		System.out.print(celsius + " graus Celsius é o mesmo que " + resultado + " graus Fahrenheit." );
	}

}

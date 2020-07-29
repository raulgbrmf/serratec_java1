import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int temp_c;

		System.out.print("Digite o valor da temperatura em Celsius: ");
		temp_c = leia.nextInt();

		int temp_f = (temp_c * 9 / 5) + 32;

		System.out.println(temp_c + "°C é o mesmo que " + temp_f + "°F");

		leia.close();
	}
}

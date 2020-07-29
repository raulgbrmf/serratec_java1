import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int num1, num2, num3;

		num2 = leia.nextInt();

		for (num1 = 1; num1 <= num2; num1++) {
			System.out.println("");
			for (num3 = 1; num3 <= num1; num3++) {
				System.out.print(num3);
			}
		}

		leia.close();
	}
}

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int x;

		System.out.println("Digite um n�mero: ");
		x = scan.nextInt();

		while (x > 1) {
			if (x % 2 == 0) {
				x = x / 2;
				if (x == 1) {
					System.out.println(x);
				} else {
					System.out.print(x + "->");
				}
			} else {
				x = 3 * x + 1;
				if (x == 1) {
					System.out.println(x);
				} else {
					System.out.print(x + "->");
				}
			}
		}
		scan.close();
	}

}

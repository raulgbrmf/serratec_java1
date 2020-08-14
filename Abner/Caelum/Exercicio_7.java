import java.util.Scanner;

public class Exercicio_7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		scan.close();

		while (x != 1) {
			if (x % 2 == 0) {
				x = x / 2;
				System.out.print(x + " ");
			} else if (x % 2 != 0) {
				x = 3 * x + 1;
				System.out.print(x + " ");
			}
		}
	}
}

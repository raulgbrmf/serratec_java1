import java.util.Scanner;

public class VariavelX {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int x = scanner.nextInt();
		
		scanner.close();
		
		while (x != 1) {
			if (x % 2 == 0) {
				x = x / 2;
			} else {
				x = 3 * x + 1;
			}
			System.out.print(x + " -> ");
		}

	}

}

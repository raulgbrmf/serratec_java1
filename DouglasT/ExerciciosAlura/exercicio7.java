import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num;

		System.out.println("Digite um número: ");
		num = scan.nextInt();

		while (num > 1) {
			if (num % 2 == 0) {
				num = num / 2;
				if (num == 1) {
					System.out.print(num);

				} else {
					System.out.print(num + "->");
				}
			} else {
				num = 3 * num + 1;
				if (num == 1) {
					System.out.print(num);
				} else {
					System.out.print(num + "->");
				}
			}
		}
		scan.close();
	}
}

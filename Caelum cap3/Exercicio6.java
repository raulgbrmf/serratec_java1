import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite quantos números da sequência Fibonacci deseja ver: ");
		int num = scan.nextInt();

		int a = 1;
		int b = 0;
		for (int i = 0; i < num; i++) {
			b = b + a;
			a = b - a;
			System.out.print(a + " ");
		}
		scan.close();
	}
}

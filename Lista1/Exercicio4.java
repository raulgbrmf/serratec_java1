import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int num = scan.nextInt();
		for (int cont = 1; cont <= num; cont++) {
			int i = 1;
			while (i <= cont) {
				System.out.print(i + " ");
				i++;
			}
			System.out.println();
		}
		scan.close();
	}
}

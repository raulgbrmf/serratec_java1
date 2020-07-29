import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int num = scan.nextInt();
		scan.close();
		int soma = 0;

		for (int i = 0; i <= num * 2; i++) {
			if (i % 2 == 1) {
				soma = soma + i;
				System.out.println(i);
			}
		}
		System.out.print("A soma dos números ímpares naturais até " + num + " é : " + soma);
	}

}

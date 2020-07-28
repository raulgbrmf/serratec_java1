import java.util.Scanner;

public class Lista1Exercicio3_FormaCorreta {

	public static void main(String[] args) {

		int num, soma = 0;
		Scanner scan = new Scanner(System.in);

		System.out.print("Número de entrada é : ");

		num = scan.nextInt();

		for (int i = 0; i < num * 2; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
				soma = soma + i;
			}

		}
		System.out.println("A soma dos números ímpares naturais até " + num + " é : " + soma);

		scan.close();

	}

}
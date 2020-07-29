import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int num, soma = 0, a = 1;

		System.out.print("Digite um numero: ");
		num = leia.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.println(a);
			soma += a;
			a += 2;
		}

		System.out.println("Soma: " + soma);

		leia.close();
	}
}

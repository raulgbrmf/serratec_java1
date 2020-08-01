import java.util.Scanner;

public class lista1_ex3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num, op = -1, soma = 0;
		
		System.out.println("Número de entrada: ");
		num = scan.nextInt();

		System.out.println("Os números ímpares são: ");

		for (int i = 0; i < num; i++) {
			op += 2;
			System.out.println(op);
			soma = soma + op;
		}

		System.out.println("A soma dos números ímpares naturais até " + num + " é: " + soma);

	}

}
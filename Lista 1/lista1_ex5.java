import java.util.Scanner;

public class lista1_ex5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num, soma, resto = 0;
		
		System.out.println("Digite um n�mero: ");
		num = scan.nextInt();
		soma = num;

		while (num > 0) {
			resto = (resto * 10) + (num % 10);
			num = num / 10;
		}

		if (resto == soma) {
			System.out.println("O n�mero � um palindromo.");
		} else {
			System.out.println("O n�mero n�o � um palindromo.");
		}

		scan.close();

	}

}

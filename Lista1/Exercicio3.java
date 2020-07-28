
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Número de entrada é:");
		int numero = scan.nextInt();
		int Result = 0;
		System.out.println("Os número ímpares são: ");
		for (int i = 0; i <= numero * 2; i++) {
			if (i % 2 != 0) {
				Result = Result + i;
				System.out.println(i);
			}
		}
		System.out.print("A soma dos números ímpares naturais até " + numero + " é : " + Result);
		scan.close();
	}
}

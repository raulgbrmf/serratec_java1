import java.util.Scanner;

public class lista1_ex2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o valor da temperatura em Celsius : ");
		int c = scan.nextInt();

		float f = ((c / 5) * 9) + 32;

		System.out.print(c + "º celsius é o mesmo que " + f + "º fahrenheit");
		
	}

}

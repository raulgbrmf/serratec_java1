package guilherme;

import java.util.Scanner;

public class Lista01_ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor da temperatura em Celsius : ");
		int c = scan.nextInt();
		
		System.out.println(c + " graus Celsius é o mesmo que " + (((c / 5) * 9) + 32) + " graus Fahrenheit");
				
		scan.close();

	}

}

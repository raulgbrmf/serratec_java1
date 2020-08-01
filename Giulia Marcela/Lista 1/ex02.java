package listaJava;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {

		Scanner saida = new Scanner(System.in);
		System.out.print("Digite o valor da temperatura em Celsius: ");
		float celsius = saida.nextFloat();

		float fahrenheit = ((celsius * 9 / 5) + 32);

		System.out.print(celsius + " graus Celsius é o mesmo que " + fahrenheit + " graus Fahrenheit");

		saida.close();
	}
}

// 2 - Escreva um programa que receba a temperatura em Celsius e retorne o valor em Fahrenheit.

import java.util.Scanner;

public class Lista_1_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Digite uma temperatura em ºC: ");
		Double Celsius = scan.nextDouble();
		Double result = Celsius * 1.8 + 32;
		System.out.print(Celsius + " graus Celsius é o mesmo que " + result + " graus Fahrenheit.");
		scan.close();
	}
	
}

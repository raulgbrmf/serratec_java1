package lista01;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor da temperatura em Celsius: ");
		
		double temperaturaCelsius = scanner.nextDouble();
		
		scanner.close();
		
		double temperaturaFahrenheit = temperaturaCelsius * 1.8 + 32;
		
		System.out.println(temperaturaCelsius + " graus celsius é o mesmo que " +
		temperaturaFahrenheit + " Fahrenheit");
	}

}

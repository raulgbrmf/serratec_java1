package listaExercicioDois;

import java.util.Scanner;

public class ConversorTemperatura {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.print("Digite a temperatura em Celsius para obter sua conversão em Fahrenheit: ");
		double TemperaturaCelsius = s1.nextInt();
		
		double calculoTemperatura = (TemperaturaCelsius*1.8) + 32;
		
		System.out.println("A respectiva temperatura em Fahrenheit é : " + calculoTemperatura);
		
		
		s1.close();

	}

}

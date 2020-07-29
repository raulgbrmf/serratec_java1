import java.util.Scanner;
public class Convertertemperaturas {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//escrever uma temperatura em Celsius
		System.out.println("Digite uma temperatura em Celsius: ");
		float C = entrada.nextFloat();
		
		//converter de Celsius para Fahrenheit
		float F = C * (9f / 5) + 32;
		
		System.out.println(C + "  graus Celsius é o mesmo que  " + F +" graus Fahrenheit.");
		
		

	}

}

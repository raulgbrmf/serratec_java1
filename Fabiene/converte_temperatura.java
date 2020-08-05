package experimento_aula;

import java.util.Scanner;

public class converte_temperatura {
	public static void main(String[] args) { 
		Scanner ler=new Scanner (System.in);
		double celsius;
		double fahrenheit;
	
		System.out.printf("Digite o valor da temperatua em Celsius: ");
		celsius=ler.nextDouble();
		fahrenheit=(celsius*1.8+32);
		System.out.printf(celsius+" graus Celsius é o mesmo que "+fahrenheit+" graus Fahrenheit");
		
	}	
}





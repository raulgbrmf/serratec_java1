import java.util.Scanner;
public class Celcius_para_Fihrenheit {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double celcius, fahrenheit;
		
		System.out.println("Digite o valor da temperatura em Celcius: ");
		celcius = scan.nextInt();
		
		fahrenheit = ((celcius * 1.8) + 32);
		
		System.out.println(celcius +"° celcius é igual a "+ fahrenheit +"° fahrenheit.");
		
		scan.close();
	}
	
	
}

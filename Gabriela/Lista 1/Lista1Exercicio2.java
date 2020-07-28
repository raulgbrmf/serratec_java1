import java.util.Scanner;

public class Lista1Exercicio2 {

	public static void main(String[] args) {
		
		float celsius, faren;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor da temperatura em Celsius:\n");
		celsius = scan.nextFloat();
		
		faren = (celsius * 9/5) + 32; 
		System.out.println("\n" + celsius + " graus Celsius é igual a " + faren + " graus Fahrenheit.");
		
		scan.close();
		
	}

}

package exercicios_lista_01;

import java.util.Scanner;

public class lista_01_exercicio_02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o valor da temperatura em Celsius: ");
        double Celsius = scan.nextInt();
        
        double Fahrenheit = (Celsius * 1.8) + 32;
        
        System.out.println(Celsius + " graus Celsius é o mesmo que " + Fahrenheit + " graus Fahrenheit");
        scan.close();
    }

}

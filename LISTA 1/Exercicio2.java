package exercicios.lista1;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		Double c,f;
		Scanner read = new Scanner(System.in);

		System.out.print("Digite o valor da temperatura em Celsius:");
		
		c = read.nextDouble();
		
		f = (c * 9/5) + 32;
		
		System.out.println(c +" graus Celsius é o mesmo que "+ f + " graus Fahrenheit");
		
		read.close();

	}

}

package exercicios.lista1;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		String name,surName;
		Scanner read = new Scanner(System.in);

		System.out.print("Digite seu nome : ");
		
		name = read.nextLine();
		System.out.print("Digite seu sobrenome :");
		
		surName = read.nextLine();
		
		System.out.println("Seu nome é :"+  name + " " + surName );
		
		read.close();

	}

}

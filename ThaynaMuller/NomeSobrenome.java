package listaExercicioUm;

import java.util.Scanner;

public class NomeSobrenome {

	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);
		System.out.print("Digite seu nome: ");

		String nome = s1.nextLine();
		
		Scanner s2 = new Scanner(System.in);
		System.out.print("Digite seu sobrenome: ");
		
		String sobrenome = s2.nextLine();

		System.out.println("Seu nome é : " +nome+ " " +sobrenome);
		

		s1.close();
		s2.close();
	}

}

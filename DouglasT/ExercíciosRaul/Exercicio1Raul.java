package ExercíciosRaul;

import java.util.Scanner;

public class Exercicio1Raul {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String nome,sobre;
		
		System.out.println("Digite seu nome: ");
		nome = scan.next();
		System.out.println("Digite seu sobrenome: ");
		sobre = scan.next();
		
		System.out.print("Meu nome é : "+nome+" "+sobre);
		
		scan.close();
	}
}
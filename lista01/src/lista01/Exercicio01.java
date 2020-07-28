package lista01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		String nome, sobrenome;

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = scanner.nextLine();
		System.out.println("Digite seu sobrenome: ");
		sobrenome = scanner.nextLine();
		
		scanner.close();
		
		System.out.println("Meu nome é: " + nome + " " + sobrenome);
	}

}

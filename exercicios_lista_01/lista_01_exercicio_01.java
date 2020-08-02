package exercicios_lista_01;

import java.util.Scanner;

public class lista_01_exercicio_01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = scanner.next();
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = scanner.next();
		
		System.out.print("Meu nome é: " + nome + " " + sobrenome);
		scanner.close();
	}

}

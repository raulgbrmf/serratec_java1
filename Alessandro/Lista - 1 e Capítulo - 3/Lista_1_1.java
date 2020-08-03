// 1 - Escreva um programa que receba do teclado seu nome e seu sobrenome
// separadamente e escreva na tela seu nome completo como no exemplo abaixo:

import java.util.Scanner;

public class Lista_1_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Digite o seu nome: ");
		String nome = scan.next();
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = scan.next();
		System.out.print("Meu nome é: " + nome + " " + sobrenome);
		scan.close();
	}
}
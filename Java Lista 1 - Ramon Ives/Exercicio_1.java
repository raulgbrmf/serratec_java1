//Escreva um programa que receba do teclado seu nome e seu sobrenome separadamente e 
//escreva na tela seu nome completo como no exemplo abaixo:  
//Entrada: 
//Digite seu nome : Fulano 
//Digite seu sobrenome : de Tal 
//Saída: Meu nome é : Fulano de Tal

import java.util.Scanner;
public class Exercicio_1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String nome;
		String sobrenome;
		
		System.out.println("Digite seu nome: ");
		nome = scanner.next();
		
		System.out.println("Digite seu sobrenome: ");
		sobrenome = scanner.next();
		
		scanner.close();
		
		System.out.println("Seu nome é: " + nome + " " + sobrenome);
		
	}

}

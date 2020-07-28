import java.util.Scanner;
public class Exercio01 {
	/*1 - Escreva um programa que receba do teclado seu nome e seu sobrenome
	separadamente e escreva na tela seu nome completo como no exemplo abaixo:
	Exemplo:
	Entrada:
	Digite seu nome : Fulano
	Digite seu sobrenome : de Tal
	Saída:
	Meu nome é : Fulano de Tal*/
		
	public static void main(String[] args) {
		String nome;
		String sobrenome;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Digite seu nome: ");
		nome = scan.next();
		
		System.out.printf("Digite seu sobrenome: ");
		sobrenome = scan.next();
		
		System.out.println("Meu nome é : " + nome + " " + sobrenome);
		
		scan.close();
		
	}

}

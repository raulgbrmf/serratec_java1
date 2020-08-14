import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		System.out.print("Escreva seu nome: ");
		String nome = scan.nextLine();
		System.out.print("Escreva seu nome: ");
		String sobrenome = scan.nextLine();
		scan.close();
		
		System.out.print("Meu nome é: " + nome + " " + sobrenome);		

	}

}

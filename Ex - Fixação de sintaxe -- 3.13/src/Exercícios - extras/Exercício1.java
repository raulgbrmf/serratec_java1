import java.util.Scanner;

public class Exercício1 {
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		String nome = scan.next();
		
		System.out.println("Digite seu sobrenome: ");
		String sobrenome = scan.next();
		
		System.out.println("Meu nome é : " + nome + " de " + sobrenome);
	
	}
}

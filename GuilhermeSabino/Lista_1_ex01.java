package guilherme;
import java.util.Scanner;

public class Lista_1_ex01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome : ");
		String nome = scan.next();
		
		System.out.println("Digite seu sobrenome : ");
		String sobrenome = scan.next();
		
		System.out.println("Meu nome é : " + nome + " " + sobrenome);
				
		scan.close();

	}

}

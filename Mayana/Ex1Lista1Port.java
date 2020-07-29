import java.util.Scanner;

public class Ex1Lista1Port {

	public static void main(String[] args) {
		
		String nome; 
		String sobrenome;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite seu Nome:");
		nome = scan.next();
		
		System.out.print("Digite seu Sobrenome: ");
		sobrenome = scan.next();
		
		System.out.println("Seu nome é: " + nome+ " " + sobrenome);
		
		
	}

}

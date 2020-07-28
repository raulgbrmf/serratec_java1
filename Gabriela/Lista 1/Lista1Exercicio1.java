import java.util.Scanner;
public class Lista1Exercicio1 {

	public static void main(String[] args) {
		
		String nome;
		String sobrenome;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = scan.next();
		
		System.out.println("Digite seu sobrenome: ");
		sobrenome = scan.next();
		
		System.out.println("Seu nome completo é " + nome + " " + sobrenome);
		
		scan.close();
	}

}

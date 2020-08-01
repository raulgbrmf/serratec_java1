import java.util.Scanner;

public class lista1_ex1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite seu nome: ");
		String nome = scan.next();

		System.out.print("Digite seu sobrenome: ");
		String sobrenome = scan.next();

		System.out.print("Meu nome é: ");
		System.out.print(nome + " " + sobrenome);

	}

}

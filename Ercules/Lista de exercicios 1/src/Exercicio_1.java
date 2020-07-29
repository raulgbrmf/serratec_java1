import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String nome, sobrenome;

		System.out.print("Digite seu nome: ");
		nome = leia.nextLine();
		System.out.print("Digite seu sobrenome: ");
		sobrenome = leia.nextLine();

		System.out.println("Seu nome completo é: " + nome + " " + sobrenome);

		leia.close();
	}
}

import java.util.Scanner;
public class Exercicio_1 {

	public static void main(String[] args) {
		
		String nome, sobrenome;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		nome = scanner.nextLine();
		System.out.print("Digite o seu sobrenome: ");
		sobrenome = scanner.nextLine();
		System.out.print(nome + " " + sobrenome);
		
		scanner.close();
	}
	

}

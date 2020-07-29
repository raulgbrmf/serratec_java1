import java.util.Scanner;
public class Lista1_Exercicio1 {
		public static void main(String[]args) {
			
			
			Scanner scan = new Scanner(System.in);
			String nome, sobrenome;
			
			System.out.println("Digite seu nome: ");
			nome = scan.nextLine();
			
			System.out.println("Digite seu sobrenome: ");
			sobrenome = scan.nextLine();
			
			System.out.println("Meu nome é: " + nome + " " + sobrenome);
		}
}

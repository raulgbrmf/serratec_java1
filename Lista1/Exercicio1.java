import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Digite seu nome: ");
		String nome = scan.next();
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = scan.next();	
		System.out.print("Meu nome é: " + nome +" "+ sobrenome);
		scan.close();
	}
}
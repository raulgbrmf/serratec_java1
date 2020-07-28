import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		String nome,sobrenome;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		nome = ler.nextLine();
		System.out.print("Digite seu sobrenome: ");
		sobrenome = ler.nextLine();
		ler.close();
		
		System.out.println("Meu nome é "+nome+" "+sobrenome);
	}

}

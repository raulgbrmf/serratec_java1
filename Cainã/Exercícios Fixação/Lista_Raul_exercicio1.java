import java.util.Scanner;

public class Lista_Raul_exercicio1 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		String nome;
		String sobrenome;
		
		System.out.print("Escreva seu nome: ");
		nome = scan.next();
		System.out.print("Escreva seu sobrenome: ");
		sobrenome = scan.next();
		
		System.out.print("Seu nome é: " + nome + " " + sobrenome);
		scan.close();
	}
}

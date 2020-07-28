import java.util.Scanner;

public class Exercicio1lista1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  nome;
		String  sobrenome;

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("escreva seu nome: ");
		nome = scan .next();
		System.out.println("escreva seu sobrenome: ");
	    sobrenome = scan .next();
	    
	    System.out.println("seu nome completo é: " + nome + " " + sobrenome);

		
	    
	}
	


}


	import java.util.Scanner;

public class Exec1_Fulano {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
	    String nome, sobrenome;
		
		System.out.println("Digite seu nome : " ) ;
		nome = scanner.next();
		
		System.out.println("Digite seu sobrenome : " ) ;
		sobrenome = scanner.next();
		
		System.out.println(" Meu nome é : " + nome + " "+ sobrenome);
		
		scanner.close();
	}

}

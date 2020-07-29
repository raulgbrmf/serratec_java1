import java.util.Scanner;
public class NomeSobrenome {

	public static void main(String[] args) {
		String nome;
		String sobrenome;
		
		//entrada de dados
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		nome = entrada.next();
		
		System.out.println("Digite seu sobrenome: ");
		sobrenome = entrada.next();
		
		//saída de dados
		System.out.println("Seu nome completo é:  " + nome + "  " +sobrenome);
		

	}

}

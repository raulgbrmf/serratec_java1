package Java1;

import java.util.Scanner;

public class NomeSobreNome {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digites seu nome: ");
		String nome = entrada.nextLine();

		System.out.print("Digite seu Sobre nome: ");
		String sobreNome = entrada.nextLine();

		System.out.println("Seu nome é : " + nome + " " + sobreNome);
		
		entrada.close();

	}
}

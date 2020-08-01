package listaJava;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {

		Scanner saida = new Scanner(System.in);
		System.out.print("Insira seu nome: ");
		String nome = saida.next();

		System.out.print("Insira seu sobrenome: ");
		String sobrenome = saida.next();

		System.out.print("Meu nome é: " + nome + " " + sobrenome);

		saida.close();

	}
}

package experimento_aula;

import java.util.Scanner;

public class nome_sobrenome {
	public static void main(String[] args) { 
		Scanner ler=new Scanner (System.in);
		String nome;
		String sobrenome;
	
		System.out.printf("Digite seu nome: ");
		nome=ler.nextLine();
		System.out.printf("Digite seu sobrenome: ");
		sobrenome=ler.nextLine();
	
		System.out.println("Meu nome é: "+nome+" "+sobrenome);
	}	
}

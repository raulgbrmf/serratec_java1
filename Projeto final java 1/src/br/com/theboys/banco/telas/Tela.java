package br.com.theboys.banco.telas;

import java.io.FileNotFoundException;
import java.util.Scanner;

import br.com.theboys.banco.main.SistemaInterno;
import br.com.theboys.banco.util.LimpaTela;

public class Tela {
	static int opcao = 0;
	static Scanner scanner = new Scanner(System.in);

	public static void telaMenu() {

		try {
			do {

				System.out.println("O----------------------------O");
				System.out.println("|       BANCO THE BOYS       |");
				System.out.println("|----------------------------|");
				System.out.println("|       1 - Login            |");
				System.out.println("|       9 - Sair             |");
				System.out.println("O----------------------------O");
				System.out.print("|-> Escolha uma operação: ");

				opcao = scanner.nextInt();
				System.out.println("O----------------------------O");

				switch (opcao) {
				case 1:
					LimpaTela.limpa();
					SistemaInterno.login();
					break;
				case 9:
					System.out.println("|  Você saiu, volte sempre!  |");
					System.out.println("O----------------------------O");
					System.exit(0);
				default:
					System.out.println("|       Opção inválida!      |");
				}

			} while (opcao != 9);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

package br.com.caelum.contas.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/* Lendo arquivo utilizando scanner */
public class TesteLerArquivoComScanner {

	public static void main(String[] args) throws FileNotFoundException {
		File arquivo = new File("contas.txt");
		Scanner sc = new Scanner(arquivo);
		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
	}

}

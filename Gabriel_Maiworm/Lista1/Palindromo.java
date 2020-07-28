import java.util.Scanner;

public class Palindromo {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numero, soma, resto = 0;
		
		System.out.println("Digite um número: ");
		numero = scan.nextInt();
		soma = numero;
		
		for(int i = 0; i < 100;i ++) {    // Limpa tela
			System.out.println();
		}
		
		while (numero > 0) {
			resto = (resto * 10) + (numero % 10);
			numero = numero / 10;
		}
		if (resto == soma) {
			System.out.println("O número é um palindromo.");
		}
		else {
			System.out.println("O número não é um palindromo.");
		}
		scan.close();
	}

}

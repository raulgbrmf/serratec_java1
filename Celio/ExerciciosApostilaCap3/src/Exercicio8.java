import java.util.Scanner;

//Imprima	a	seguinte	tabela,	usando		for	s	encadeados:

public class Exercicio8 {

	public static void main(String[] args) {
		
		int numero, i, j, auxiliar=0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escreva o número de linhas que deseja imprimir: ");
		numero = scanner.nextInt();
		
		for(i=1; i<=numero; i++) {
			for(j=1; j<=i; j++) {
				auxiliar = j*i;
				System.out.print(auxiliar + " ");
			}
			auxiliar=0;
			
			System.out.println();
		}

	}

}

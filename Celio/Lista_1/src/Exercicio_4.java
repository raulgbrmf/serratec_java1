import java.util.Scanner;

public class Exercicio_4 {
	public static void main(String[] args) {
		
		int numero, i, j;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o número de colunas: ");
		numero = scanner.nextInt();
		scanner.close();
		
		for(i=1; i<=numero; i++) {
			for(j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.print("\n");
		}
	}

}

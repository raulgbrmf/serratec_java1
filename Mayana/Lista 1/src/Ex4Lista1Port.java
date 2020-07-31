import java.util.Scanner;

public class Ex4Lista1Port {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int linha, coluna, num;
		
		System.out.println("Digite um valor: ");
		num = scan.nextInt();
		
		for(linha = 1; linha <= num; linha++) {
			
			for(coluna = 1; coluna <= linha; coluna++) {
				System.out.print(coluna);				
			}
			System.out.println(" ");
		}

	}

}

import java.util.Scanner;

public class Lista1Exercicio4 {

	public static void main(String[] args) {
		
		int num, cont, col;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número: ");
		num = scan.nextInt();
		
		scan.close();
		
		for(cont=1; cont<=num; cont++) {
			
			for(col=1; col<=cont; col++) {
				
				System.out.print(col);
				
			}
			
			System.out.println();
		}
		
	}

}

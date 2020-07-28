import java.util.Scanner;

public class Lista1Exercicio3 {

	public static void main(String[] args) {

		int num, cont, soma = 0;
		Scanner scan = new Scanner(System.in);
			
		
		System.out.println("Digite um número: \n");
		num = scan.nextInt();
		
		
		scan.close();
		
		if(num % 2 ==0) {
			
			System.out.println("\nO número " + num + " é par");
		}

		else {
			System.out.print("\n");
			
			for(cont = 0; cont <= num ; cont++) {
				
				if (cont % 2 != 0) {
					
					System.out.print(cont + " ");
					
					soma += cont;
				}
				
				
			}
			System.out.println("A soma dos número ímpares naturais até " + num + " é: " + soma);
		}
		
	}

}

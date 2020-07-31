import java.util.Scanner;

public class Ex3Lista1Port {

	public static void main(String[] args) {
		
		int qt;
		int contImpares = 0;
		int cont = 0;
		int soma = 0;
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Número de entrada é: ");
		qt = scan.nextInt();
		
		while(contImpares < qt) {
			if(cont % 2 != 0) {
				contImpares ++;
				System.out.println(cont);
				soma = soma + cont;
			}	
			cont++;
			
		}
		System.out.println("A soma dos numeros ímpares naturais até " + qt + " é: " + soma);
	}

}

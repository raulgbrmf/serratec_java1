import java.util.Scanner;

public class Exercicio3lista1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		int num1, i , numimpar, soma;
		
		System.out.println("Digite a quantidade de numero impares: ");
		num1 = scan.nextInt();
		
		System.out.println("Os números ímpares são: ");
		
		numimpar = 1;
		soma = 1;
		
		System.out.println(numimpar);
		
		for (i = 1; i<num1; i++) {
			numimpar = numimpar + 2;
			System.out.println(numimpar);
			soma = soma + numimpar;
			
		}
		
		System.out.println(" A soma dos impares até " + num1 + " é : " + soma );
		
		

	}

}

import java.util.Scanner;
public class Lista1_Exercicio5 {
	public static void main(String[]args) {
		
		int n, rev = 0, aux;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero para saber se é Palindromo: ");
		n = scan.nextInt();
		
		aux = n;
		
		while(aux!=0) {
			rev = aux%10 + rev*10;
			aux = aux /10;	
		}
		System.out.println(rev);
		
		if(rev == n) {
			System.out.print("O numero é um Palindromo.");}
			else {System.out.print("O numero não é Palindromo.");}
		
	}
}


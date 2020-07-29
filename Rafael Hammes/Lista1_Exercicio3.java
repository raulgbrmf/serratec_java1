import java.util.Scanner;
public class Lista1_Exercicio3 {
	public static void main(String[]args) {
		
		int n, soma=0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		n = scan.nextInt();
		
		for(int i=1; i<=n;i++) {
			
			if (i%2==1) {
				
				System.out.println(i);
				soma = soma + i;
			}
		}
		System.out.print("A soma dos números ímpares é: " + soma);
	}
}

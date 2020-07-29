import java.util.Scanner;
public class Lista1_Exercicio4 {
	public static void main(String[]args) {
		
		int n;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		n = scan.nextInt();
		
		for (int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				
				System.out.print(j);
				
			}
			System.out.println();
		}
	}
}

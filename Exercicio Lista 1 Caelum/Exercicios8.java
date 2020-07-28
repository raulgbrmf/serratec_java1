import java.util.Scanner;

public class Exercicios8 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int num,i,j;
		
		System.out.print("Digite um número: ");
		num = ler.nextInt();
		ler.close();
		
		for(i=1;i<=num;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j*i+" ");
			}
			System.out.println();
		}

	}

}

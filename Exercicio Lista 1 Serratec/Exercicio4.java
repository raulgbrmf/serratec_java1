import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		int num,i,t;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		num = ler.nextInt();
		ler.close();
		
		for(i=1;i<=num;i++) {
			for(t=1;t<=i;t++)
				System.out.print(t);
			System.out.println();
		}
	}

}

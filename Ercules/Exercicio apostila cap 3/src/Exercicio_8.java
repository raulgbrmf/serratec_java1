import java.util.Scanner;

public class Exercicio_8 {

	public static void main(String[] args) {

		int num;
		Scanner leia = new Scanner(System.in);
		num = leia.nextInt();
		
		int a = 1;
		
		for(int i = 1; i <= num; i++) {
			
			for(a = 1; a <= i; a++) {
				
				System.out.print(" " + a*i);
				
			}
			
			System.out.println(" ");
		
		}

		leia.close();
	
	}
}

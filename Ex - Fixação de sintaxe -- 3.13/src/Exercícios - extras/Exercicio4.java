import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int numero;
		
		numero = scan.nextInt();
		
		for(int i = 1; i <= numero; i++){
			//System.out.println(i);
				
			for(int j = 1; j <= i; j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

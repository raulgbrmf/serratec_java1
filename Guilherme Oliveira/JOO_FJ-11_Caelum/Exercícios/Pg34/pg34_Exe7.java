package Pg34;
import java.util.Scanner;
public class pg34_Exe7 {

	public static void main(String[] args) {				
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Digite um número:");
	    int x = scan.nextInt();
		scan.close();
		
		while (x > 1) {

			if (x % 2 == 0) {
				x = x / 2;

				if (x == 1) {
					System.out.print(x);
				} else {
					System.out.print(x + "->");
				}

			} else {
				x = 3 * x + 1;

				if (x == 1) {
					System.out.print(x);
				} else {
					System.out.print(x + "->");
				}

			}
		}	    
	}
}

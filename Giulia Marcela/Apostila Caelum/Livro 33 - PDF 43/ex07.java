package caelum;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um valor inteiro: ");
        int x = scan.nextInt();
        
        while(x != 1) {
            if(x % 2 == 0){
                x = x / 2;
                System.out.print(x + " => ");
            }
            else if(x % 2 != 0){
                x = 3 * x + 1;
                System.out.print(x + " => ");
            }
        }
        scan.close();
	}
}

package experimento_aula2;

import java.util.Scanner;
public class Opcional_7_pag_34 {
	public static void main (String[]args) {
		Scanner ler = new Scanner(System.in);
		int x;
		
		System.out.printf("Escreva um valor de uma variável inteira: ");
		x=ler.nextInt();
		
		while(x!=1) {
			if (x%2==0) {
				x=x/2;
			}else {
				x=3*x+1;
			}
			System.out.printf(x+" ->");
		}
		ler.close();
	}

}
	

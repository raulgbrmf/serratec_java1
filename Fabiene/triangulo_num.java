package experimento_aula;

import java.util.Scanner;

public class triangulo_num {
	public static void main(String[] args) { 
		Scanner ler=new Scanner (System.in);
		int contador;
		int contador2;
		int num;
	
		System.out.printf("Digite um número: ");
		num=ler.nextInt();
		
		for(contador=1; contador<=num; contador++) {
			for(contador2=1; contador2<=contador; contador2++) {
				System.out.printf(contador2+"");
			}
			System.out.printf("\n");
		}
		
	}
}


	
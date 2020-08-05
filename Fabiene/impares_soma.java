package experimento_aula;

import java.util.Scanner;

public class impares_soma {
	public static void main(String[] args) { 
		Scanner ler=new Scanner (System.in);
		int contador=1;
		int contador2=1;
		int soma=0;
		int num;
	
		System.out.printf("Número de entrada: ");
		num=ler.nextInt();
		System.out.println("Os números ímpares são: ");
		
		while ((contador<=num) || (contador2<=num)) {
			System.out.println(contador);
			soma=soma+contador;
			contador=contador+2;
			contador2=contador2+1;
					
		}
		
		System.out.printf("A soma dos "+num+" primeiros números impares naturais é: "+(soma));			
	}	
}

		


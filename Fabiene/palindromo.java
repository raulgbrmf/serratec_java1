package experimento_aula;

import java.util.Scanner;

public class palindromo {
	public static void main(String[] args) { 
		Scanner ler=new Scanner (System.in);
		int num;
		int num2;
		int resto=0;
	
		System.out.printf("Digite um número: ");
		num=ler.nextInt();
		num2=num;
		
		while(num2!=0) {
			resto=resto*10+num2%10;
			num2=(num2/10);		
		}
		if(resto==num) {
			System.out.println(num+" é um palindromo");
		}
		else {
			System.out.println(num+" não é um palindromo");
		}
	}	
}
	

	
	
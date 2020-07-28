package exercicios.lista1;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {

		int numero,numero_auxiliar, numero_reverso = 0;
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
 		numero= read.nextInt();

 		numero_auxiliar = numero;
 		
  		while (numero_auxiliar != 0) {
   			numero_reverso =  numero_reverso * 10 + numero_auxiliar % 10;		
   			numero_auxiliar = numero_auxiliar / 10 ;
 		}

  		if ( numero_reverso == numero){
    			System.out.println(numero +" é um número palindrome\n");
  		}
  		else{
   	     	System.out.println(numero +" não é um número palindrome\n");
  		}
  		
  		read.close();

	}

}

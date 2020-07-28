//Escreva um programa que receba a temperatura em Celsius e retorne o valor em Fahrenheit  
//Exemplo :  Entrada​: Digite o valor da temperatura em Celsius : 10 
//Saída​: 10 graus Celsius é o mesmo que 50 graus Fahrenheit

//LEIA
//OBS: FIZ O TESTE COM DOUBLE POREM 
//O RESULTADO SAI COM MUITAS CASAS DPS DA VIRGULA 
//PREFERI DEIXAR INT

import java.util.Scanner;
public class Exercicio_2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int cel;
		int fah = 0;
		
		System.out.println("Digite o valor da temperatura em Celsius: ");
		cel = scanner.nextInt();
		
		scanner.close();
		
		fah = (cel * 9/5) + 32;
		
		System.out.println(cel + " graus Celsius é o mesmo que " + fah + " graus Fahrenheit.");
		
	}

}

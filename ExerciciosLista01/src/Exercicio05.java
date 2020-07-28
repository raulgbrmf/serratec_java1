import java.util.Scanner;
public class Exercicio05 {
	/*5 - Escreva um programa que verifique se um número é um palíndromo ou não.
	Exemplo de entrada :
	12321
	Saída esperada:
	12321 é um número palíndromo*/
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numero1;
		int numero2;
		int numero3 = 0;
		
		System.out.printf("Insira um número: ");
		numero1 = scan.nextInt();
		
		numero2 = numero1;
		
		while(numero2 != 0) {
			numero3 = numero3 * 10 + (numero2 % 10);
			numero2 = (numero2 / 10);
		}
		
		if(numero3 == numero1) {
			System.out.println(numero1 + " é um palíndromo. ");
		}
		else {
			System.out.println(numero1 + " não é um palíndromo. ");
		}
	
	scan.close();
	}

}

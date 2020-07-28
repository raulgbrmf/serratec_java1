import java.util.Scanner;
public class Exercicio03 {
	/*3 - Escreva um programa em Java para exibir os n termos do número natural ímpar e sua
	soma.
	Exemplo de entrada :
	Número de entrada é : 5
	Saída esperada:
	Os números ímpares são :
	1
	3
	5
	7
	9
	A soma dos números ímpares naturais até 5 é : 25*/
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int contador=0;
		int impar=1;
		int soma;
		int n;
		
		System.out.printf("Número de entrada é: ");
		n = scan.nextInt();
		
		while(contador<n) {
			System.out.println(" " + impar);
			impar = impar +2;
			contador = contador + 1;	
		}
		soma = n * n;
		System.out.println("A soma dos números impares naturais é: " + soma);
		scan.close();
	}

}

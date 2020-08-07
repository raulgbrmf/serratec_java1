import java.util.Scanner;
public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numero;
		
		System.out.println("Informe um número: ");
		numero = scanner.nextInt();
		System.out.print(numero);
		
		while(numero > 1) {
			if(numero%2 ==0) {
				numero = numero/2;
				System.out.print(" -> " + numero);
			}
			else {
				numero = 3*numero + 1;
				System.out.print(" -> " + numero);
			}
		}
		
		
		scanner.close();

	}

}

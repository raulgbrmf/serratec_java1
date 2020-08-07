import java.util.Scanner;

public class Exercicio_5 {
	public static void main(String[] args) {
		
		int numero, aux=0, salvo;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o número desejado: ");
		numero = scanner.nextInt();
		scanner.close();
		salvo=numero;
		
		while(numero > 0) {
			aux = aux*10 + numero%10;
			numero= numero/10;
			
		}
		if(aux == salvo) {
			System.out.print("O número: "+ salvo + " é um palíndromo.");
		}
		else {
			System.out.print("O número: "+ salvo + " não é um palíndromo.");
		}
		
	}

}

import java.util.Scanner;
public class Exercicio_3 {
	public static void main(String[] args) {
		
		int numero, aux=1, aux2=0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o número até onde deseja contar: ");
		numero = scanner.nextInt();
		scanner.close();
		while(numero>aux) {
			System.out.println(aux);
			aux2 = aux2 + aux;
			aux = aux+2;
			
		}
		
		System.out.print("A soma dos valores ímpares é: " + aux2 + ".");
	}

}

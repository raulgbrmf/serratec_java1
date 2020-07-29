import java.util.Scanner;
public class Palindromo {

	public static void main(String[] args) {
		int num; // n�mero dado
		int aux; // guarda a parte do n� que resta inverter 
		int reverso; // guarda o n� de tr�s pra frente
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		num = scan.nextInt();
		
		//inicializando
		aux = num;
		reverso = 0;
		
		while(aux != 0) {
			reverso = reverso * 10 + aux % 10; // acrescenta mais um d�gito a direita
			aux = aux / 10; // retira esse d�gito
		}
		
		if (reverso == num) {
		System.out.printf("N�mero � pal�ndromo ", num);
		
		}else {
			System.out.printf("N�o � pal�ndromo ", num);
		}
	}
}
	

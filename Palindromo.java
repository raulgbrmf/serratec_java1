import java.util.Scanner;
public class Palindromo {

	public static void main(String[] args) {
		int num; // número dado
		int aux; // guarda a parte do nº que resta inverter 
		int reverso; // guarda o nº de trás pra frente
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		num = scan.nextInt();
		
		//inicializando
		aux = num;
		reverso = 0;
		
		while(aux != 0) {
			reverso = reverso * 10 + aux % 10; // acrescenta mais um dígito a direita
			aux = aux / 10; // retira esse dígito
		}
		
		if (reverso == num) {
		System.out.printf("Número é palíndromo ", num);
		
		}else {
			System.out.printf("Não é palíndromo ", num);
		}
	}
}
	

import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int aux;
		int resto;
		int num_invertido = 0;

		numero = scan.nextInt();

		for(aux = numero; numero != 0; numero = numero / 10){

			resto = numero % 10;
			num_invertido = (num_invertido * 10) + resto;
		}
		if(num_invertido == aux){
			System.out.print(aux + " é um número palíndromo");
		}
		else{
			System.out.print(aux + " não é um número palíndromo");
		}
		
		
	}

}

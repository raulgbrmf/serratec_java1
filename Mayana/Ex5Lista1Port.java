import java.util.Scanner;

public class Ex5Lista1Port {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num, resto, aux;
		int n_invertido = 0;
		
		
		System.out.println("Digite um número: ");
		num = scan.nextInt();
		aux = num;
		while(aux!= 0) {
			resto = aux % 10;
			n_invertido = (n_invertido + resto) * 10;
			aux = aux/10;
			//System.out.println("Resto: " + resto);
			//System.out.println("invertido: " + n_invertido);
			//System.out.println("aux: " + aux);
		}
		n_invertido = n_invertido/10;
		//System.out.println("invertido Final: " + n_invertido);
		if(num == n_invertido) {
			System.out.println(num + " é um número palíndromo.");
		}
		else {
			System.out.println(num + " não é um número palíndromo");
		}
		

	}

}

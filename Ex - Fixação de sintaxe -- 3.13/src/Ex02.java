//import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {
		
		int soma = 0;
		int contador = 1;
		
		while(contador <= 10) {
			
			System.out.print(contador);
			soma += contador;
			contador++;
		}
		System.out.println("\n");
		System.out.println(soma);
	}

}

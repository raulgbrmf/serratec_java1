import java.util.Scanner; 
public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int aux = 0;
		int resultado = 0;
		int soma = 0;
		
		System.out.print("Número de entrada é : ");
		numero = scan.nextInt();
		
		for (int c = 0; c < numero; c++) {
			aux = c;
			resultado = c + (aux +1);
			soma = soma + resultado;
			 
			System.out.println(resultado);
			
			
		}
		System.out.print("A soma dos números ímpares naturais até " + numero + " é : " + soma);
	}
}

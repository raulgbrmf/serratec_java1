import java.util.Scanner;
public class Tabuada {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero, resultado, contador;
		
		System.out.printf("Informe o número da tabuada: ");
		numero = scan.nextInt();
		
		for (contador = 1; contador <= 10; contador++) {
			resultado = numero * contador;
			System.out.println(numero +" x "+ contador + " = " + resultado);
		
		scan.close();
		}

	}

}

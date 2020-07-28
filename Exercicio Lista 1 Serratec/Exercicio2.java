import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		float temp;
		
		System.out.print("Digite uma temperatura em °C: ");
		temp = ler.nextFloat();
		ler.close();
		System.out.println(temp+"°C convertido em "+(temp*1.8+32)+"°F");

	}

}

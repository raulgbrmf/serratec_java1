package EstudoInterface;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Digite a metragem lateral da casa: ");
		double metros = new Scanner(System.in).nextDouble();
		
		AreaCalculavel casa = new CasaSimples(metros);
		System.out.println("Aárea da casa é " + casa.calculaArea());
		
		

	}

}

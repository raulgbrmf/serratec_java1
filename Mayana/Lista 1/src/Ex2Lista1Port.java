import java.util.Scanner;

public class Ex2Lista1Port {

	public static void main(String[] args) {
		
		int celsius , fahr;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		celsius = scan.nextInt();
		
		fahr = ((celsius * 9/5) + 32);
		
		System.out.println(celsius + " graus Celsius é o mesmo que " + fahr + " graus Fahrenheit.");

	}

}

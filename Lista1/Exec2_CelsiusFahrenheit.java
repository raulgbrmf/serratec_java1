
	import java.util.Scanner;

public class Exec2_CelsiusFahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		double c, f;
		
		System.out.println("Digite o valor da temperatura em Celsius : " ) ;
		c = scanner.nextDouble();
	    
		f = (c * 1.8) +  32;
		
		System.out.println( c + " graus Celsius é o mesmo que  " + f + " Fahrenheit. "  ) ;
	
		scanner.close();
	}
	

}

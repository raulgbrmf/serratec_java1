
 import java.util.Scanner;

public class Exec5_Palindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int n,aux, aux2 = 0;
		
		System.out.println(" Digite um número : " ) ;
		 n = scanner.nextInt();
		 
		 aux = n ;
		 
		 while ( aux !=0)
		 {
			 aux2 = (aux2 * 10 + aux % 10);
			 aux = aux/10;
		 }
		 if (aux2 == n)
		 {
			 System.out.println( n + " " + " é um palíndromo. ") ;
		 }
		 
		 else
		 {
			 System.out.println( n + " " + "  não é um palíndromo. "); 
		 }	 
		 scanner.close();
				
	}

}

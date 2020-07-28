
    import java.util.Scanner;

public class Exec4_Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int n,i,j;
		
		System.out.println(" Digite um número : " ) ;
		 n = scanner.nextInt();
		 
		 for (i=1 ; i<=n; i++)
		 { 
			 for(j=1; j<=i; j++)
			 {
				System.out.print(j) ; 
			 }
			 System.out.println();
		 }
		 scanner.close();
	}

}

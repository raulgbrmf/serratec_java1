import java.util.Scanner;
public class ÍmparesSoma {

	public static void main(String[] args) {
		double soma = 0;
	    double i;
	    
	    Scanner scanner = new Scanner(System.in);
	    
	    for(i = 1; i < 6; i++) {
	    	System.out.println("Digite um número ");
	    	double numero = scanner.nextDouble();
	    	
	    	if((numero / 2 != 0));
	    	soma = soma + numero;
	    }
	    
	    System.out.println("A soma dos números ímpares é:  " +soma);
		

	}

}

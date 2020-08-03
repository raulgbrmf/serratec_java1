import java.util.Scanner;

public class Lista_1_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);	
		System.out.print ("Digite um número: ");
		int numero = scan.nextInt();
        int resto, aux = numero;
        int inverso = 0;
           	while(numero != 0) {
        		resto = numero % 10;
        		inverso = inverso * 10 + resto;
        		numero = numero/10;
        	}    
        		if(inverso == aux){
        			System.out.print(aux + " é um número palíndromo.");
        		}
        		else {
        			System.out.print(aux + " não é um palíndromo.");
        		}
        scan.close();  	
    }
}	

		
		
		



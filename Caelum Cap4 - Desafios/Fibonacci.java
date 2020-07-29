
public class Fibonacci {
	 	
	 	/*int calculaFibonacci (int numero) {
	 		
	 		if (numero < 2 ) {
	 			return numero;
	 		}
	 		else {
	 			
	 		}
			return calculaFibonacci(numero - 1) + calculaFibonacci( numero -2);
	 	}*/
	
	    //Fibonacci 1 linha 
	
		int calculaFibonacci(int num) {
		
			return (num < 2 ? num : (calculaFibonacci(num - 1) + calculaFibonacci (num - 2)));
	}
}
